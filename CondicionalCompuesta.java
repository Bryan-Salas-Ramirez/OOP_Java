// Programación Orientada a Objetos
// Estructura Condicional Compuesta
// 12/09/2024
// Por: Bryan Humberto Salas Ramírez

public class CondicionalCompuesta{
    public static void main(String[] args){
        /*
            //Variables

            int edad = 18;
            int examen = 7;

            if (edad >= 18 && examen >=8){
                System.out.println("Licencia de conducir APROBADA!");

            }else{
                System.out.println("Licencia de conducir RECHAZADA!");
            }
        */

       //Calculadora Básica
       //Variables
       int operacion = 5;
       double num1= 4, num2 = 5, resultado = 0;

       //Comparar la operación

       if(operacion == 1){
        resultado = num1 + num2;
        System.out.println("El resultado de tu SUMA es: " + resultado);
       }else if(operacion == 2){
            resultado = num1 - num2;
            System.out.println("El resultado de tu RESTA es: " + resultado);
       }else if(operacion == 3){
            resultado = num1 * num2;
            System.out.println("El resultado de tu MULTIPLICACIÓN es: " + resultado);
       }else if(operacion == 4){
            resultado = num1 / num2;
            System.out.println("El resultado de tu DIVISIÓN es: " + resultado);
       }else{
            System.out.println("No existe esa Operación ");
       }
    }
}
// Fin del Archivo