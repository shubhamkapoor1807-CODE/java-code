import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };

        char player = 'X';

        for (int turn = 0; turn < 9; turn++) {

            System.out.println("\n===== TIC TAC TOE =====");

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    System.out.print(board[i][j] + " ");
                }

                System.out.println();
            }

            System.out.print("Player " + player + " Enter Position: ");
            int pos = sc.nextInt();

            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            if (board[row][col] != 'X' && board[row][col] != 'O') {

                board[row][col] = player;

                if (player == 'X') {

                    player = 'O';

                } else {

                    player = 'X';
                }

            } else {

                System.out.println("Position Already Taken");
                turn--;
            }
        }

        System.out.println("\nGame Over");

        sc.close();
    }
}