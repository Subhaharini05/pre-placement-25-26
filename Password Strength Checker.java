import java.util.Scanner;
public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        boolean upper = false, lower = false, digit = false, special = false;
        for(char c : pwd.toCharArray()) {
            if(Character.isUpperCase(c)) upper = true;
            else if(Character.isLowerCase(c)) lower = true;
            else if(Character.isDigit(c)) digit = true;
            else special = true;
        }
        if(pwd.length() >= 8 && upper && lower && digit && special)
            System.out.println("Strong");
        else
            System.out.println("Weak");
    }
}
