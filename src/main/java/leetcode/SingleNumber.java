package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int counter =1;
            if (set.add(nums[i])){
                map.put(nums[i], counter);
            }else {
                map.put(nums[i], counter+1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }


    // more optimum using XOR
    int singleNumber_(int A[], int n) {
        int result = 0;
        for (int i = 0; i<n; i++)
        {
            result ^=A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(2^4);
    }
}
