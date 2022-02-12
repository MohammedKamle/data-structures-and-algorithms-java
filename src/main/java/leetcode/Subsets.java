package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    //https://www.youtube.com/watch?v=kYY9DotIKlo
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i=0; i< nums.length; i++){
            int n = result.size();
            for (int j=0; j<n; j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
