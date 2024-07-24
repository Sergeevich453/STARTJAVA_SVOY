package test.hw.gptrepetitor;

import java.util.Iterator;
import java.util.Scanner;

public class TicTacToe {
    private static int ROW_COUNT = 3;
    private static int COL_COUNT = 3;
    private static String CELL_STATE_EMPTY = " ";
    private static String CELL_STATE_X = "X";
    private static String CELL_STATE_O = "O";
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    
    public static void startGameRound() {
        String[][] board = createBoard();
        startGameLoop(board);
    }
    
    public static String[][] createBoard() {
        String[][] board = new String[ROW_COUNT][COL_COUNT];
        
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                board[row][col] = CELL_STATE_EMPTY;
            }
        }
        return board;
    }
    
    public static void startGameLoop(String[][] board) {
    }
    
    public static void makePlayerTurn() {
    }
    
    public static int [] inputBoardCoordinates() {
        System.out.println("Ввдите коордиаты через пробел (0 - 2)");
        
        do {
            String[] input = scanner.nextLine().split(CELL_STATE_EMPTY);
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);
        } while(true);    
        
    }
    
    public static void makeBotTurn() {
    }
    
    public static void checkGameStarted() {
    }
}
