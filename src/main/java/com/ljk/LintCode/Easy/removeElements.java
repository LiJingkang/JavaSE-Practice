package com.ljk.LintCode.Easy;

public class removeElements {


    /**
     * Definition for ListNode
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here

        if (head == null) {
            return head;
        }

        ListNode cur = head;
        ListNode nex = head.next;

        // 查询第一个节点
        while (nex != null) {
            if (nex.val == val) {
                cur.next = nex.next;
                nex = nex.next;
            } else {
                cur = cur.next;
                nex = nex.next;
            }
        }

        if (head.val == val) head = head.next;

        return head;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
