package arrays.codingExcercises;
/*
* Coding Exercise 11
* */
public class FindMissingInteger {

    // My Approach
    public static  void missingNumber(int[] intArray) {
        int count = 1;
        for (int i=0; i<intArray.length; i++){
             if (count!=intArray[i]){
                 i--; //IMP STEP
                 System.out.println(count+" missing");
             }
             count++;
        }

    }

    //Instructor approach
    public static  void missingNumber_(int[] intArray) {
       int sum1= 0;
       int sum2 = 0;
       for (int i: intArray){
           sum1 += i;
       }
       //sum of n numbers - n(n+1)/2
       sum2 = 10*(10+1)/2;
       int difference = sum2-sum1;
        System.out.println("Missing number is "+difference);
    }

    //Instructor approach - works only when a single number is missing
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,8,9,10};
        missingNumber(intArray);
    }
}
