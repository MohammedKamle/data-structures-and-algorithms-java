package leetcode;

import java.util.Arrays;

public class TrappingRainWater {

    // Using array pre-processing, check the video on yt below
    //https://www.youtube.com/watch?v=UZG3-vZlFM4
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];

        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                leftMax[i] = height[i];
                max = height[i];
            } else {
                leftMax[i] = max;
            }
        }
        max = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > max) {
                rightMax[i] = height[i];
                max = height[i];
            } else {
                rightMax[i] = max;
            }
        }
        int waterTrapped = 0;
        for (int i = 0; i < height.length; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return waterTrapped;
    }


    // again using array pre-processing but by not using extra variable for left and right max array
    public int trap_(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int waterTrapped = 0;
        for (int i = 0; i < height.length; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return waterTrapped;
    }

    // https://www.youtube.com/watch?v=ZI2z5pq0TqA&t=252s
    // two pointer soln
    public int trap__(int[] height) {
        int l = 0;
        int r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int waterTrapped = 0;
        while (l < r){
            if (leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                waterTrapped += leftMax - height[l];
            }else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                waterTrapped += rightMax - height[r];
            }
        }
        return waterTrapped;
    }

    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

    }
}
