import java.util.Scanner;

public class FitProGym {
    Scanner sc = new Scanner(System.in);
    public void menu(){
        Person p = new Person();
        double total = 0;
        double discount = 0;
        boolean flag = true;

        while (flag){
            System.out.println("Welcome to FitPro-Gym");
            System.out.print("Is your first time here?\n1. Yes\n2. No\nChoose one: ");
            String option = sc.nextLine();

            switch (option){
                case "1":
                    p.setFirstTime(true);
                    discount = discount + 0.10;
                    break;
                case "2":
                    p.setFirstTime(false);
                    break;
                default:
                    System.out.println("Choose a correct option.");
            }

            System.out.print("What's your name?: ");
            String name = sc.nextLine();
            p.setName(name);

            System.out.print("What plan do you want?\n1. Basic 80.0$\n2. Plus 120.0$\n3. Premium 180$\nChoose one: ");

            option = sc.nextLine();
            switch (option){
                case "1":
                    p.setPlan("Basic");
                    total = 80.0;
                    break;
                case "2":
                    p.setPlan("Plus");
                    total = 120.0;
                    break;
                case "3":
                    p.setPlan("Premium");
                    total = 180.0;
                    break;
                default:
                    System.out.println("Choose a correct option.");
            }
            System.out.print("How old are you?: ");
            int age = sc.nextInt();

            if (age >= 18 && age <= 26){
                discount = discount + 0.10;
                p.setAge(age);
            }else if(age >= 14 && age < 18){
                System.out.println("Requires guardian authorization");
                discount = discount + 0.10;
                p.setAge(age);
            }else if (age < 14){
                System.out.println("You cannot enter here because you are too young.");
                flag = false;
                continue;
            }else{
                p.setAge(age);
            }

            System.out.println("Calculate Body mass index");

            System.out.print("Enter your weight: ");
            double weight = sc.nextDouble();
            p.setWeight(weight);

            System.out.print("Enter you height: ");
            double height = sc.nextDouble();
            p.setHeight(height);

            double bmi = weight / (height * height);
            if (bmi >= 30){
                System.out.println("You are obese.");
            }else if (bmi >= 25 && bmi <= 29.99){
                System.out.println("You are overweight.");
            }else if(bmi >= 18.5 && bmi <= 24.9){
                System.out.println("You are good.");
            }else if(bmi < 18.5){
                System.out.println("You are underweight.");
            }
            personData(p);
            System.out.println("-----Information-----");
            System.out.println("Discount: "+(discount*100)+"%");
            System.out.println("Base price: "+total);
            total =  total * (1 - discount);
            System.out.println("Total price: "+total);
            flag = false;
            sc.close();
        }
    }

    public void personData (Person p){
        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Plan: "+p.getPlan());
        System.out.println("Height: "+p.getHeight());
        System.out.println("Weight: "+p.getWeight());
        System.out.println("First time: "+p.isFirstTime());
    }
}