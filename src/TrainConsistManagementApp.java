import java.util.ArrayList;
import java.util.List;

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }

}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   Train Consist Management App");
        System.out.println("====================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury Coach", 80));

        System.out.println("\n--- Bogie Details ---");
        for (Bogie b : bogies) {
            b.display();
        }

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
    }

}