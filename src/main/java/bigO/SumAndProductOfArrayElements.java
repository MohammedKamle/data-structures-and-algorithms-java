package bigO;

public class SumAndProductOfArrayElements {

    public static final void sumAndProduct(int[] arr){
        int sum =0;
        int product =1;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum is "+sum+" and product is "+product);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        sumAndProduct(array);
    }
    /*
    * Time Complexity is O(n)
    * */
}
