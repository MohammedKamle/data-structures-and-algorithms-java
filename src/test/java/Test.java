import java.util.Arrays;
import java.util.Random;

public class Test {
    public static String reverse(String input) {
        // Initialize left and right pointers
        char[] str = input.toCharArray();
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(reverse("a&8bhA"));
    }


}
