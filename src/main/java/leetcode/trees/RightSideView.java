package leetcode.trees;

import leetcode.trees.definition.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.youtube.com/watch?v=jCqIr_tBLKs&ab_channel=KevinNaughtonJr.

/**
 * Below problem is based on level order traversal, refer that first
 * */
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null){
            return resultList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode curr = queue.remove();
                if (i == queueSize - 1) {
                    resultList.add(curr.val);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return resultList;
    }
}
