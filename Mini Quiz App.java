import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] q = {"2+2?", "Capital of India?"};
        String[] a = {"4", "Delhi"};
        int score = 0;
        for(int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            if(sc.nextLine().equalsIgnoreCase(a[i])) score++;
        }
        System.out.println("Score: " + score);
    }
}
