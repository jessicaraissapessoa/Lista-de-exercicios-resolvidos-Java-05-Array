package listajava05;

import java.util.Scanner;

public class listajava05_08 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 08. Escreva um c�digo que percorra um array de inteiros e retorne a posi��o de maior valor.
 * Caso haja mais de um valor, trazer apenas a primeira ocorr�ncia. */

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "� numero: ");
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
	
	
	
	System.out.println("Maior n�mero do vetor: ");
	System.out.println("vetor[" + maiorindice + "] = " + maiornumero);
	
	
teclado.close();

	}

}
