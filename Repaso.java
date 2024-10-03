// Programación Orientada a Objetos
// Repaso para Examen
// 02/10/2024
// Por: Salas Ramírez Bryan Humberto

// Este priograma está conformado por varios ejercicios que cumplen el fin de
// practicar la sintáxis y lógica aplicada hasta ahora

import java.util.Scanner;

public class Repaso{

    public static void main(String[] args){
        //Variables globales
        char repetir1;
        Scanner input = new Scanner(System.in);

        do{
            int operacion = 0;

            System.out.println("********************************");
            System.out.println("  BIENVENIDO AL MENÚ PRICINPAL");
            System.out.println("********************************");
            System.out.println("\n1. Evaluar Par o Impar");
            System.out.println("2. Imprimir Tabla de Multiplicar");
            System.out.println("3. Encontrar el MAYOR de dos números");
            System.out.println("4. Obtener Área de un Cuadrado");
            System.out.println("5. Obtener Área de un Rectángulo");
            System.out.println("6. Evaluar si un número es PRIMO");
            System.out.println("7. Obtener Área de un Triángulo");
            System.out.println("8. Mostrar Rectángulo de Estrellas");
            System.out.println("9. Mostrar Pirámide de Estrellas");
            System.out.println("10. Obtener el MAYOR, MENOR, la SUMA y PROMEDIO de 10 números");
            System.out.print("\nSeleccione la operación a realizar: ");
            operacion = input.nextInt();
            double lado, base, altura;


            switch(operacion){
                case 1:
                    System.out.print("\nIngrese un número para Evaluar si es Par o Impar: ");
                    int parImpar = input.nextInt();
                    if (parImpar % 2 == 0) {
                        System.out.println(parImpar + ": Es PAR");
                    }else{
                        System.out.println(parImpar + ": Es IMPAR");
                    }// Fin de if/else
                break;
                case 2:
                    System.out.print("\nIngrese un número para Conocer su Tabla de Multiplicar: ");
                    int tabla = input.nextInt();
                    System.out.println("La tabla del " + tabla + " es:");
                    for(int i = 1; i < 10; i++){
                        System.out.println(tabla + " * " + i + "= " + (tabla * i));
                    }// Fin de For
                break;
                case 3:
                    System.out.println("\nSe evaluarán dos números de su elección y devolverá el MAYOR");
                    System.out.print("Ingrese el primer número: ");
                    int num1 = input.nextInt();
                    System.out.print("\nIngrese el segundo número: ");
                    int num2 = input.nextInt();
                    if (num1 > num2) {
                        System.out.println(num1 + ": Es el mayor");
                    }else{
                        System.out.println(num2 + ": Es el mayor");
                    }// Fin if/else
                break;
                case 4:
                    System.out.println("\nSe obtendrá el Área de un cuadrado");
                    System.out.print("Ingrese el Tamaño de un Lado: ");
                    lado = input.nextDouble();
                    System.out.println("El Área del Cuadrado es: " + (lado * lado));
                break;
                case 5:
                    System.out.println("\nSe obtendrá el Área de un Rectángulo");
                    System.out.print("Ingrese el Tamaño de la Base: ");
                    base = input.nextDouble();
                    System.out.print("\nIngrese el Tamaño de la Altura: ");
                    altura = input.nextDouble();
                    System.out.println("El Área del Rectángulo es: " + (base * altura));
                break;
                case 6:
                    System.out.print("\nIngrese un Número ENTERO para evaluar si es Primo: ");
                    int numero = input.nextInt();
                    int primo = 0;
                    for(int i = 2; i < numero; i++){
                        if (numero % i == 0) {
                            primo++;
                        }// fin if
                        if(primo > 1){
                            break;
                        }// fin if
                    }// Fin de For
                    if (primo > 1){
                        System.out.println(numero + " NO es Primo");
                    }else{
                        System.out.println(numero + " Es PRIMO");
                    }// Fin de if/else
                break;
                case 7:
                    System.out.println("\nSe obtendrá el Área de un Triángulo");
                    System.out.print("Ingrese el Tamaño de la Base: ");
                    base = input.nextDouble();
                    System.out.print("\nIngrese el Tamaño de la Altura: ");
                    altura = input.nextDouble();
                    System.out.println("El Área del Triángulo es: " + ((base * altura)/2));
                break;
                case 8:
                    System.out.println("Mire esta Bonita Figura");
                    for(int i = 0; i < 5; i++){
                        System.out.println("*****");
                    }// Fin del for
                break;
                case 9:
                    System.out.println("Mire esta Bonita Figura");
                    for(int i = 0; i < 5; i++){
                        for(int j = -1; j< i; j++){
                            System.out.print("*"); 
                        }
                        System.out.print("\n");
                    }// Fin del for
                break;
                case 10:
                    System.out.println("Se necesitan 10 números enteros a Evaluar: ");
                    double numeros, suma, mayor, menor;
                    int resultado;
                    System.out.print("\nIngrese un Número ENTERO para evaluar: ");
                    numeros = input.nextInt();
                    suma = mayor = menor = numeros;

                    for (int i = 0; i < 9; i++) {
                        System.out.print("\nIngrese un Número ENTERO para evaluar: ");
                        numeros = input.nextInt();

                        suma += numeros;
                        if(numeros > mayor){
                            mayor = numeros;
                        }else if(numeros < menor){
                            menor = numeros;
                        }// Fin if/else

                    }// Fin del for

                    char repetir2;
                    
                    do{
                        System.out.println("-----------------------");
                        System.out.println("1) El número MAYOR");
                        System.out.println("2) El número MENOR");
                        System.out.println("3) La SUMA");
                        System.out.println("4) El PROMEDIO");
                        System.out.println("-----------------------");
                        System.out.print("¿Qué quiere conocer?: ");
                        resultado = input.nextInt();

                        switch (resultado) {
                            case 1:
                                System.out.println("El numero mayor es: " + mayor);
                            break;
                            case 2:
                                System.out.println("El numero menor es: " + menor);
                            break;
                            case 3:
                                System.out.println("La suma total es  : " + suma);
                            break;
                            case 4:
                                System.out.println("El promedio es    : " + (suma/10));
                            break;
                            default:
                                System.out.println("Opción no válida");
                            break;
                        }// Fin del Switch  

                        System.out.print("¿Quiere Conocer Alguna otra cosa? Si/No: ");
                        repetir2 = input.next().charAt(0);

                    }while(repetir2 == 's' || repetir2 == 'S');                             
                break;
                default:
                    System.out.println("Opción no Diponible");
                break;

            } // Fin del Switch

            System.out.print("\n¿Desea Realizar Otra Operación? Sí/No: ");
            repetir1 = input.next().charAt(0);

        }while(repetir1 == 's' || repetir1 == 'S');

        System.out.println("\n¡Adiós!, Que tenga un buen día!");

    }// Fin método principal
}// Fin clase principal



//Fin del Archivo