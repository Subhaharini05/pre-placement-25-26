import java.util.*;
public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> m = new HashMap<>();
        for(char c : s.toCharArray())
            m.put(c, m.getOrDefault(c, 0) + 1);
        for(char c : m.keySet())
            System.out.println(c + ": " + m.get(c));
    }
}
