package com.bhoomi;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Jan09 {
    public static void main(String[] args) {

    }

    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    static void preorder(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

//following code will work on leetcode as they have given in built code in the solution regarding this

//        ans.add(root.val);
//        preorder(root.left, ans);
//        preorder(root.right, ans);
    }
}
