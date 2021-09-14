package arrays.codingExcercises;

import java.util.Arrays;

/*
 *  Coding exercise - 22
 * */
public class RemoveDuplicates {

    // My approach - don't refer instructor's approach, its confusing
    public static int[] removeDuplicates(int[] arr) {
        // Sorting the array
        Arrays.sort(arr);
        // Counting distinct elements
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            while ((i < arr.length - 1) && (arr[i] == arr[i + 1])) {
                i++;
            }
            c++;
        }
        // adding distinct elements in a new array
        int[] distinctElementsArray = new int[c]; // creating an array with size equals number of distinct elements in a given array
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while ((i < arr.length - 1) && (arr[i] == arr[i + 1])) {
                i++;
            }
            if (j < distinctElementsArray.length) {
                distinctElementsArray[j++] = arr[i];
            }
        }
        return distinctElementsArray;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,1,5,6,2,7,9};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
