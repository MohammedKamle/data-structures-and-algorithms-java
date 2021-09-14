package arrays.codingExcercises;

import java.util.Arrays;
import java.util.Collections;

/*
* Coding exercise - 20
* */
public class BestScore {

    // instructor approach
    static String firstSecond_(Integer[] myArray) {
        Integer[] arr = myArray;
            Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;

    }

    // my approach
    static String firstSecond(Integer[] myArray) {
        int max = 0;
        int lessThanMax =0;
        for (int i=0; i<myArray.length; i++){
            if (myArray[i]>= max){
               // lessThanMax = max;
                max = myArray[i];
            }
        }
        for (int i=0; i<myArray.length;i++){
            if (myArray[i]!=max){
                if (myArray[i]>lessThanMax){
                    lessThanMax=myArray[i];
                }
            }
        }
       return max+" "+lessThanMax;
    }

    public static void main(String[] args) {
        Integer[] a = {12,26,33,400,5,2,4,1, 67,90,5,33,45,400,95};
        System.out.println(firstSecond(a));
//        Arrays.sort(a, Collections.reverseOrder());
//        System.out.println(Arrays.toString(a));
    }

}
