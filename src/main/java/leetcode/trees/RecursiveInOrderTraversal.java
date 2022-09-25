package leetcode.trees;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//  left root right
public class RecursiveInOrderTraversal {
    List<Integer> inOrderList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return inOrderList;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        inOrderList.add(root.val);
        traverse(root.right);
    }
}
