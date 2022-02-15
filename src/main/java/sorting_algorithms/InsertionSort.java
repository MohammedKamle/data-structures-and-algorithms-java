package sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {

    private static int[] insertionSort(int[] array){
        for (int i=1; i<array.length; i++){
            int temp = array[i];
            int j = i;
            while (j >0 && array[j-1]>temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{6,5,4,3,2,1})));
    }
}
