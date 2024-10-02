package connectFour;

import java.util.Random;
import java.util.Scanner;

public class MainFile {
	
	public static void main(String[] args) {
        ConnectFourGame x = new ConnectFourGame();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int currentPlayer = r.nextInt(2) + 4;
        
        System.out.println("---Connect Four---");
        System.out.println("Choose either the black piece or red piece\n");
        
        while (x.status() == ConnectFourGame.PLAYING) {
            x.draw();
            System.out.println(currentPlayer == ConnectFourGame.RED ? "Red's turn\n" : "Black's turn\n");

            System.out.println("Place a piece using a number between 0-6");
            int column = sc.nextInt();

            if (column < 0 || column > 6 || x.columnFull(column)) {
                System.out.println("Invalid column or column is full. Please try again.");
            } else {
                if (!x.dropPiece(column, currentPlayer)) {
                    System.out.println("Piece could not be placed, please try again.");
                } else {
                	currentPlayer = currentPlayer == ConnectFourGame.RED ? ConnectFourGame.BLACK : ConnectFourGame.RED;
                }
            }
        }

        if (x.status() == ConnectFourGame.BLACK_WINS) {
            System.out.println("Black Wins!");
            System.out.println("Red Loses!");
        } else if (x.status() == ConnectFourGame.RED_WINS) {
            System.out.println("Red Wins!");
            System.out.println("Black Loses!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}