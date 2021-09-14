package bigO;

import java.util.Arrays;

public class ReversingArray {

    public static final void reverseArray_(int[] arr){
        for (int i =0; i<(arr.length)/2; i++){
            System.out.println(i);
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArray_(array);
    }

    /*
    * Time Complexity : O(n)
    * */
}
