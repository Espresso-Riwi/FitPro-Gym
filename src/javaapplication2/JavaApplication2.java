
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String actividad;
        do{
            
        System.out.println("ACTIVIDADES\nActividad 1:\nActividad 2\nActividad 3");
        actividad = input.nextLine();
        switch (actividad) {
            case "1":
                actividad1();
                break;
            case "2":
                actividad2();
                break;
            case "3":
                actividad3();
                break;
            default:
                throw new AssertionError();

            }
        }
        while(actividad != "4");
        }

    private static void actividad1() {
        System.out.println("actividad1");
   
    }

    private static void actividad2() {
        System.out.println("actividad2");
        
    }
    private static void actividad3() {
        System.out.println("actividad3");
        
    }
    }

    

