package recursion;
// program to print the sum of individual digits in a positive integer
public class SumOfDigits {
    public static int sumofDigits(int n){
       if (n<=0){
           return 0;
       }
        return  (n%10) + sumofDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println("2%10 is "+(1%10)+" and 2/10 is "+(2/10));
        System.out.println(sumofDigits(256));
    }
}
