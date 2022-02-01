package leetcode;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {
        for (int i=0; i<=s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-(i+1)];
            s[s.length-(i+1)] = temp;
        }
    }

    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

    public static void main(String[] args) {
        new ReverseString().reverseString(new char[]{'h', 'e', 'l'});
    }
}
