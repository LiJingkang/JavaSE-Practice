package com.ljk.LintCode.Easy;

public class countNodes {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here

        int sum = 1;

        if (head == null) return 0;

        ListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            sum++;
        }
        return sum;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
