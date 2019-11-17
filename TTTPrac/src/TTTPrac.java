import java.util.Scanner;

public class TTTPrac {
    //Variable Declaration
    public static int row, col; // Row and column
    public static Scanner scanner = new Scanner(System.in); // Taking in the keyboard input
    public static char[][] board = new char[3][3]; // creation of a board
    public static char turn = 'X'; //determine whose turn

    public static void main(String [] args){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = '_';
            }
        }

        Play();

    }

    public static void Play(){
        boolean playing = true;
        PrintBoard();
        while(playing){
            System.out.println("Please enter a row and a column: ");
            row = scanner.nextInt() - 1; //Input given by a player is 1,2 or 3 but arrays start from 0,1,2
            col = scanner.nextInt() - 1;
            board[row][col] = turn;

            if (GameOver(row, col)){
                playing = false;
                System.out.println("Game Over! Player " + turn +" wins!");
            }

            PrintBoard();
            //Check the player who took the last turn
            if (turn == 'X'){
                turn = 'O';
            }else{
                turn = 'X';
            }
        }

    }

    public static void PrintBoard(){
        for (int i=0; i<3; i++){
            System.out.println();
            for (int j=0; j<3; j++){
                if (j == 0){
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
    }

    public static boolean GameOver(int rMove, int cMove){
        //Check whether values are same perpendicularly
        if ((board[1][cMove] == board[2][cMove]) && (board[0][cMove] == board[1][cMove]) && (board[0][cMove] == board[2][cMove]))
            return true;

        else if ((board[rMove][1] == board[rMove][2]) && (board[rMove][0] == board[rMove][1]) && (board[rMove][0] == board[rMove][2]))
            return true;

        //Check whether values are same diagonally
        else if ((board[1][1] != '_') && (board[0][0] == board[1][1]) && (board[0][0] == board[2][2]))
            return true;

        else if ((board[1][1] != '_') && (board[0][2] == board[1][1]) && (board[0][2] == board[2][0]))
            return true;

        //Return when none of the above conditions are true
        else
            return false;
    }
}
