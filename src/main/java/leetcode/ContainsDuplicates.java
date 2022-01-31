package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    // Brute force
    public boolean containsDuplicate(int[] nums) {
        for (int i=0; i< nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // hashing
    public boolean containsDuplicateWithHashSet(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if (integerSet.add(nums[i])){

            }else {
                return true;
            }
        }
        return false;
    }

}
