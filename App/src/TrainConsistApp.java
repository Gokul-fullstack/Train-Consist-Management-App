import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 UC5: Maintain insertion order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        trainFormation.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("Train Formation (Ordered & Unique): " + trainFormation);
    }
}