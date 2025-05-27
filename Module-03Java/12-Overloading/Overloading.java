public class Overloading {

    // Method 1: Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Calling each overloaded method
        int sum1 = add(10, 20);
        double sum2 = add(5.5, 4.5);
        int sum3 = add(1, 2, 3);

        // Displaying results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}
