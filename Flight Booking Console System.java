import java.util.*;
class Flight {
    String from, to;
    int seat, id;
    Flight(int id, String from, String to, int seat) {
        this.id = id; this.from = from; this.to = to; this.seat = seat;
    }
}
public class BookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Flight> list = new ArrayList<>();
        list.add(new Flight(101, "Chennai", "Delhi", 100));
        int id = sc.nextInt();
        for(Flight f : list) {
            if(f.id == id && f.seat > 0) {
                f.seat--;
                System.out.println("Booked");
            }
        }
    }
}
