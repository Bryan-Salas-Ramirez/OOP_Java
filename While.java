// Programación Orientada a Objetos
// While
// 24/09/2024
// Por: Salas Ramírez Bryan Humberto

//
import java.util.Scanner;

public class While{

    public static void main(String[] args){
        // Variables Globales
        char continuar;
        Scanner input = new Scanner(System.in);

        do{
            //Variable Operativa Do While
            int count = 1;
            System.out.print("Ingrese el número de la Tabla que desea obtener: ");
            int tabla = input.nextInt();
    
            System.out.println("TABLA DEL " + tabla);
    
            while(count <= 10){    //Header
                // Instrucciones
                System.out.println(tabla + " x " + count + " = " + (tabla * count));
                count ++;
            }

            System.out.print("¿Quiere Obtener la Tabla de otro número? Si/No: ");
            continuar = input.next().charAt(0);

        }while(continuar == 's');

        System.out.println("¡Salió del Programa con Éxito!");
    }
}

//Fin del archivo