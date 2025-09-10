/*
 * Activity 1 - Simple Data Types
 * This program declares variables with personal data
 * and displays a message using those variables.
 */

public class activity1 {

    public static void main(String[] args) {

        // Declare variables with your personal data
        String name = "Samuel";
        int age = 21;
        double height = 1.72;
        boolean student = true;
        char initial = 'S';

        // Print message in console with personal information
        System.out.println("Hello, my name is " + name + ", I am " + age +
                " years old, I am " + height + " meters tall and my initial is " +
                initial + ".");

        // Additional information about student status
        if (student) {
            System.out.println("I am currently a student in Riwi.");
        } else {
            System.out.println("I am not currently a student in Riwi.");
        }

        // Display variable types and values
        System.out.println("\n--- Variable Information ---");
        System.out.println("Name (String): " + name);
        System.out.println("Age (int): " + age);
        System.out.println("Height (double): " + height);
        System.out.println("Student (boolean): " + student);
        System.out.println("Initial (char): " + initial);
    }
}