package arrays.codingExcercises;

import java.util.NoSuchElementException;

/*
* Coding Exercise -13
* */
public class FindGivenNumber {

    public static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for (int i=0; i<intArray.length; i++){
            if (intArray[i]==valueToSearch){
                return i;
            }
        }
        throw  new NoSuchElementException("This array does not contain "+valueToSearch);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(searchInArray(arr, 5));
    }

}
