package searching_algorithms;

import java.util.Arrays;

// this only works for sorted lsit
public class BinarySearch {

    private static int binarySearch(int[] sortedArray, int key){
        int leftPointer=0;
        int rightPointer=sortedArray.length-1;
        int middlePointer = (leftPointer + rightPointer)/2;

        while (sortedArray[middlePointer]!= key && leftPointer<=rightPointer){
            if (key < sortedArray[middlePointer]){
                rightPointer = middlePointer-1;
            }else {
                leftPointer = middlePointer+1;
            }
            middlePointer = (leftPointer+rightPointer)/2;
        }
        return middlePointer;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7}, 2));
    }
}
