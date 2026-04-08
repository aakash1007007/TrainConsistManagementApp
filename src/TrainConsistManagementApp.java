import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   Train Consist Management App");
        System.out.println("====================================");

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIDs);
    }

}