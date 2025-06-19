import java.util.*;
class Product {
    int id, qty;
    String name;
    Product(int id, String name, int qty) {
        this.id = id; this.name = name; this.qty = qty;
    }
}
public class Inventory {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Pen", 50));
        list.add(new Product(2, "Book", 30));
        for(Product p : list)
            System.out.println(p.id + " " + p.name + " " + p.qty);
    }
}
