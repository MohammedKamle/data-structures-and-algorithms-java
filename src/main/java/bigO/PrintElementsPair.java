package bigO;
/*
* Eg. for {1,2,3,4}
* pairs printed will be 11,12,13,14,21,22,23,23,......
* */

public class PrintElementsPair {
    public static final void printPairs(int[] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                String a =  Integer.toString(arr[i]);
                String b = Integer.toString(arr[j]);
                System.out.println(a+b);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printPairs(array);
    }
}
/*
* Time Complexity : O(n^2)
* */
