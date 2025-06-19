import java.util.*;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> q = new LinkedHashMap<>();
        q.put("What is 5*2?", "10");
        q.put("Capital of TN?", "Chennai");
        int score = 0;
        for(String key : q.keySet()) {
            System.out.println(key);
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase(q.get(key))) score++;
        }
        System.out.println("Result: " + score + "/" + q.size());
    }
}
