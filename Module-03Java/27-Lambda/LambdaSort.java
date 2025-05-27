import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Alex");
        names.add("John");
        names.add("Maria");

        System.out.println("Before sorting:");
        System.out.println(names);

        // Sort the list using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("\nAfter sorting:");
        System.out.println(names);
    }
}
