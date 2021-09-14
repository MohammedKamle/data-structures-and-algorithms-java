package arrays.codingExcercises;

import java.util.Arrays;

/*Coding exercise - 18*/
public class EliminateFirstAndLast {
    static int[] middle(int[] arr) {
        int[] arr2 = new int[arr.length-2];
        for (int i =0 ; i<arr.length;i++){
            if (i== 0 || i==(arr.length)-1){
               continue;
            }
            arr2[i-1] = arr[i];
        }
        return arr2;
    }

    // INSTRUCTOR APPROACH
    static int[] middle_(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }




    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(middle_(arr)));
    }
}
