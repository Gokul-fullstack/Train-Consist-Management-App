// ✅ ALWAYS at top
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting: " + bogies);

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("After Sorting: " + bogies);
    }
}