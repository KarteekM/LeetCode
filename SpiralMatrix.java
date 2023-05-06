package blind75.Geometry;

import java.util.*;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return result;

        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(true){

            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > bottom ) break;

            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom ) break;

            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom ) break;

            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > bottom ) break;

        }
        return result;
    }
}
