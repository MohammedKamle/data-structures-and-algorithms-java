package leetcode;

public class ValidPalindrome {


    public boolean isPalindrome(String s) {
        String modifiedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(modifiedString);
        if (modifiedString.isEmpty()){
            return true;
        }
        char[] ch = modifiedString.toCharArray();
        int i = 0;
        int j = modifiedString.length()-1;
        while (i<j){
            if (ch[i] != ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome_(String s) {
        String s1 = s.toLowerCase();
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i<j){

            while (!isAlphaNumeric(s1.charAt(i)) && (i<j)){
                i++;
            }
            while (!isAlphaNumeric(s1.charAt(j)) && (i<j)){
                j--;
            }
            if (s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
    }



}
