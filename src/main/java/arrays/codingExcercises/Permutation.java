package arrays.codingExcercises;
/*
* Coding exercise - 16
* */
public class Permutation {

    // My approach
    public static boolean permutation(int[] array1, int[] array2){
        boolean flag=false;
        for (int i=0; i<array1.length; i++){
            flag = false;
            for (int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    flag = true;
                    break;
                }
            }
            if (flag!=true){
                break;
            }

        }
        return flag;
    }

    // Instructor's approach -- Better with O(n)
    public static boolean permutation_(int[] array1, int[] array2){
        if (array1.length != array2.length ) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i = 0; i<array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        if (sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {5,1,2,3,40};
        System.out.println(permutation_(ar1,ar2));
    }
}
