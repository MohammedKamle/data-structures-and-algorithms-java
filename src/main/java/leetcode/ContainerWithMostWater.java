package leetcode;

public class ContainerWithMostWater {
    // Brute force
    public int maxArea(int[] height) {
        int maxArea = 0;
         int area=0;
         for (int i=0; i<height.length; i++){
            for (int j=i+1; j<height.length; j++){
               area = (j-i) * Integer.min(height[i], height[j]);
               if (area>maxArea){
                   maxArea = area;
               }
            }
        }
         return maxArea;
     }
 
     public int maxArea_(int[] height){
         int maxArea = 0;
         int area = 0;
         int leftPointer = 0;
         int rightPointer = height.length-1;
         while (leftPointer < rightPointer){
             area = (rightPointer-leftPointer) * Integer.min(height[leftPointer],height[rightPointer]);
             if (area > maxArea){
                 maxArea = area;
             }
             if (height[leftPointer] > height[rightPointer]){
                 rightPointer--;
             }else {
                 leftPointer++;
             }
         }
         return maxArea;
     }
}
