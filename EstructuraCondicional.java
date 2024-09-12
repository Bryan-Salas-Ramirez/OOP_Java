// Programación Orientada a Objetos
// Repositorio Estructura Condicional
// 10/09/2024
// Por: Bryan Humberto Salas Ramírez

public class EstructuraCondicional{
	public static void main(String[] args){
	
		//OPERADORES CONDICIONALES
		/*	
		System.out.println("3 > 4: " + (3 > 4)); //False
		System.out.println("3 < 4: " + (3 < 4));	//True 
		System.out.println("3 >= 4: " + (3 >= 3)); //True
		System.out.println("3 <= 4: " + (3 <= 4)); //True
		System.out.println("5 == 4: " + (5 == 4)); //False
		System.out.println("3 != 4: " + (3 != 4)); //True
		*/

		//Ejemplo de una estructura condicional
		int mat = 10;
		int esp = 10;
		int hist = 10;
		int ing = 10;
		int prom = 0;

		//Obtener el Promedio
		prom = (mat + esp + hist + ing) / 4;
		System.out.println("Tu promedio es: " + prom);

		if(prom >= 8){
			if(prom == 10){
				System.out.println("FELICIDADES, ESTÁS APROBADO!");
			}else{
				System.out.println("Estás APROVADO!");
			}
		}else{
			System.out.println("****Estás REPROBADO****");
		}

	}
}

//Fin del archivo