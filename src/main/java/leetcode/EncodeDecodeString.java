package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//https://www.youtube.com/watch?v=B1k_sxOSgv8

public class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
                j++;
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }


    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList("leet","code","ka","premium"));
        System.out.println(list);

        String encodedString = new EncodeDecodeString().encode(list);
        System.out.println(encodedString);

        List<String> decodedString = new EncodeDecodeString().decode(encodedString);
        System.out.println(decodedString);
    }
}
