package practical.array;

import framework.Solution;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 *
 * Example 1:
 * Input:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * Output:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 *
 * Example 2:
 * Input: 
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * Output:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 */
public class MatrixZeros extends Solution {


    @Override
    protected void execute() {
        int[][] matrix = {{0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}};
        printMatrix(matrix);
        setZeroes(matrix);

    }

    private void setZeroes(int[][] matrix) {
        int col0=1;
        int row=matrix.length;
        int col=matrix[0].length;

        for (int i=0;i<row;i++){
            if (matrix[i][0]==0) col0=0;
            for (int j=1;j<col;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        printMatrix(matrix);
        for (int i=row-1;i>=0;i--){
            for (int j=col-1;j>=1;j--){
                if (matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if (col0 == 0) matrix[i][0] = 0;
        }

        printMatrix(matrix);
    }

    private void printMatrix (int[][] matrix){
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
