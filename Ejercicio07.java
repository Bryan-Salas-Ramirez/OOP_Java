// Programación Orientada a Objetos
// Actividad Ejericio07
// 10/09/2024
// Por: Bryan Humberto Salas Ramírez


// Este programa calcula la cantidad a pagar de propina en un restaurante así como la catidad de IVA a pagar y devuelve la suma de todos para calcular el total

public class Ejercicio07{
	public static void main(String[] args){
		// Variables
		float subtotal = 20f;
		double propina = 0;
		double iva = 0;
		double total = 0;

		//Se muestra el subtotal
		System.out.println("Subtotal = " + subtotal);
		
		//Se realiza el calculo de la propina tomando en cuenta el 15% del subtotoal
		propina = subtotal * 0.15;
		System.out.println("Propina (15%) = " + propina);
		
		//Se realiza el calculo del iva tomando en cuenta el 16% del subtotal
		iva = subtotal * .16;
		System.out.println("IVA (16%)= " + iva);

		//Se calcula el total sumando los valores del subtotal, propina e iva
		total = subtotal + propina + iva;
		System.out.println("Total = " + total); 
	}
}


