import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> s = new LinkedHashSet<>();
        for(int i : a) s.add(i);
        for(int i : s) System.out.print(i + " ");
    }
}
