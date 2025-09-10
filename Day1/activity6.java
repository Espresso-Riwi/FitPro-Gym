/*
 * Activity 6 - If-Else If Statements
 * Program that asks for user's age and displays:
 * "Child" if less than 12
 * "Teenager" if between 12 and 17
 * "Adult" if 18 or older
 */
import java.util.Scanner;

public class activity6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("      ACTIVITY 6 - If-Else If Statements ");
        System.out.println("==========================================");
        
        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("\nAge entered: " + age);
        System.out.println("------------------------------------------");
        
        // Classify by age group using if-else if statements
        if (age < 12) {
            System.out.println("Category: Child");
            System.out.println("You are less than 12 years old");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Category: Teenager");
            System.out.println("You are between 12 and 17 years old");
        } else {
            System.out.println("Category: Adult");
            System.out.println("You are 18 or older");
        }
        
        System.out.println("==========================================");
        
        input.close();
    }
}