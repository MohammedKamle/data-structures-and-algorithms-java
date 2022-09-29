package leetcode.trees;

import leetcode.trees.definition.TreeNode;

//https://www.youtube.com/watch?v=opxuvlAgyaM&ab_channel=jayatitiwari

public class DiameterOfBinaryTree {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans == 0 ? 0 : ans - 1;// (ans-1) as length will be no. of nodes-1
    }

    private int getDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);
        ans = Math.max(ans, (l + r + 1));// updating ans to have max ans, as dia can or cannot go through root
        return 1 + Math.max(l, r);

    }
}
