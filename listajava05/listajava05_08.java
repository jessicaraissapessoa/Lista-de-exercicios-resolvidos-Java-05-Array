package listajava05;

import java.util.Scanner;

public class listajava05_08 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 08. Escreva um código que percorra um array de inteiros e retorne a posição de maior valor.
 * Caso haja mais de um valor, trazer apenas a primeira ocorrência. */

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "º numero: ");
		vetor[indice] = teclado.nextInt();
	}
	
	
	
	int maiorindice = 0;
	int maiornumero = 0;
	
	for (int indice = 0; indice < qtdd; indice++) {
		if (vetor[indice] > maiornumero)
		{
			maiornumero = vetor[indice];
			maiorindice = indice;
		}
	}
	
	
	
	System.out.println("Maior número do vetor: ");
	System.out.println("vetor[" + maiorindice + "] = " + maiornumero);
	
	
teclado.close();

	}

}
