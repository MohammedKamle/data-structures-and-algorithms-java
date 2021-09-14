package arrays.codingExcercises;

public class CountDistinctElements {

    static int countDistinct(int arr[], int n) {
        int count = 1;

        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            // i will be equal to j when no duplicate is found and so we will increment the counter
            if (i == j) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 2, 4,1,2,3,4,2,1,};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }
}
