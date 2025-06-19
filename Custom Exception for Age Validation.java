class AgeException extends Exception {
    AgeException(String m) { super(m); }
}
public class AgeCheck {
    public static void main(String[] args) throws AgeException {
        int age = 15;
        if(age < 18) throw new AgeException("Underage");
        System.out.println("Eligible");
    }
}
