package recursion;
// write a program to accept a number and adds up all the number from 0 to the number passed
public class RecursiveRange {

    public static final int recursiveRange(int n){
        if (n==1){
            return 1;
        }
        return n + recursiveRange(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveRange(6));
    }
}
