package blind75.Geometry;

public class RotateImage {
    public void rotate(int[][] matrix) {

        // i
        int start = 0;
        int end = matrix.length-1;

        while(start < end){
            int[] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<matrix.length;i++){
            for( int j=i+1;j<matrix[i].length;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}
