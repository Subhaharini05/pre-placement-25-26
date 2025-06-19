import java.util.*;
class Book {
    String title;
    Book(String t) { title = t; }
}
public class SearchBook {
    public static void main(String[] args) {
        List<Book> l = Arrays.asList(new Book("Java"), new Book("Python"), new Book("AI"));
        String key = "Java";
        for(Book b : l) {
            if(b.title.equalsIgnoreCase(key))
                System.out.println("Found: " + b.title);
        }
    }
}
