package leetcode;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
       for (String s : strs){
           char[] ch = s.toCharArray();
           Arrays.sort(ch);
           if (!map.containsKey(String.valueOf(ch))){
               map.put(String.valueOf(ch), new ArrayList<>());
           }
           map.get(String.valueOf(ch)).add(s);
       }
       return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
