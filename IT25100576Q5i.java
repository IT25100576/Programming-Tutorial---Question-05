public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to find the square of an integer
    public int square(int a) {
        return a * a;
    }
}

public class IT25100576Q5i {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);

        int sum = calc.add(part1, part2);
        int result = calc.square(sum);

        System.out.println("Result = " + result);
    }
}