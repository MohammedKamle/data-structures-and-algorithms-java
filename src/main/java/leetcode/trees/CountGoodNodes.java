package leetcode.trees;

import leetcode.trees.definition.TreeNode;


// see neetcode video
public class CountGoodNodes {
    int result = 0;

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }


    public int dfs(TreeNode root, int currMaxVal) {
        if (root == null) {
            return 0;
        }
        if (root.val >= currMaxVal) {
            result =  1;
        } else {
            result =  0;
        }
        currMaxVal = Math.max(currMaxVal, root.val);
        result += dfs(root.left, currMaxVal);
        result += dfs(root.right, currMaxVal);
        return result;
    }
}
