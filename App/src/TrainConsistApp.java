import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2: Passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display after adding
        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // 🔹 Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // 🔹 Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // 🔹 Final list
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}