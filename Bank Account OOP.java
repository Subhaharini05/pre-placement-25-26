import java.util.Scanner;
class Account {
    int balance = 10000;
    void withdraw(int amt) {
        if(amt <= balance) balance -= amt;
    }
    void deposit(int amt) {
        balance += amt;
    }
    int getBalance() {
        return balance;
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        a.deposit(sc.nextInt());
        a.withdraw(sc.nextInt());
        System.out.println(a.getBalance());
    }
}
