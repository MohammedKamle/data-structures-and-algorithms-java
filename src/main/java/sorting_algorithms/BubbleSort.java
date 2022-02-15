package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        // first for loop is for no. of passes
        for (int i=0; i< array.length-1;i++){
            for (int j=0; j< array.length; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {56,7,6,56,89,908,90,5,3,1,2,4,55,66,77,86,1};
        System.out.println(Arrays.toString(bubbleSort(array1)));
    }


}
