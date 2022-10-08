package leetcode.trees;

import leetcode.trees.definition.TreeNode;

//https://www.youtube.com/watch?v=73PQ9raLEVs&ab_channel=Vivekanand-AlgorithmEveryDay

public class SubTreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot==null){
            return true; // as null is always a subtree of any given tree (leafNode.left and leafNode.right)
        }
        // as control comes here that means subRoot is not null, so if root is null that means they are different
        if (root==null){
            return false;
        }
        if (isSameTree(root,subRoot)){
            return true;
        }
        return (isSubtree(root.left,subRoot)) || (isSubtree(root.right,subRoot));
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return (p == q);
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
