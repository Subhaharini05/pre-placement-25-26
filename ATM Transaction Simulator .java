import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int ch = sc.nextInt();
        int amt = sc.nextInt();
        if(ch == 1 && amt <= balance) System.out.println("Balance: " + (balance - amt));
        else if(ch == 2) System.out.println("Balance: " + (balance + amt));
        else System.out.println("Transaction Failed");
    }
}
