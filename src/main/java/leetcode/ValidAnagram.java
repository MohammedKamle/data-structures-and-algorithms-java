package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

    public static boolean isAnagram(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        if (string1.length != string2.length)
            return false;
        Arrays.sort(string1);
        Arrays.sort(string2);
        for (int i = 0; i < string1.length; i++) {
            if (string1[i] != string2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram_(String s, String t) {
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        if (string1.length != string2.length)
            return false;
        for (int i = 0; i < string1.length; i++) {
            count1[string1[i]]++;
            count2[string2[i]]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i])
                return false;
        }
        return true;

    }

    public static boolean isAnagram__(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        int count[] = new int[256];
        if (string1.length != string2.length)
            return false;
        for (int i = 0; i < string1.length; i++) {
            count[string1[i]]++;
            count[string2[i]]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // with hashmap
    public static boolean isAnagram___(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string1.length; i++) {
            if (map.containsKey(string1[i])) {
                map.put(string1[i], map.get(string1[i]) + 1);
            } else {
                map.put(string1[i], 1);
            }
        }
        for (int i=0; i< string2.length; i++){
            if (map.containsKey(string2[i]))
                map.put(string2[i], map.get(string2[i])-1);
        }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 0) {
                    return false;
                }
            }
        return true;
    }


    public static void main(String[] args) {
        // isAnagram__("anagram", "nagaram");
        String s = "Geeksforgeeks";
        char[] ch = s.toLowerCase().toCharArray();
        int[] ints = new int[256];
        // System.out.println(ch[2]);
        int a = 'd' - 'a';
        System.out.println(a);
//        char c = 66;
//        System.out.println(c);
//        int[] count1 = new int[256];
//        System.out.println(Arrays.toString(count1));
    }
}
