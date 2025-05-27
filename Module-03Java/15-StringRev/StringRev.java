import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Use StringBuilder to reverse the string
        String rev = new StringBuilder(str).reverse().toString();

        //Using Loop
        // String rev = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev += str.charAt(i);
        // }


        // Display the reversed string
        System.out.println("Reversed string: " + rev);

        scanner.close();
    }
}
