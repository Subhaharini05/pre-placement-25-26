import java.util.Scanner;
interface Shape {
    double area();
}
class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double area() { return 3.14 * r * r; }
}
class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }
    public double area() { return l * b; }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextDouble());
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println(c.area());
        System.out.println(r.area());
    }
}
