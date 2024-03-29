package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && (nums[i] != nums[i - 1]))) {
                int leftPointer = i + 1;
                int rightPointer = nums.length - 1;
                int sum = 0 - nums[i];
                while (leftPointer < rightPointer) {
                    if (nums[leftPointer] + nums[rightPointer] == sum) {
                        result.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1])
                            leftPointer++;
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1])
                            rightPointer--;
                        leftPointer++;
                        rightPointer--;
                    } else if (nums[leftPointer] + nums[rightPointer] > sum) {
                        rightPointer--;
                    } else {
                        leftPointer++;
                    }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum_(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1;
                int r = nums.length - 1;
                int threeSum = nums[i] + nums[l] + nums[r];
                while (l < r) {
                    if (threeSum == 0) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && (nums[l] == nums[l + 1])) l++;
                        while (l < r && (nums[r] == nums[r - 1])) r--;
                        l++;
                        r--;
                    } else if (threeSum > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0, 0}));
    }
}
