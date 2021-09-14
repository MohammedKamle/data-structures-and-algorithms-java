package arrays.codingExcercises;

import java.util.Arrays;

/*
* Coding exercise - 17
* */
public class RotateMatrix {

    // My approach - less efficient - O(n^2) also space complx as creating another matrix
    static int[][] rotateMatrix(int[][] matrix) {
        int arr2[][] = new int[matrix.length][matrix.length];

        for (int i=0; i<matrix.length; i++){
            int k = matrix.length-1;
            for (int j=0; j<matrix.length; j++){
                arr2 [i][j] = matrix[k][i];
                k--;
            }
        }
        return  arr2;
    }


    // More efficient approach, less space complx
    static int[][] rotateMatrix_(int[][] matrix) {
        // Getting transpose of a matrix
       for (int i =0; i<matrix.length;i++){
           for (int j=i; j< matrix[0].length;j++){
               int temp = 0;
               temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
    // Reversing rows
       for (int i=0; i<matrix.length; i++){
           int k = matrix.length-1;
           for (int j=0; j<matrix[0].length/2;j++){
               int temp = 0;
               temp = matrix[i][j];
               matrix[i][j] = matrix[i][k];
               matrix[i][k] = temp;
               k--;
           }
       }
       return matrix;

       // reversing row approach 2
//        for (int i=0; i<matrix.length; i++){
//            for (int j=0; j<matrix[0].length/2;j++){
//                int temp = 0;
//                temp = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix.length-1-j];
//                matrix[i][matrix.length-1-j] = temp;
//            }
//        }
//        return matrix;
    }


    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.deepToString(rotateMatrix_(mat)));
    }
}
