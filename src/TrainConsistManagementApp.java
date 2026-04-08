
import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   Train Consist Management App");
        System.out.println("====================================");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}
