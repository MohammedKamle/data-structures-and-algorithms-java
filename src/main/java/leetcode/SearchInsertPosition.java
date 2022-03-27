package leetcode;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target == 0){
            return 0;
        }
        int i = 0;
        int j = nums.length-1;
        int median = (i+j)/2;
        if (nums[median] == target){
            return median;
        }
        while (i==j){
            if (nums[median] == target){
                return median;
            }
            if (nums[median] < target){
                i = median+1;
            }else {
                j= median-1;
            }
            median = (i+j)/2;
        }
        return median;

    }
}
