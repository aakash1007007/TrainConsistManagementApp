import java.util.LinkedList;
import java.util.Queue;

class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public void display() {
        System.out.println("Guest: " + guestName + " | Room Type: " + roomType);
    }

}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   Book My Stay App - Version 5.0");
        System.out.println("====================================");

        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Aakash", "Single Room"));
        bookingQueue.add(new Reservation("Sampath", "Double Room"));
        bookingQueue.add(new Reservation("Uday", "Suite Room"));
        bookingQueue.add(new Reservation("Harshith", "Single Room"));

        System.out.println("\n--- Booking Requests in Queue (FIFO) ---");

        for (Reservation r : bookingQueue) {
            r.display();
        }

        System.out.println("\nNext request to be processed:");
        bookingQueue.peek().display();
    }

}