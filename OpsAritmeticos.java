// Programación Orientada a Objetos
// 05/09/2024
// Operadores Aritméticos()
// Por: Salas Ramírez Bryan Humberto

public class OpsAritmeticos{
	public static void main(String[] args){
		int num1 = 2;
		int num2 = 4;
		int resultado = 0;

		// SUMA
		resultado = num1 + num2;
		System.out.println("El resultado de la suma es: " + resultado);

		// Resta
		resultado = num1 - num2;
		System.out.println("El resultado de la resta es: " + resultado);

		// MULTIPLICACIÓN
		resultado = num1 * num2;
		System.out.println("El resultado de la multiplicación es: " + resultado);

		// DIVISIÓN ENTERA
		resultado = num1 / num2;
		System.out.println("El resultado de la división entera es: " + resultado);

		// MÓDULO
		resultado = num1 % num2;
		System.out.println("El resultado de la división(residuo) es: " + resultado);

		// PRIORIDAD DE SIGNOS
		resultado = 5 + 4 - 2 * 10 / 5 + (3 +1);
		System.out.println("Prioridad de signos: " + resultado);

		// POTENCIA
		resultado = (int)(Math.pow(num1, num2));
		System.out.println("El resultado de la potencia es: " + resultado);
	}
}

