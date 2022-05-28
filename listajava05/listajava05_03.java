package listajava05;

import java.util.Scanner;

public class listajava05_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 03. Escreva um programa que recebe um vetor de 5 elementos.
 * Em seguida, altere os elementos do vetor multiplicando os pares por 3
 * e somando 1 aos ímpares. Exiba o vetor alterado. */

	int [] vetor = new int [5];
	
	for (int indice = 0; indice < vetor.length; indice++) 
	{
		System.out.println("Informe vetor[" + indice + "]: ");
		vetor[indice] = teclado.nextInt();
	}
	
	
	for (int indice = 0; indice < vetor.length; indice++) 
	{
		if (vetor[indice] %2 == 0) System.out.println("vetor[" + indice + "] = " + (vetor[indice] * 3));
		else System.out.println("vetor[" + indice + "] = " + (vetor[indice] + 1));
	}
	

teclado.close();

	}

}
