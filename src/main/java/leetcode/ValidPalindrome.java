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
    

}
