public class GameOfLife {

	int live;
	int dead;
	int rowLength;
	int columnLength;
	int[][] result;

	public void gameOfLife(int[][] board) {
		rowLength = board.length;
		columnLength = board[0].length;
		result = new int[rowLength][columnLength];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

				checkValuesOfNeighbours(i, j, board);
				if (board[i][j] == 1) {
					if (live < 2 || live > 3) {
						result[i][j] = 0;
					}
					else {
						result[i][j] = 1;
					}

				} else {
					if (live == 3) {
						result[i][j] = 1;
					}
				}
				live = 0;
				dead = 0;
			}
		}
		board = result;
	}

	private void checkValuesOfNeighbours(int i, int j, int[][] board) {

		if (j < columnLength - 1 && board[i][j + 1] == 1) {
			live++;
		} else if (j < columnLength - 1 && board[i][j + 1] == 0) {
			dead++;
		}

		if (i < columnLength - 1 && board[i + 1][j] == 1) {
			live++;
		} else if (i < columnLength - 1 && board[i + 1][j] == 0) {
			dead++;
		}

		if (i < columnLength - 1 && j < columnLength - 1 && board[i + 1][j + 1] == 1) {
			live++;
		} else if (i < columnLength - 1 && j < columnLength - 1 && board[i + 1][j + 1] == 0) {
			dead++;
		}

		if (j > 0 && board[i][j - 1] == 1) {
			live++;
		} else if (j > 0 && board[i][j - 1] == 0) {
			dead++;
		}

		if (i > 0 && board[i - 1][j] == 1) {
			live++;
		} else if (i > 0 && board[i - 1][j] == 0) {
			dead++;
		}

		if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) {
			live++;
		} else if (i > 0 && j > 0 && board[i - 1][j - 1] == 0) {
			dead++;
		}

		if (j > 0 && i < rowLength - 1 && board[i + 1][j - 1] == 1) {
			live++;
		} else if (j > 0 && i < rowLength - 1 && board[i + 1][j - 1] == 0) {
			dead++;
		}

		if (i > 0 && j < columnLength - 1 && board[i - 1][j + 1] == 1) {
			live++;
		} else if (i > 0 && j < columnLength - 1 && board[i - 1][j + 1] == 0) {
			dead++;
		}

	}

	public static void main(String[] args) {
		int board[][] = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };

		GameOfLife life = new GameOfLife();
		life.gameOfLife(board);
		for (int i = 0; i < life.result.length; i++) {
			for (int j = 0; j < life.result[i].length; j++) {
				System.out.print(life.result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int board2[][] = { { 1,1}, {1,0} };
		 life = new GameOfLife();
		life.gameOfLife(board2);
		for (int i = 0; i < life.result.length; i++) {
			for (int j = 0; j < life.result[i].length; j++) {
				System.out.print(life.result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
