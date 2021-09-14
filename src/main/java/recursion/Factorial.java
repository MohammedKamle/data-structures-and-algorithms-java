package recursion;

public class Factorial {

    public static int factorial(int n){
        if (n<0){
            return  -1;
        }
        if (n==1 || n==0){
            return  1;
        }
        return  n*factorial(n-1);
    }
    public static void main(String[] args) {
        int number =4;
        System.out.println("Factorial of "+number+" is "+factorial(number));
    }
}
