/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaFundamentals;

import java.util.Scanner;

/**
 *
 * @author javasprinboot
 */
public class FitProGym {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Declaration of variables
        
        String fullName;
        int age;
        double height;
        double weight;
        String plan;
        boolean firstTime;
        
        final double basic = 80.0;
        final double plus = 120.0;
        final double premium = 180.0;
        
        
        System.out.println("Bienvenido a FitPro Gymn"
                + "Diligencia la siguiente informacion:");
        
        System.out.println("Ingresa tu nombre: ");
        fullName = scanner.nextLine();
        
        while (true) {
            System.out.println("Ingresa tu edad: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                
                if (age > 0 && age < 100) {
                    break;
                } else {
                    System.out.println("Ingrese un edad valida");
                }
            } else {
                System.out.println("Ingrese un numero valido");
                scanner.nextLine();
            }
        
        }
        
        while (true) {
            System.out.println("Ingresa tu altura (en metros): ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                
                if(height > 0){
                    break;
                }else {
                    System.out.println("Ingresa un altura valido");
                }
                
                
            } else {
                System.out.println("Ingresa un numero valido");
                scanner.nextLine();
            }   
        }
        
        while (true) {
            System.out.println("Ingresa tu peso (en kg):");
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
            
                if(weight > 0){
                    break;
                }else {
                    System.out.println("Ingresa un peso valido");
                }
                
                
            } else {
                System.out.println("Ingresa un numero valido");
                scanner.nextLine();
            }   
        }
        
        System.out.println("Escoge un plan (BASICO, PLUS, PREMIUM): ");
        plan = scanner.nextLine();
        
        
        
        
    }
    
}
