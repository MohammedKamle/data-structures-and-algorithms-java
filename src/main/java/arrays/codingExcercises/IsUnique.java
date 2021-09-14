package arrays.codingExcercises;
/*
* Coding exercise - 15
* */
public class IsUnique {
    public static boolean isUnique(int[] intArray) {
        for (int i=0; i<intArray.length; i++){
            for (int j=i+1; j<intArray.length; j++){
                if (intArray[i]==intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isUnique(arr));
    }
}
