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

    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

    }
}
