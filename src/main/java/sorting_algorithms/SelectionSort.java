package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

    private static int[] selectionSort(int[] array){
        for (int i=0; i< array.length; i++){
            int minValueIndex = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j]<array[minValueIndex]){
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i){
                int temp = array[i];
                array[i] = array[minValueIndex];
                array[minValueIndex] = temp;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{56,7,6,56,89,908,90,5,3,1,2,4,55,66,77,86,1})));
    }
}
