import java.util.*;
public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1,3,5}, b = {2,4,6};
        int[] m = new int[a.length + b.length];
        System.arraycopy(a, 0, m, 0, a.length);
        System.arraycopy(b, 0, m, a.length, b.length);
        Arrays.sort(m);
        for(int i : m) System.out.print(i + " ");
    }
}
