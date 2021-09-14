package recursion;

public class FindUppercaseLetterInString {
    public static final char find(String str){
        if (str.isEmpty()){
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        }
        return find(str.substring(1,str.length()));
    }


    public static void main(String[] args) {
        System.out.println(find("hjashY"));
    }
}
