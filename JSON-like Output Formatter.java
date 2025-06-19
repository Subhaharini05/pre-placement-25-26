import java.util.*;
public class JsonPrint {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("name", "Ravi");
        m.put("age", "22");
        System.out.print("{");
        int i = 0;
        for(String k : m.keySet()) {
            System.out.print("\"" + k + "\":\"" + m.get(k) + "\"");
            if(i < m.size() - 1) System.out.print(", ");
            i++;
        }
        System.out.println("}");
    }
}
