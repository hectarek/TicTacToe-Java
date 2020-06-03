import java.util.Scanner;

public class TicTacToeRunner {
    
    public static void main(String[] args) {

        TicTacToeClass board = new TicTacToeClass();
        board.greeting();

        Scanner in = new Scanner(System.in);

        char p = 'X';
        int r, c;

        while ( ! ( board.isWinner('X') || board.isWinner('O') || board.isFull() ) ) {

			board.displayBoard();
			System.out.print( "'" + p + "', choose your location (row, column): " );
			r = in.nextInt();
			c = in.nextInt();

			while ( board.isValid(r,c) == false || board.playerAt(r,c) != ' ' ) {

				if ( board.isValid(r,c) == false )
					System.out.println("That is not a valid location. Try again.");
				else if ( board.playerAt(r,c) != ' ' )
					System.out.println("That location is already full. Try again.");

				System.out.print( "Choose your location (row, column): " );
				r = in.nextInt();
				c = in.nextInt();
			}

			board.playMove( p, r, c );

			if ( p == 'X' )
				p = 'O';
			else
                p = 'X';
                
		}

		board.displayBoard();

		if ( board.isWinner('X') )
			System.out.println("X is the winner!");
		if ( board.isWinner('O') )
			System.out.println("O is the winner!");
		if ( board.isCat())
			System.out.println("The game is a tie.");


    }

}