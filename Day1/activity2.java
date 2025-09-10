/*
 * Activity 2 - Arithmetic Operations
 * This program declares two integer numbers (a and b)
 * and performs basic arithmetic operations.
 */

public class activity2 {

    public static void main(String[] args) {

        // I will declare two integer numbers
        int a = 15;
        int b = 4;

        // I will display the numbers we're working with
        System.out.println("Working with numbers: a = " + a + " and b = " + b);
        System.out.println("==========================================");

        // Calculate and display arithmetic operations

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + a + " + " + b + " = " + sum);

        // Subtraction
        int subtraction = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + subtraction);

        // Multiplication
        int multiplication = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + multiplication);

        // Division (integer division)
        int division = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + division);

        // Module (remainder)
        int module = a % b;
        System.out.println("Module: " + a + " % " + b + " = " + module);

        System.out.println("==========================================");

        // Additional information about division
        System.out.println("Note: Since we're using integers, division gives us");
        System.out.println("the quotient without decimals. The remainder is: " + module);

        // Show decimal division for comparison
        double decimalDivision = (double) a / b;
        System.out.println("Decimal division: " + a + " / " + b + " = " +
                String.format("%.2f", decimalDivision));
    }
}