package connectFour;

public class ConnectFourGame {
	
	public static final int PLAYING = 0;
    public static final int RED_WINS = 1;
    public static final int BLACK_WINS = 2;
    public static final int DRAW = 3;
    public static final int RED = 4;
    public static final int BLACK = 5;
    public static final int EMPTY = 6;

    int[][] board;
    
    public ConnectFourGame() {
        board = new int[6][7];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = EMPTY;
            }
        }
    }
    
    public boolean dropPiece(int column, int player) {
        for (int row = board.length - 1; row >= 0; row--) {
            if (board[row][column] != BLACK && board[row][column] != RED) {
                board[row][column] = player;
                return true;
            }
        }
        return false;
    }

    public int status() {
        if (checkWin(RED) == true) {
            return RED_WINS;
        }
        else if (checkWin(BLACK) == true) {
            return BLACK_WINS;
        }
        else if (Draw() == true) {
            return DRAW;
        }
        else {
            return PLAYING;
        }
    }
    
    public boolean columnFull(int column) {
        return board[0][column] != EMPTY;
    }
    
    public void draw() {
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                String pieceName = "";

                switch (board[row][col]) {
                    case BLACK -> pieceName = "BLACK";
                    case RED -> pieceName = "RED  ";
                    case EMPTY -> pieceName = "EMPTY";
                }

                System.out.print(pieceName);
                if (col < board[row].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("|");
        }
        System.out.println("");
    }

    public int getSpot(int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return -1; 
        }
        return board[row][col];
    }

    public boolean checkWin(int player) {
        // horizontal
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <= 3; col++) {
                if (board[row][col] == player && board[row][col + 1] == player &&
                        board[row][col + 2] == player && board[row][col + 3] == player) {
                    return true;
                }
            }
        }
        // vertical
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row <= 2; row++) {
                if (board[row][col] == player && board[row + 1][col] == player &&
                        board[row + 2][col] == player && board[row + 3][col] == player) {
                    return true;
                }
            }
        }

        // diagonal top left to bottom right
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 3; col++) {
                if (board[row][col] == player && board[row + 1][col + 1] == player &&
                        board[row + 2][col + 2] == player && board[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }

        // diagonal top right to bottom left
        for (int row = 0; row <= 2; row++) {
            for (int col = 3; col >= 0; col--) {
                if (board[row][col] == player && board[row + 1][col - 1] == player &&
                        board[row + 2][col - 2] == player && board[row + 3][col - 3] == player) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public boolean Draw() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == EMPTY) {
                	return false;
                }
            }
        }
        return true; 
    }

}
