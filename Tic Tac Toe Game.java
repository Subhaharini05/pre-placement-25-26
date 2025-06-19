import java.util.*;
public class TicTacToe {
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static void print() {
        for(char[] r : board) {
            for(char c : r) System.out.print(c + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turn = 0;
        while(turn < 9) {
            print();
            int r = sc.nextInt(), c = sc.nextInt();
            if(board[r][c] == ' ') {
                board[r][c] = turn % 2 == 0 ? 'X' : 'O';
                turn++;
            }
        }
        print();
    }
}
