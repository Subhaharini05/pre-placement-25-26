import java.util.*;
class Book {
    String title, author;
    Book(String t, String a) {
        title = t; author = a;
    }
}
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", "James"));
        books.add(new Book("Python", "Guido"));
        for(Book b : books)
            System.out.println(b.title + " - " + b.author);
    }
}
