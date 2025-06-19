import java.util.*;
class Emp implements Comparable<Emp> {
    String name;
    Emp(String name) { this.name = name; }
    public int compareTo(Emp e) {
        return this.name.compareTo(e.name);
    }
}
public class SortEmp {
    public static void main(String[] args) {
        List<Emp> l = new ArrayList<>();
        l.add(new Emp("Ravi")); l.add(new Emp("Anu")); l.add(new Emp("Zara"));
        Collections.sort(l);
        for(Emp e : l) System.out.println(e.name);
    }
}
