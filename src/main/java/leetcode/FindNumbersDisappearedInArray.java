package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<>();
       for (int i=0; i< nums.length ; i++){
           map.put(nums[i], i );
       }

       for (int i=1 ; i <+ nums.length; i++){
           if (!map.containsKey(i)){
               list.add(i);
           }
       }
       return list;
    }

    public static void main(String[] args) {
       List<Integer> list =  new FindNumbersDisappearedInArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(list);
    }

}
