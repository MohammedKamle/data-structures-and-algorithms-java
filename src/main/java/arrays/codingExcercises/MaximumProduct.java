package arrays.codingExcercises;
/*
* Coding Exercise -  14
* */
public class MaximumProduct {

    // My approach
    public static String maxProduct(int[] intArray) {
        int maxProduct =0;
        int a=0;
        int b=0;
        for (int i=0; i<intArray.length; i++){
            for (int j=i+1; j<intArray.length; j++){
                if ((intArray[i]*intArray[j])>maxProduct){
                    maxProduct = intArray[i]*intArray[j];
                     a= intArray[i];
                     b = intArray[j];
                }
            }
        }
        return a+","+b;
    }

    //Instructor approach
    public static String maxProduct_(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i]*intArray[j]>maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,303,40,50};
        System.out.println(maxProduct_(arr));
    }
}
