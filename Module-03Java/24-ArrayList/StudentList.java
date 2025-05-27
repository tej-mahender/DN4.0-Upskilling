import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter student names. Type 'done' to finish:");

        while (true) {
            System.out.print("Enter a name: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(input);
        }

        System.out.println("\nList of student names entered:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
