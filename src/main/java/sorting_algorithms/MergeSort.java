package sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
    // https://www.youtube.com/watch?v=bOk35XmHPKs
    // instructor has not retured the array, little modification from my end
    private static int[] mergeSort(int[] inputArray){
        int inputArrayLength = inputArray.length;
        // recursive condition, if there is only one element array left(of size 1) after dividing the array
        if (inputArrayLength < 2 ){
            return inputArray;
        }
        int midIndex = inputArrayLength/2;
        // dividing the array into two sub arrays
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArrayLength-midIndex];

        // filling the elements
        for (int i=0; i<midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        for (int i= midIndex; i<inputArrayLength; i++){
            rightHalf[i-midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // merging
        return merge(inputArray, leftHalf, rightHalf);
    }

    private static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftHalfSize = leftHalf.length;
        int rightHalfSize = rightHalf.length;
        int leftHalfIterator=0, rightHalfIterator=0, inputArrayIterator=0;
        while(leftHalfIterator<leftHalfSize && rightHalfIterator<rightHalfSize){
            if (leftHalf[leftHalfIterator] <= rightHalf[rightHalfIterator]){
                inputArray[inputArrayIterator] = leftHalf[leftHalfIterator];
                leftHalfIterator++;
            }else {
                inputArray[inputArrayIterator] = rightHalf[rightHalfIterator];
                rightHalfIterator++;
            }
            inputArrayIterator++;
        }
        // to fill remaining elements
        while (leftHalfIterator <leftHalfSize){
            inputArray[inputArrayIterator] = leftHalf[leftHalfIterator];
            inputArrayIterator++;
            leftHalfIterator++;
        }
        while (rightHalfIterator<rightHalfSize){
            inputArray[inputArrayIterator] = rightHalf[rightHalfIterator];
            inputArrayIterator++;
            rightHalfIterator++;
        }
        return inputArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{62,5,4,34,2,1,1,1,5,7,8,5})));
    }
}
