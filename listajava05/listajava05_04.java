package listajava05;

import java.util.Scanner;

public class listajava05_04 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 04. Crie um código que leia o array de inteiros nums[3, 4, 5, 2, -6, 8, 18, -3, 0] e retorne:
 * a. A quantidade de elementos;
 * b. A quantidade de elementos que são números negativos;
 * c. A quantidade de elementos que são números pares. */

	int [] notas = {3, 4, 5, 2, -6, 8, 18, -3, 0};
	
	
	int qtddelementos = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		qtddelementos++;
	}
	
	
	int qtddnegativos = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		if (notas[indice] < 0) qtddnegativos++;
	}
	
	
	int qtddpares = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		if (notas[indice] %2 == 0) qtddpares++;
	}
	
	
	
	System.out.println("Quantidade de elementos: " + qtddelementos);
	System.out.println("Quantidade de elementos que são números negativos: " + qtddnegativos);
	System.out.println("Quantidade de elementos que são números pares: " + qtddpares);
	
	
	
	
teclado.close();

	}

}
