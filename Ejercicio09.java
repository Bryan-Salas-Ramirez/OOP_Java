// Programación Orientada a Objetos
// Actividad 9 Condicional Compuesto
// 19/09/2024
// Salas Ramírez Bryan Humberto

// Este programa Evalúa 3 números enteros y los organiza de mayor a menor

public class Ejercicio09{

    public static void main(String[] args){
        // Variables
        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        // Se declaran tres variables auxiliar para guardar el valor del mayor, medio y menor.
        // se le asigna el valor del primer número para poder evaluarlo al inicio
        int mayor = num1;
        int menor = num1;
        int medio = num1;

        //Se compara si es mayor el valor del número 2 con el del mayor, de ser cierto este se vuelve el nuevo mayor
        if(num2 > mayor){
            mayor = num2;
        }
        // Se compara si es menor el valor del número 2 con el del menor, de ser cierto este se vuelve el nuevo menor
        else if(num2 < menor){
            menor = num2;
        }
        // Se compara si es mayor el valor del número 3 con el del mayor, de ser cierto este se vuelve el nuevo mayor
        if(num3 > mayor){
            mayor = num3;
        }
        // Se compara si es menor el valor del número 3 con el del menor, de ser cierto este se vuelve el nuevo menor
        else if(num3 < menor){
            menor = num3;
        }

        // Se compara si los números son mayor que uno y menor que el otro, de ser cierto se vuelven el nuevo número medio
        if(num1 > menor && num1 < mayor){
            medio = num1;
        }else if(num2 > menor && num2 < mayor){
            medio = num2;
        }else if(num3 > menor && num3 < mayor){
            medio = num3;
        }

        // Se imprimen los valores finales ordenados de mayor a menor
        System.out.println("Los números de mayor a menor son: \n" + mayor + "\n" + medio + "\n" + menor);

    }

}

//Fin del Archivo