import java.util.List;
import java.util.stream.Collectors;

// Define a record named Person
record Person(String name, int age) {}

public class Record{
    public static void main(String[] args) {
        // Create instances of Person
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 25);

        // Print individual records
        System.out.println("All Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Create a list of Persons
        List<Person> people = List.of(p1, p2, p3);

        // Filter people who are 18 or older
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nAdults (age 18+):");
        adults.forEach(System.out::println);
    }
}
