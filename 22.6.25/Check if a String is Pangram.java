import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean[] alpha = new boolean[26];
        for(char c : s.toCharArray())
            if(Character.isLetter(c)) alpha[c - 'a'] = true;
        for(boolean b : alpha) {
            if(!b) {
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
