/*
 * Activity 7 - Switch Statement
 * Program that asks for a number from 1 to 7 and displays the day of the week:
 * 1 → Monday, 2 → Tuesday, 3 → Wednesday, 4 → Thursday, 
 * 5 → Friday, 6 → Saturday, 7 → Sunday
 */
import java.util.Scanner;

public class activity7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("        ACTIVITY 7 - Switch Statement    ");
        System.out.println("==========================================");
        
        // Ask for a number from 1 to 7
        System.out.print("Enter a number from 1 to 7: ");
        int dayNumber = input.nextInt();
        
        System.out.println("\nNumber entered: " + dayNumber);
        System.out.println("------------------------------------------");
        
        // Use switch statement to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Day of the week: Monday");
                break;
            case 2:
                System.out.println("Day of the week: Tuesday");
                break;
            case 3:
                System.out.println("Day of the week: Wednesday");
                break;
            case 4:
                System.out.println("Day of the week: Thursday");
                break;
            case 5:
                System.out.println("Day of the week: Friday");
                break;
            case 6:
                System.out.println("Day of the week: Saturday");
                break;
            case 7:
                System.out.println("Day of the week: Sunday");
                break;
            default:
                System.out.println("Error: Invalid number!");
                System.out.println("Please enter a number between 1 and 7");
                break;
        }
        
        System.out.println("==========================================");
        
        input.close();
    }
}