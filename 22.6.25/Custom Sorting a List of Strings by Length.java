import java.util.*;
public class CustomSort {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("java", "is", "awesome", "a");
        l.sort((a, b) -> a.length() - b.length());
        for(String s : l) System.out.print(s + " ");
    }
}
