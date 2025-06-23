import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i : a) {
            if(i > max) {
                second = max;
                max = i;
            } else if(i > second && i != max)
                second = i;
        }
        System.out.println(second);
    }
}
