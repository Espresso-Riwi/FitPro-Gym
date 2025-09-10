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
public class ExerciseSix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        int age = sc.nextInt();
        
        if(age <= 0){
            System.out.println("ingresa un numero mayor a cero.");
        }else if(age <=12){
            System.out.println("Eres un niño.");
        }else if(age >12 && age <=17){
            System.out.println("Eres un adolecente");
        }else {
            System.out.println("Eres un adulto");
        }
        
    }
    
}
