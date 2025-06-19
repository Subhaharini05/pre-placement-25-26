class Employee {
    int id; String name;
    Employee(int id, String name) {
        this.id = id; this.name = name;
    }
}
class Salary extends Employee {
    int basic;
    Salary(int id, String name, int basic) {
        super(id, name);
        this.basic = basic;
    }
    int compute() {
        return basic + 2000;
    }
}
public class Company {
    public static void main(String[] args) {
        Salary s = new Salary(1, "Ravi", 10000);
        System.out.println(s.name + " " + s.compute());
    }
}
