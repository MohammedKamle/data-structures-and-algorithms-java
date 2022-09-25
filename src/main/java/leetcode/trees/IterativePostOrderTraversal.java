package leetcode.trees;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// left right root
public class IterativePostOrderTraversal {

    /**
     * Take two stacks, s1 and s2 by pushing root to s1<p></p>
     *
     * Now, iterate while s1 is empty by popping the value out of s1 and pushing it to s2 and push root.left  &
     * and root.right to s1 if left and right are not null<p></p>
     *
     * Finally, empty all of s2 while adding the values in postOrderList
     * */

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        if (root == null) {
            return postOrderList;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            if (root.left != null) {
                s1.push(root.left);
            }
            if (root.right != null) {
                s1.push(root.right);
            }
        }
        while (!s2.isEmpty()){
            postOrderList.add(s2.pop().val);
        }
        return postOrderList;
    }
}
