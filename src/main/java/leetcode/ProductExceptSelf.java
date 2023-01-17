package leetcode;

import java.util.Arrays;


/*
 * Algorithm:
 * 1.) get the cumulative array going from left to right
 * 2.) get the cumulative array going from right to left
 * 3.) Now, for any position i the result wil be multiplication of elements at (i-1) and (i+1) positions
 *
 * */

//https://www.youtube.com/watch?v=bNvIQI2wAjk&ab_channel=NeetCode

public class ProductExceptSelf {


    //https://www.youtube.com/watch?v=bNvIQI2wAjk&t=409s

    public int[] productExceptSelf(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        postfix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }
        System.out.println(Arrays.toString(postfix));
        result[0] = postfix[1];
        result[nums.length - 1] = prefix[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = prefix[i - 1] * postfix[i + 1];
        }
        return result;
    }


    public static void main(String[] args) {
        //  new ProductExceptSelf().productExceptSelf_(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
