import java.util.Scanner;

public class Activities {
    public void activityOne (){

        String name = "Emmanuel Rendon";
        int age = 22;
        double height = 1.75;
        boolean student = true;
        char initial = 'E';

        System.out.println("My name is "+name+ "I'm "+age+" years old and I am "+height+" meters tall." +
                "My initial is "+initial+ "\nAm i a student? "+student);

    }

    public void activityTwo() {
        int a = 10;
        int b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double) a / b));
        System.out.println("Modulo: " + (a % b));
    }

    public void activityThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean isAdult = age >= 18;
        System.out.println(isAdult);
    }

    public void activityFour() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Both positive? " + (num1 > 0 && num2 > 0));
        System.out.println("At least one greater than 100? " + (num1 > 100 || num2 > 100));
        System.out.println("Are they different? " + (num1 != num2));
    }

    public void activityFive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("It is positive");
        } else if (num < 0) {
            System.out.println("It is negative");
        } else {
            System.out.println("It is zero");
        }
    }

    public void activitySix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 12 && age <= 17) {
            System.out.println("Teenager");
        } else if (age < 12) {
            System.out.println("Child");
        } else {
            System.out.println("Adult");
        }
    }


    public void activitySeven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number. Must be between 1 and 7.");
        }
    }

}
