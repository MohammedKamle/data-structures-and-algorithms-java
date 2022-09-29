package leetcode.trees.traversals;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// root left right
public class IterativePreOrderTraversal {

    /**
     * Here we need to use a stack, push the root first, iterate while the stack is empty, in the loop pop out the
     * element from stack, add its value inside the pre-order-list and along the way push the right and left nodes in the
     * stack if they exist <p>
     *     In the loop we are pushing right node first and then left because then the left node will be at the top,
     *     whose date will be added in the pre-order-list first according to pre-order-traversal (root, left, right)
     *
     * */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        if (root == null) {
            return preOrderList;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            preOrderList.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return preOrderList;
    }
}
