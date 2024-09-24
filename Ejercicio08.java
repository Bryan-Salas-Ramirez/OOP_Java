// Programación Orientada a Objetos
// Ejercicio08
// 12/09/2024
// Bryan Humberto Salas Ramírez

public class Ejercicio08{

    public static void main(String[] args){

        //Este programa evalúa los requisitos necesarios para obtener una licencia de conducir
        //Variables
        byte edad = 19, calificación = 7;

        System.out.println("*********************************************");
        System.out.println("Sistema de Obtención de Licencias de conducir ");
        System.out.println("********************************************* \n");

        System.out.println("Su edad es: " + edad);
        System.out.println("Su calificación es: " + calificación);

        //Se crea una estructura condicional para evaluar si el interesado cumple la mayoría de edad
        if(edad >= 18){
            //Se evalúa si la persona obtiene una calificación satisfactoria
            if(calificación >= 8){
                System.out.println("Felicidades, Obtuviste tu Licencia!");
            }else{
                System.out.println("Calificación Insuficiente, Vuelva a Intentarlo");
            }
        }else{
            System.out.println("Usted no Tiene la edad para Obtener una Licencia");
        }

    }

}

//Fin del Archivo