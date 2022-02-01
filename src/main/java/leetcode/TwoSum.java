package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // iterative O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // with hashmap O(n)
    public static int[] twoSum_(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
            }else {
                map.put(nums[i],i);
            }
        }
        System.out.println(result[0]+" "+result[1]);
        return result;
    }

    public static void main(String[] args) {
        twoSum_(new int[]{2,7,11,15}, 9);
    }
}
