import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}
