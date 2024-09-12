//***************************************
// Programación Orientada a Objetos
//03/09/2024
//Ejercicio 02 (Tipos de datos)
//Por: Salas Ramírez Bryan Humberto
//***************************************


public class Ejercicio02{

	public static void main(String[] args){
		
		//VARIABLES
		// Byte
		byte valor = 15;
		System.out.println("Tipo de dato Byte: " + valor);

		// Enteros
		int edad = 40;
		System.out.println("Tipo de dato Int: " + edad);

		//Coma Flotante
		float peso = 78.5f;
		System.out.println("Tipo de dato Float: " + peso);

		// Caracter
		char miPrimeraLetra = 'F';
		System.out.println("Tipo de dato Char: " + miPrimeraLetra);

		// Booleano
		boolean casado = false;
		System.out.println("Estoy casado?: " + casado);
		boolean soltero = true;
		System.out.println("Estoy soltero?: " + soltero);

		// Asignación de nuevo valor
		edad=50;
		System.out.println("Edad: " + edad);

		// CONSTANTES

		final double PI = 3.1416;
		System.out.println("Valor de PI: " + PI);

		// Arrays
		int[] edades = new int[5];

	}

}