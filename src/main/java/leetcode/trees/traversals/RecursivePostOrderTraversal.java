package leetcode.trees.traversals;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// left right root
public class RecursivePostOrderTraversal {

    List<Integer> postOrderList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return postOrderList;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        traverse(root.right);
        postOrderList.add(root.val);
    }
}
