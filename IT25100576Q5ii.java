public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Returns the square of an integer
    public int square(int a) {
        return a * a;
    }
}

public class IT25100576Q5ii {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // (4 + 7)^2
        int sum1 = calc.add(4, 7);
        int square1 = calc.square(sum1);

        // (8 + 3)^2
        int sum2 = calc.add(8, 3);
        int square2 = calc.square(sum2);

        // Final result
        int result = calc.add(square1, square2);

        System.out.println("Result = " + result);
    }
}