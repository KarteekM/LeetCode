package blind75.Geometry;

import java.util.*;

public class SetMatrixZeros {

    public void setZeroes2(int[][] matrix) {
        int numberOfRows = matrix.length;
        int numberOfCols = matrix[0].length;
        int[] rowsWhichShouldBeZero = new int[numberOfRows];
        int[] colsWhichShouldBeZero = new int[numberOfCols];
        Arrays.fill(rowsWhichShouldBeZero, 1);
        Arrays.fill(colsWhichShouldBeZero, 1);


        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                if (0 == matrix[i][j]) {
                    rowsWhichShouldBeZero[i] = 0;
                    colsWhichShouldBeZero[j] = 0;
                }
            }
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                if (rowsWhichShouldBeZero[i] == 0 || colsWhichShouldBeZero[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {

        int numberOfRows = matrix.length;
        int numberOfCols = matrix[0].length;
        boolean isRow0Zero = false;
        boolean isCol0Zero = false;


        for(int i=0;i<numberOfCols;i++){
            if(matrix[0][i] == 0){
                isRow0Zero = true;
            }
        }

        for(int j=0;j<numberOfRows;j++){
            if(matrix[j][0] == 0){
                isCol0Zero = true;
            }
        }

        for(int i=1;i<numberOfRows;i++){
            for(int j=1;j<numberOfCols;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<numberOfRows;i++){
            for(int j=1;j<numberOfCols;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isRow0Zero){
            for(int i=0;i<numberOfCols;i++){
                matrix[0][i] = 0;
            }
        }

        if(isCol0Zero){
            for(int j=0;j<numberOfRows;j++){
                matrix[j][0] = 0;
            }
        }

    }
}