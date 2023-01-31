package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        /*
         * filling the elements in map with key as each unique element in nums and value as how many times a key is
         * repeated
         * */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }

        }
        // shortcut
        //map.put(i, map.getOrDefault(i,0)+1);

        // storing k most frequent elements in result array
        int maxKey = 0;
        for (int i = 0; i < k; i++) {
            int maxOccurence = Integer.MIN_VALUE;
            for (int j : map.keySet()) {
                if (map.get(j) > maxOccurence) {
                    maxOccurence = map.get(j);
                    maxKey = j;
                }
            }
            result[i] = maxKey;
            // removing the max key from the map for next iteration for getting the next max
            map.remove(maxKey);
        }
        return result;
    }

    // using java streams
    public int[] topKFrequent_(int[] nums, int k) {
        Map<Integer, Integer> elemCountMap = new HashMap<>();
        for (int num : nums) {
            elemCountMap.put(num, elemCountMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(elemCountMap);
        // for descending  b.compareTo(a) and for ascending a.compareTo(b)
        List<Integer> result = elemCountMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .map(i -> i.getKey())
                .collect(Collectors.toList());
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TopKFrequent().topKFrequent_(new int[]{1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, 2)));
        List<Integer> list = Arrays.asList(1, 5, 3, 89, 2, 7, 3);
        // for descending  b.compareTo(a) and for ascending a.compareTo(b)
        var res = list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
