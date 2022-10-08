package leetcode.trees;

import leetcode.trees.definition.TreeNode;

public class SameTree {

    // we can check if the trees are same by applying any traversals
    // we will solve this by pre-order traversal (root left right)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return (p == q);
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

