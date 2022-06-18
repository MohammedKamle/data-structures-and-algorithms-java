package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        // filling the elements in map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }

        }
        // storing k most frequent elements in result array
        int index = 0 ;
        int maxKey = 0;
        while (index < k){
            int maxOccurence = Integer.MIN_VALUE;
            for (int i : map.keySet()){
                if (map.get(i)>maxOccurence){
                    maxOccurence = map.get(i);
                    maxKey = i;
                }
            }
            result[index++] =maxKey;
            map.remove(maxKey);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TopKFrequent().topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
    }
}
