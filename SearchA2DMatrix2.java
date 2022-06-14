
public class SearchA2DMatrix2 {

	// Divide and Conquer
	public boolean searchMatrix(int[][] matrix, int target) {

		int rowLow = 0;
		int rowHigh = matrix.length - 1;
		int colLow = 0;
		int colHigh = matrix[0].length - 1;

		return findValue(matrix, rowLow, rowHigh, colLow, colHigh, target);
	}

	private boolean findValue(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh, int target) { 
		// Base case, no elements
		if (rowHigh < rowLow || colHigh < colLow)
			return false;

		// Base case, Single cell
		if (rowLow == rowHigh && colLow == colHigh)
			return matrix[rowLow][colLow] == target;

		int rowMid = rowLow + (rowHigh - rowLow) / 2;
		int colMid = colLow + (colHigh - colLow) / 2;

		if (matrix[rowMid][colMid] == target)
			return true;

		if (target < matrix[rowMid][colMid]) {
			if (findValue(matrix, rowLow, rowMid, colLow, colMid, target))
				return true;
		}

		// Search Top-Right
		if (findValue(matrix, rowLow, rowMid, colMid + 1, colHigh, target)) {
			return true;
		}

		// Search Bottom-Left
		if (findValue(matrix, rowMid + 1, rowHigh, colLow, colMid, target)) {
			return true;
		}

		// Search Bottom-Right
		if (target > matrix[rowMid][colMid]) {
			if (findValue(matrix, rowMid + 1, rowHigh, colMid + 1, colHigh, target)) {
				return true;
			}
		}
		// Not found in search space
		return false;

	}

	///////////////////////////////////////
	// Tricky approach
	public boolean searchMatrix2(int[][] matrix, int target) {

		if (matrix == null)
			return false;
		int rowIndexOfTopRight = 0;
		int colIndexOfTopRight = matrix[0].length - 1;

		while (colIndexOfTopRight >= 0 && rowIndexOfTopRight < matrix.length) {

			if (matrix[rowIndexOfTopRight][colIndexOfTopRight] == target) {
				return true;
			} else if (target < matrix[rowIndexOfTopRight][colIndexOfTopRight]) {
				colIndexOfTopRight--;
			} else {
				rowIndexOfTopRight++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		/*
		 * int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16,
		 * 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		 * System.out.println(new SearchA2DMatrix2().searchMatrix(matrix, 5));
		 */

		int matrix2[][] = { { -1, 3 } };
		System.out.println(new SearchA2DMatrix2().searchMatrix(matrix2, 3));
	}

}
