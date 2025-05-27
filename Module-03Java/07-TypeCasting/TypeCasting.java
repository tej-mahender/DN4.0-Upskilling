
public class TypeCasting {
    public static void main(String[] args) {
        // Declare a double variable
        double d = 9.75;

        // Cast double to int (explicit casting)
        int i = (int) d;
        System.out.println("Original double value: " + d);
        System.out.println("After casting to int: " + i);

        // Declare an int variable
        int n = 42;

        // Cast int to double (implicit casting)
        double a = n;
        System.out.println("Original int value: " + n);
        System.out.println("After casting to double: " + a);
    }
}
