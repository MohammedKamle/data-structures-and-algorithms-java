package sorting_algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    //https://www.youtube.com/watch?v=h8eyY7dIiN4&t=307s
    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex>=highIndex){
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer<rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }


    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i=0; i< arr.length; i++){
            arr[i] = random.nextInt(20);
        }
        System.out.println("??????BEFORE???????");
        System.out.println(Arrays.toString(arr));
        System.out.println("array length is "+arr.length);
        quickSort(arr, 0, arr.length-1);
        System.out.println("??????AFTER???????");
        System.out.println(Arrays.toString(arr));
    }
}
