import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding entries
        System.out.println("Add student ID and name. Type 'done' to finish.");

        while (true) {
            System.out.print("Enter student ID (integer): ");
            String idInput = scanner.nextLine();
            if (idInput.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int id = Integer.parseInt(idInput);
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a valid integer.");
            }
        }

        // Retrieve a name by ID
        System.out.print("\nEnter an ID to retrieve the student name: ");
        try {
            int searchId = Integer.parseInt(scanner.nextLine());
            if (studentMap.containsKey(searchId)) {
                System.out.println("Student name: " + studentMap.get(searchId));
            } else {
                System.out.println("No student found with ID " + searchId);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID entered.");
        }

        scanner.close();
    }
}
