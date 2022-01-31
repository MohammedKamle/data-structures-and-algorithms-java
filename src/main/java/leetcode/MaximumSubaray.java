package leetcode;

public class MaximumSubaray {

    public static int maxSubArray_(int[] nums) {
        if (nums.length!=1){
            int max = Integer.MIN_VALUE;
            int i, j;
            int sum;
            for (i = 0 ; i< nums.length; i++){
                sum =nums[i];
                System.out.println("SUM :: "+sum);
                for (j=i+1; j<nums.length; j++){
                    sum += nums[j];
                    max = Math.max(sum, max);
                    System.out.println("CURRENT MAX ::"+max);
                }
                System.out.println("outside of inner loop");
            }
            return max;
        }else {
            return nums[0];
        }

    }

    //  Kadane's Algorithm
    //https://www.youtube.com/watch?v=jnoVtCKECmQ
    public static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = maxSum;
        for (int i=1; i<nums.length; i++){
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }



    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1}));

    }
}
