package com.ljk.LintCode.Easy;

import java.util.ArrayList;

public class maxNode {


    /**
     * Definition of TreeNode:
     * public class TreeNode {
     * public int val;
     * public TreeNode left, right;
     * public TreeNode(int val) {
     * this.val = val;
     * this.left = this.right = null;
     * }
     * }
     */


    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        int max = 0;

        // 存储遍历对象的数组
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        result.add(root);
        search(root, result);

        return result.get(0);
    }

    // 传入根节点 数组
    public void search(TreeNode root, ArrayList<TreeNode> result) {
        if (root == null) {
            return;
        }
        // 比较根节点和数组保存的结果
        if (result.get(0).val < root.val) {
            result.set(0, root);
        }
        if (root.left != null) {
            search(root.left, result);
        }
        if (root.right != null) {
            search(root.right, result);
        }
    }

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

}
