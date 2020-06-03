public class TicTacToeClass {
	// Instance Variables
	private char[][] board;
	private int turns;

	// Constructors
	public TicTacToeClass() {
		board = new char[3][3];
		turns = 0;

		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				board[r][c] = ' ';
	}

	// Accessor Methods

	public boolean isWinner(char p) {

		// Across
		if (board[0][0] == p && board[0][1] == p && board[0][2] == p) {
			return true;
		} else if (board[1][0] == p && board[1][1] == p && board[1][2] == p) {
			return true;
		}else if (board[2][0] == p && board[2][1] == p && board[2][2] == p) {
			return true;

		// Down
		} else if (board[0][0] == p && board[1][0] == p && board[2][0] == p) {
			return true;
		} else if (board[0][1] == p && board[1][1] == p && board[2][1] == p) {
			return true;
		} else if (board[0][2] == p && board[1][2] == p && board[2][2] == p) {
			return true;
		
		// Diagonal
		} else if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
			return true;
		} else if (board[0][2] == p && board[1][1] == p && board[2][0] == p) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {
		if (this.turns >= 9) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isCat() {
		if ( this.turns >= 9 && !(isWinner('X') || isWinner('O')) ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValid(int r, int c) {
		if (0 <= r && r <= 2 && 0 <= c && c <= 2)
			return true;
		else
			return false;
	}

	public int numTurns() {
		return this.turns;
	}

	public void incrementTurns() {
		this.turns++;
	}

	public char playerAt(int r, int c) {
		if (isValid(r, c))
			return board[r][c];
		else
			return '@';
	}

	public void displayBoard() {
		System.out.println(" ");
		System.out.println("       Turn : " + numTurns());
		System.out.println(" ");
		System.out.println("  0   " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("     -- + - + --");
		System.out.println("  1   " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("     -- + - + --");
		System.out.println("  2   " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println(" ");
		System.out.println("      0   1   2 ");
		System.out.println(" ");
	}

	public void greeting() {
		System.out.println(" ");
        System.out.println("Welcome to Hector's TicTacToe Game");
        System.out.println(" ");
	}

	// Modifiers
	public void playMove(char p, int r, int c) {
		this.board[r][c] = p;
		incrementTurns();
	}

}