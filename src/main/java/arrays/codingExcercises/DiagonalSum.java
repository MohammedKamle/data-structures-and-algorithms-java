package arrays.codingExcercises;
/*
* Coding exercise - 19
* */
public class DiagonalSum {

    // My approach -O(n^2)
    public int sumDiagonal(int[][] a) {
        int sum=0;
        for(int i =0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(i==j){
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    //Instructor - O(n)
    public int sumDiagonal_(int[][] a) {
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum+= a[i][i];
        }
        return sum;
    }
}
