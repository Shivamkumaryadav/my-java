import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        char[][] board = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' }
        };
        for (int i = 0; i < 3; i++) {
            System.out.print(board[i][i]);
            for (int j = i; j < board.length; j++) {
                if(i < 3 && j == 1)
                {
                    System.out.println(board[i][j]);
                }else if(i < 6  && j == 2)
                {
                    System.out.print(board[i][j]);
                }else{
                    System.out.print(board[i][j]);
                }

            }
        }
        System.out.println("\n");

        for(int i = 0; i < 9; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Turn X");
                askUser(board);
            }else {
                System.out.println("Turn O");
                askUser(board);
            }
            // System.out.println(i);
        }
    }

    public static int[] askUser(char[][] board)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a row and column number : ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        return new int[] {row, element};
    }
}
