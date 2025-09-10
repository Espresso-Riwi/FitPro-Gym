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
public class ExerciseFive {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un dumero: ");
        int num = sc.nextInt();
        
        if(num >0){
            System.out.println("Este numero es positivo.");
        }else if(num < 0){
            System.out.println("Este numero es negativo.");
        }else {
            System.out.println("Este numero es cero.");
        }
    }
    
}
