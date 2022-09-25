package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {

    public void preOrderTraversal(TreeNode currentNode, ArrayList<Integer> preOrderList) {
        if (currentNode == null) {
            return;
        }
        preOrderList.add(currentNode.val);
        preOrderTraversal(currentNode.left, preOrderList);
        preOrderTraversal(currentNode.right, preOrderList);
    }

    public void inOrderTraversal(TreeNode currentNode, ArrayList<Integer> inOrderList) {
        if (currentNode == null) {
            return;
        }
        inOrderTraversal(currentNode.left, inOrderList);
        inOrderList.add(currentNode.val);
        inOrderTraversal(currentNode.right, inOrderList);
    }

    public void postOrderTraversal(TreeNode currentNode, ArrayList<Integer> postOrderList) {
        if (currentNode == null) {
            return;
        }
        postOrderTraversal(currentNode.left, postOrderList);
        postOrderTraversal(currentNode.right, postOrderList);
        postOrderList.add(currentNode.val);
    }



}
