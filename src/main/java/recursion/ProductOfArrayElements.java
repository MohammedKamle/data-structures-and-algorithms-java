package recursion;

public class ProductOfArrayElements {
    public static final int productOfArrayElements(int arr[], int lengthOfArray){
            if(lengthOfArray==0){
                return 1;
            }
            return arr[lengthOfArray-1] * productOfArrayElements(arr, lengthOfArray-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,2};
        System.out.println(productOfArrayElements(arr,arr.length));
    }
}
