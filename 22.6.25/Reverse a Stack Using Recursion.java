import java.util.*;
public class ReverseStack {
    public static void insertBottom(Stack<Integer> s, int x) {
        if(s.isEmpty()) s.push(x);
        else {
            int y = s.pop();
            insertBottom(s, x);
            s.push(y);
        }
    }
    public static void reverse(Stack<Integer> s) {
        if(!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertBottom(s, x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3);
        reverse(s);
        while(!s.isEmpty()) System.out.print(s.pop() + " ");
    }
}
