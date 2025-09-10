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
public class ExerciseFour {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.println("Ambos numeros son positivos:" + (num1 >0 && num2 >0));
        System.out.println("Al menos uno es mayor que 100: " + (num1 >100 || num2 >100));
        System.out.println("el primero no es igual al segundo: " + (num1!= num2));
        
    }
    
}
