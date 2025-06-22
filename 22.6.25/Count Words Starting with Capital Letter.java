import java.util.Scanner;
public class CapitalWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] w = sc.nextLine().split(" ");
        int count = 0;
        for(String s : w)
            if(Character.isUpperCase(s.charAt(0))) count++;
        System.out.println(count);
    }
}
