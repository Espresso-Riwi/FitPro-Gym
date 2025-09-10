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
public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa un numero del 1 al 7:");
        
        int day = sc.nextInt();
        
        switch(day){
            case 1:
                System.out.println("Es Lunes.");
                break;
            
            case 2:
                System.out.println("Es Martes.");
                break;
                  
            case 3:
                System.out.println("Es Miercoles.");
                break;
                
            case 4:
                System.out.println("Es Jueves.");
                break;
                
            case 5:
                System.out.println("Es Viernes.");
                break;
                
            case 6:
                System.out.println("Es Sabado.");
                break;
                
            case 7:
                System.out.println("Es Domingo.");
                break;
                
            default:
                System.out.println("Numero invalido.");
        
        }
    }
    
}
