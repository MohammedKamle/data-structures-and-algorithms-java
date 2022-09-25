package leetcode.trees;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// root left right
public class RecursivePreOrderTraversal {
    List<Integer> preOrderList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return preOrderList;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderList.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
