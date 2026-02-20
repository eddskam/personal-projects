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
            System.err.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("--- Main Branch Calculator ---");
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
        System.out.println("Modulo: " + calc.modulo(10, 5));
    }
}
