package leetcode.trees.traversals;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// left root right
public class IterativeInOrderTraversal {

    /**
     * Initialize a stack and a temp tree-node with value as root, iterate while the stack is  empty
     * , do temp -> temp.left unless found null while pushing the current temp to stack,
     * if null, pop out the element from stack, add to inorder list and do temp->temp.right
     *
     */

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (true) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                if (stack.isEmpty()){
                    break;
                }
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.right;
            }
        }
        return list;
    }
}
