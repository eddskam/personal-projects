public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
<<<<<<< HEAD
            throw new IllegalArgumentException("Cannot divide by zero");
=======
            System.err.println("Error: Division by zero is not allowed.");
            return 0;
>>>>>>> main
        }
        return (double) a / b;
    }

<<<<<<< HEAD
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
=======
    public int modulo(int a, int b) {
        return a % b;
>>>>>>> main
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
<<<<<<< HEAD
        System.out.println("=== Feature Branch Calculator ===");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        System.out.println("10 ^ 5 = " + calc.power(10, 5));
=======
        System.out.println("--- Main Branch Calculator ---");
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
        System.out.println("Modulo: " + calc.modulo(10, 5));
>>>>>>> main
    }
}
