// Programación Orientada a Objetos
// 05/09/2024
// Ejercicio 06 (Operadores aritméticos)
// Por: Salas Ramírez Bryan Humberto

// Este programa obtendrá el promedio de las 4 materias
// que un estudiante cursó este semestre

public class Ejercicio06{
	public static void main(String[] args){
		// Variables
		float mate = 5;
		float español = 10;
		float historia = 8;
		float ingles = 9;
		float promedio = 0;
		
		//Promedio
		//Se calcula sumando todas las calificaciones y dividiendo el resultado entre el 		número total del materias
		promedio = (mate + español + historia + ingles)/4;

		System.out.println("El promedio del estudiante es: " + promedio);		
	}
}

// Fin del archivo
