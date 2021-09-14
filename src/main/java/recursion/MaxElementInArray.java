package recursion;

public class MaxElementInArray {
    public static final int maxElement(int a[], int length){
        if (length==1){
            return a[0];
        }
        return Math.max(a[length-1],maxElement(a,length-1) );
    }

    public static void main(String[] args) {
        int a[] = {1,2,7,9,0,1,5,78,6,4,3,6,7};
        System.out.println(maxElement(a, a.length));
    }
}
