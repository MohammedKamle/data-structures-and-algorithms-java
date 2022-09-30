package leetcode.trees;

import leetcode.trees.definition.TreeNode;
// height of a binary tree
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return 1 + Math.max(l, r);
    }
}
