package arrays.codingExcercises;
/*
* Coding exercise 21
* */
public class MissingNumber {

    static int missingNumber(int[] arr, int totalCount) {
        int expectedSum = totalCount*(totalCount+1)/2;
        System.out.println(expectedSum);
        int actualSum =0;
        for (int i: arr){
            actualSum = actualSum + i;
        }
        System.out.println(actualSum);
        int difference = expectedSum -actualSum;
        System.out.println(difference);
        return difference;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(missingNumber(arr,6));
    }

}
