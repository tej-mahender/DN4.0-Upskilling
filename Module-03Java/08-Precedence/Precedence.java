public class Precedence {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        // Multiplication has higher precedence than addition
        // So, it's evaluated as: 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("Result of 10 + 5 * 2 = " + result1);

        int result2 = (10 + 5) * 2;
        // Parentheses change the precedence
        // So, it's evaluated as: (10 + 5) * 2 = 15 * 2 = 30
        System.out.println("Result of (10 + 5) * 2 = " + result2);

        int result3 = 100 / 5 + 10 - 3;
        // Division first, then addition and subtraction (left to right)
        // (100 / 5) = 20 → 20 + 10 = 30 → 30 - 3 = 27
        System.out.println("Result of 100 / 5 + 10 - 3 = " + result3);

        int result4 = 2 + 3 * 4 - 8 / 2;
        // (3*4) = 12, (8/2) = 4 → 2 + 12 - 4 = 10
        System.out.println("Result of 2 + 3 * 4 - 8 / 2 = " + result4);
    }
}
