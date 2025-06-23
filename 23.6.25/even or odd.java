import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), e = 0, o = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x % 2 == 0) e++;
            else o++;
        }
        System.out.println("Even: " + e + " Odd: " + o);
    }
}
