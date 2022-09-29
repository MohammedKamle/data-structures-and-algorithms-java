package leetcode.trees.traversals;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

     /**
      * Here, we need to add each level of the tree inside the queue one by one, iterate over each element in the level
      *  in queue by adding them inside a sublist, add sub-list after each iteration in the main list<p>
      * Sub-list represents each level of the tree
      **/

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        // adding the root in queue
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            // Iterating over each level in queue
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            resultList.add(subList);
        }
        return resultList;
    }
}
