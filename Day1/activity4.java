/*
 * Activity 4 - Logical Operators
 * Ask for two integers and verify logical conditions using &&, ||, and ! operators
 */
import java.util.Scanner;

public class activity4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("        ACTIVITY 4 - Logical Operators   ");
        System.out.println("==========================================");
        
        // Ask for two integers
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();
        
        System.out.println("\nNumbers entered: " + number1 + " and " + number2);
        System.out.println("------------------------------------------");
        
        // Condition 1: Both are positive (using && operator)
        boolean bothPositive = (number1 > 0) && (number2 > 0);
        System.out.println("Both are positive : " + bothPositive);
        
        // Condition 2: At least one is greater than 100 (using || operator)
        boolean atLeastOneGreater100 = (number1 > 100) || (number2 > 100);
        System.out.println("\nAt least one is greater than 100: " + atLeastOneGreater100);
        
        // Condition 3: The first is not equal to the second (using ! operator)
        boolean notEqual = !(number1 == number2);
        System.out.println("\nThe first is not equal to the second: " + notEqual);
        
        System.out.println("\n==========================================");
        System.out.println("Summary:");
        System.out.println("Both are positive: " + bothPositive);
        System.out.println("At least one is greater than 100: " + atLeastOneGreater100);
        System.out.println("The first is not equal to the second: " + notEqual);
        System.out.println("==========================================");
        
        input.close();
    }
}