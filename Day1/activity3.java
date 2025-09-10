/*
 * Activity 3 - Age Check
 * Ask user for age and print true if >= 18, false if younger
 */
import java.util.Scanner;

public class activity3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("           ACTIVITY 3 - Age Check        ");
        System.out.println("==========================================");
        
        // Ask for user's age
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        // Check if age is greater than or equal to 18
        boolean isAdult = age >= 18;
        
        System.out.println("\nYour age is: " + age);
        
        if (isAdult) {
            System.out.println("Result: You are 18 or older");
        } else {
            System.out.println("Result: You are under 18");
        }
        
        System.out.println("==========================================");
        
        input.close();
    }
}