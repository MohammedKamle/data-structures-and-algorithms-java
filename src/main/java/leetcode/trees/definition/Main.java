package leetcode.trees.definition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        ArrayList<Integer> inOrderList = new ArrayList<>();
        new TreeTraversal().inOrderTraversal(root, inOrderList);
        System.out.println(inOrderList);

        ArrayList<Integer> preOrderList = new ArrayList<>();
        new TreeTraversal().preOrderTraversal(root, preOrderList);
        System.out.println(preOrderList);

        ArrayList<Integer> postOrderList = new ArrayList<>();
        new TreeTraversal().postOrderTraversal(root, postOrderList);
        System.out.println(postOrderList);




    }
}
