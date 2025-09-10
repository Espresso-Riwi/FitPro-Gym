import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Activities a = new Activities();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an activity:");
        System.out.println("1 - Activity 1");
        System.out.println("2 - Activity 2");
        System.out.println("3 - Activity 3");
        System.out.println("4 - Activity 4");
        System.out.println("5 - Activity 5");
        System.out.println("6 - Activity 6");
        System.out.println("7 - Activity 7");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                a.activityOne();
                break;
            case 2:
                a.activityTwo();
                break;
            case 3:
                a.activityThree();
                break;
            case 4:
                a.activityFour();
                break;
            case 5:
                a.activityFive();
                break;
            case 6:
                a.activitySix();
                break;
            case 7:
                a.activitySeven();
                break;
            default:
                System.out.println("Invalid option. Please choose between 1 and 7.");
        }
        sc.close();
    }
}
