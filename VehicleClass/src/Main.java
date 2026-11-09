import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a vehicle object parameterized constructor
        Vehicle myVehicle = new Vehicle(
            "1KXE4356712543214", "Jeep", "Grand Cherokee", 2006, "Tan",
            105000, 3500.00, 'A', "LIMITED", 'G',
            true, 1, 85, LocalDate.of(2026, 6, 19)
        );

        // Call method and print each attribute
        String[] details = myVehicle.listVehicleInformation();
        for (String info : details) {
            System.out.println(info);
        }
    }
}
