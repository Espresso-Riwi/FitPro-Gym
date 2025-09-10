/*
 * Activity 5 - If-Else Statements
 * Program that receives an integer and prints:
 * "Positive" if greater than 0
 * "Negative" if less than 0  
 * "Zero" if exactly 0
 */
import java.util.Scanner;

public class activity5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("        ACTIVITY 5 - If-Else Statements  ");
        System.out.println("==========================================");
        
        // Ask for an integer number
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        
        System.out.println("\nNumber entered: " + number);
        System.out.println("------------------------------------------");
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Result: Positive");
            System.out.println("The number " + number + " is greater than 0");
        } else if (number < 0) {
            System.out.println("Result: Negative");
            System.out.println("The number " + number + " is less than 0");
        } else {
            System.out.println("Result: Zero");
            System.out.println("The number " + number + " is exactly 0");
        }
        
        System.out.println("==========================================");
        
        input.close();
    }
}