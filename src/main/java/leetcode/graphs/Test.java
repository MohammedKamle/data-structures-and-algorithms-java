package leetcode.graphs;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        new Test().myMeth(arr);
    }

    public void myMeth(int[] arr){
        System.out.println(Arrays.toString(arr));
        test(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void test(int[] a){
        a[1] = 95;
    }
}
