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

    // O(n) with space O(n)
    public int[] productExceptSelf_(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        //get the cumulative array going from left to right
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }
        System.out.println(Arrays.toString(left));
        // get the cumulative array going from right to left
        right[right.length - 1] = nums[nums.length - 1];
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }
        System.out.println(Arrays.toString(right));

        // Now, for any position i the result wil be multiplication of elements at (i-1) and (i+1) positions
        // execept the initials
        result[0] = right[1];
        result[result.length - 1] = left[left.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = left[i - 1] * right[i + 1];
        }
        // System.out.println(Arrays.toString(result));

        return result;
    }

    // O(n) with space O(1)
    public int[] productExceptSelf__(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int right = 1, left = 1;

        Arrays.fill(res, 1);

        for (int i = 0; i < n; i++) {
            res[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public int[] productExceptSelf___(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }

    public int[] productExceptSelf____(int[] nums) {
        int n = nums.length;
        int[] left_products = new int[n];
        int[] right_products = new int[n];
        int[] output_arr = new int[n];

        left_products[0] = 1;
        right_products[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left_products[i] = nums[i - 1] * left_products[i - 1];
        }
        System.out.println(Arrays.toString(left_products));
        for (int i = n - 2; i >= 0; i--) {
            right_products[i] = nums[i+1] * right_products[i+1];
        }
        System.out.println(Arrays.toString(right_products));
        for (int i=0; i<n;i++){
            output_arr[i] = left_products[i] *right_products[i];
        }

        return output_arr;

    }


    public static void main(String[] args) {
        //  new ProductExceptSelf().productExceptSelf_(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf____(new int[]{1, 2, 3, 4})));
    }
}
