public class PatternMatching {
    public static void main(String[] args) {
        printTypeInfo(42);
        printTypeInfo("Hello, world!");
        printTypeInfo(3.14);
        printTypeInfo(true);
        printTypeInfo(null);
    }

    public static void printTypeInfo(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            case Boolean b -> "It's a Boolean: " + b;
            case null      -> "It's null!";
            default        -> "Unknown type: " + obj;
        };
        System.out.println(result);
    }
}
