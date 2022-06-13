package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = map.get(target - numbers[i]) + 1;
                result[1] = i + 1;
            } else {
                map.put(numbers[i], i);
            }
        }
        return result;
    }

    // two pointer approachj
    public int[] twoSum_(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer =0;
        int rightPointer = numbers.length-1;
        while (leftPointer<rightPointer){
            if (numbers[leftPointer] + numbers[rightPointer] == target){
                result[0] = leftPointer+1;
                result[1] = rightPointer+1;
                return result;
            }
            if (numbers[leftPointer] + numbers[rightPointer] > target){
                rightPointer --;
                continue;   
            }
            leftPointer++;
        }
          result[0] = leftPointer+1;
          result[1] = rightPointer+1;
          return result;
        
      }
    
}
