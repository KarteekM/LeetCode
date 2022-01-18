import java.util.Collections;
import java.util.Stack;

public class SortTheMatrixDiagnally {

	public int[][] diagonalSort(int[][] mat) {
		
		int m = mat.length;
		int n = mat[0].length;
		
		for(int i=0;i<m;i++) {
			for (int j = 0; j < (i > 0 ? 1 : n); j++) {
				Stack<Integer> vals = new Stack<>();
				while(i <m && j < n) {
					vals.add(mat[i][j]);
					i++;j++;
				}
				Collections.sort(vals);
				while(i>0 && j>0) {
					i--;
					j--;
					mat[i][j] = vals.pop();
					
				}
			}
		}
		
		return mat;
	}

	public static void main(String[] args) {
		int mat[][] = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
		new SortTheMatrixDiagnally().diagonalSort(mat);
	}
}
