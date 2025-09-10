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
public class ExerciseTwo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    
        
        System.out.println("Ingresa un primer numero:");
        int numOne = sc.nextInt();
        System.out.println("Ingresa un sugundo numero:");
        int numTwo = sc.nextInt();
        
        System.out.println("Suma:"+ (numOne + numTwo));
        System.out.println("Resta:"+ (numOne - numTwo));
        System.out.println("Multiplicación:"+ (numOne * numTwo));
        System.out.println("División:"+ (numOne / numTwo));
        System.out.println("Módulo:"+ (numOne % numTwo));
    }
    
}
