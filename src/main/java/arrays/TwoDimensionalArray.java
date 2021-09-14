package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] arr = null;

    //Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        arr = new int[numberOfRows][numberOfColumns];
        for (int row=0; row<numberOfRows; row++){
            for (int col=0; col<numberOfColumns; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int valueToBeInserted){
        try {
            if (arr[row][col]==Integer.MIN_VALUE){
                arr[row][col] = valueToBeInserted;
                System.out.println(valueToBeInserted+" successfully inserted at row "+row+ " and co lumn "+ col);
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // Traverse 2D array

    public void traverse2DArray() {
        for (int row=0; row < arr.length; row++) {
            for (int col=0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the Array
    public void searchingValue(int value) {
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: "+ row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from Array
    public void deleteValuefromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }

    public static void main(String[] args) {
        TwoDimensionalArray myArray = new TwoDimensionalArray(2,2);
        myArray.insertValueInTheArray(0,0,10);
        myArray.insertValueInTheArray(0,1,13);
        myArray.insertValueInTheArray(1,1,30);

        System.out.println(Arrays.deepToString(myArray.arr));
    }
}
