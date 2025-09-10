package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String actividad;
        do {
            System.out.println("ACTIVIDADES\nActividad 1 Datos simples  :\nActividad 2 Condicionales\nActividad 3 Operadores\nActividad 4 Fitpro Gym");
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
                case "4":
                    actividad4();
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                    ;

            }
        } while (actividad != "5");
    }

    private static void actividad1() {
        String nombre = "Samuel";
        int edad = 18;
        double altura = 1.77;
        boolean estudiante = true;
        char inicial = 's';

        System.out.println("Hola mi nombre es " + nombre + ", tengo " + edad + " años, mido " + altura + ", ¿soy estudiante? " + estudiante + "y mi inicial es " + inicial);
    }

    private static void actividad2() {
        //1 actividad if-else
        System.out.println("Ingrese su numero entero: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Es cero");
        }
        if (num > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

        //2 actividad if-else if
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        //3 actividad switch
        System.out.println("Ingrese un numero del 1 al 8: ");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }
    }

    private static void actividad3() {
        //1 actividad
        int a = 5;
        int b = 2;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = a / b;
        double modulo = a % b;
        System.out.println("Los numeros son a=5 b=2\n la suma es: " + suma + ", la resta es: " + resta + ", la multiplicacion es: " + multiplicacion + ", la division es:" + division + " y el modulo es: " + modulo);

        //2 actividad
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //3 actividad
        System.out.println("Ingrese sus dos numeros enteros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println("Los 2 positivos");

        }
        if (num1 > 100 || num2 > 100) {
            System.out.println("almenos uno es mayor a 100");
        }
        if (num1 != num2) {
            System.out.println("el primero no es igual al segundo");
        }

    }

    private static void actividad4() {
        String nombre;
        int edad;
        double altura;
        double peso;
        String plan;
        boolean primeraVez;
        double total;
        double bmi;
        int base;
        int veces = 0;
        String bmii;
        System.out.println("BIENVENIDO A FIT PRO GYM\nIngrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        if (edad < 14) {
            System.out.println("No eres elegible para poder ingresar a FIT PRO GYM :(");
            return;
        }
        if (edad < 18 && edad >= 14) {
            System.out.println("Necesita AUTORIZACION de acudiente");
        }
        System.out.println("Ingrese su altura en metros: ");
        altura = input.nextDouble();
        System.out.println("Ingrese su peso en Kg: ");
        peso = input.nextDouble();
        System.out.println("¿Es su primera vez en FIT PRO GYM?\nY/N");
        String vez = input.nextLine().toLowerCase();
        System.out.println("Escoja uno de nuestros planes\nIngrese\nBASICO Para Plan basico de $ 80.0\nPLUS Para plan Plus de $ 120.0\nPREMIUM Para plan Premium de $ 180.0 ");
        plan = input.nextLine().toLowerCase();

        if (vez == "y") {
            primeraVez = true;
        } else {
            primeraVez = false;
        }

        switch (plan) {
            case "basico":
                total = 80.0;
                base = 80;
                break;
            case "plus":
                total = 120.0;
                base = 120;
                break;
            case "premium":
                total = 180.0;
                base = 180;
                break;
            default:
                System.out.println("ERROR, ingresaste un dato invalido para el plan");
        }
        double desc = total*0.10;
        if (primeraVez == true);
        {
            total -= desc;
            veces +=1;
        }
        
        if (edad >= 16 && edad <= 25){
            total -= desc;
            veces +=1;
        }
        
        bmi = peso / (altura * altura);
        
        if (bmi < 18.5) {
            bmii = "Bajo peso";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            bmii = "Normal";
        }else if (bmi >= 25 && bmi <= 29.9) {
            bmii = "Sobrepeso";
        }else if (bmi >= 30) {
            bmii = "Obesidad";
        }
        
        System.out.println("RESUMEN:\n"+nombre+"\n"+plan+"precio base: "+base+"descuento aplicado: "+desc*veces+"total:"+total+"categorai de BMI:"+bmi);
        
    }
}
