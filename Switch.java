// Programación Orientada a Objetos
// Repo Switch case
// 19/09/2024
// Por: Salas Ramírez Bryan Humberto

import java.util.Scanner;

public class Switch{

    public static void main(String[] args){

        /*Scanner input = new Scanner (System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Tu nombre es: " + nombre);*/

        Scanner input = new Scanner (System.in);

        System.out.print("Introduce valor 1: ");
        double valor1 = input.nextDouble();

        System.out.print("Introduce valor 2: ");
        double valor2 = input.nextDouble();

        System.out.println("-------------------------");
        System.out.println("SUMA....................[1]");
        System.out.println("RESTA...................[2]");
        System.out.println("MULTIPLICACIÓN..........[3]");
        System.out.println("-------------------------");

        System.out.print("Introduce una operación: ");
        int operacion = input.nextInt();

        switch(operacion){
            case 1:
               System.out.println("La suma es: " + (valor1 + valor2));
            break;
            case 2:
               System.out.println("La resta es: " + (valor1 - valor2));
            break;
            case 3:
               System.out.println("La multiplicación es: " + (valor1 * valor2));
            break;
            default:
               System.out.println("Esa operación NO está disponible! ");
            break;
        }

    }

}

//Fin del Archivo