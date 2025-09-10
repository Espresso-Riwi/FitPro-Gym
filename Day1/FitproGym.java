/*
 * This program is for the registration of new members at a gym.
 * It collects personal information and the user's selected plan,
 * calculates pricing with discounts, and provides BMI analysis.
 */
import java.util.Scanner;

public class FitproGym {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Welcome message
        System.out.println("==============================================");
        System.out.println("          Welcome to FitPro Gym 🏋️           ");
        System.out.println("We'll ask a few questions to complete your registration.");
        System.out.println("==============================================\n");
        
        // Collect user information
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your height in meters (e.g., 1.72): ");
        double height = input.nextDouble();
        
        System.out.print("Enter your weight in kilograms (e.g., 72): ");
        double weight = input.nextDouble();
        
        // Clear the buffer
        input.nextLine();
        
        // Get plan selection
        System.out.println("\nAvailable membership plans:");
        System.out.println("  1. BASIC ($80.0)");
        System.out.println("  2. PLUS ($120.0)");
        System.out.println("  3. PREMIUM ($180.0)");
        System.out.print("Please enter your choice (BASIC, PLUS, or PREMIUM): ");
        String plan = input.nextLine().toUpperCase();
        
        System.out.print("Is this your first time registering with us? (true/false): ");
        boolean firstTime = input.nextBoolean();
        
        input.close();
        
        // Check age eligibility first
        if (age < 14) {
            System.out.println("\n==============================================");
            System.out.println("            Registration Status               ");
            System.out.println("==============================================");
            System.out.println("Status: Not eligible");
            System.out.println("Reason: You must be at least 14 years old");
            System.out.println("Don't worry, we'll be waiting for you!");
            System.out.println("==============================================");
            return; // Exit the program
        }
        
        if (age < 18) {
            System.out.println("\n==============================================");
            System.out.println("            Registration Status               ");
            System.out.println("==============================================");
            System.out.println("Status: Requires guardian authorization");
            System.out.println("Reason: You must be at least 18 years old");
            System.out.println("Please bring a parent or guardian to complete");
            System.out.println("your registration.");
            System.out.println("==============================================");
            return; // Exit the program
        }
        
        // Calculate base price
        double basePrice = 0.0;
        if (plan.equals("BASIC")) {
            basePrice = 80.0;
        } else if (plan.equals("PLUS")) {
            basePrice = 120.0;
        } else if (plan.equals("PREMIUM")) {
            basePrice = 180.0;
        } else {
            System.out.println("Invalid plan selected. Defaulting to BASIC.");
            plan = "BASIC";
            basePrice = 80.0;
        }
        
        // Calculate discounts
        double totalDiscount = 0.0;
        
        if (firstTime) {
            totalDiscount += 0.10; // 10% first-time discount
        }
        
        if (age >= 16 && age <= 25) {
            totalDiscount += 0.10; // 10% young member discount
        }
        
        // Cap discount at 20%
        if (totalDiscount > 0.20) {
            totalDiscount = 0.20;
        }
        
        // Calculate final price
        double finalPrice = basePrice * (1 - totalDiscount);
        
        // Calculate BMI
        double bmi = weight / (height * height);
        String bmiCategory = "";
        
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            bmiCategory = "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obesity";
        }
        
        // Display registration summary
        System.out.println("\n==============================================");
        System.out.println("            Registration Summary              ");
        System.out.println("==============================================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Selected Plan: " + plan);
        System.out.println("First-time member: " + (firstTime ? "Yes" : "No"));
        System.out.println("----------------------------------------------");
        System.out.println("Base Price: $" + String.format("%.2f", basePrice));
        System.out.println("Discount Applied: " + String.format("%.0f", totalDiscount * 100) + "%");
        System.out.println("Final Monthly Price: $" + String.format("%.2f", finalPrice));
        System.out.println("BMI Category: " + bmiCategory);
        System.out.println("==============================================");
        System.out.println("Welcome to FitPro Gym! 💪");
        System.out.println("==============================================");
    }
}