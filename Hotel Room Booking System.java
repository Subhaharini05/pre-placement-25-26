import java.util.*;
class Room {
    int roomNo; boolean booked;
    Room(int no) { roomNo = no; booked = false; }
}
public class Hotel {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        for(int i = 1; i <= 5; i++) rooms.add(new Room(i));
        rooms.get(2).booked = true;
        for(Room r : rooms)
            System.out.println("Room " + r.roomNo + ": " + (r.booked ? "Booked" : "Available"));
    }
}
