package listajava05;

import java.util.Scanner;

public class listajava05_06 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 06. Escreva um c�digo que receba um array de inteiros com tamanho e elementos determinados pelo usu�rio,
 * exibindo-os em seguida. */

	System.out.println("Defina o tamanho do vetor: ");
	int tamanho = teclado.nextInt();
	
	int [] vetor = new int [tamanho];
	
	for (int indice = 0; indice < tamanho; indice++)
	{
		System.out.println("Informe o " + (indice + 1) + "� elemento do vetor: ");
		vetor[indice] = teclado.nextInt();
	}
	
	System.out.println("\n");
	
	//exibi��o com for:
	for (int indice = 0; indice < tamanho; indice++)
	{
		System.out.println("vetor[" + indice + "] = " + vetor[indice]);
	}
	
	System.out.println("\n");
	
	//exibi��o com foreach:
	for (int listavetor: vetor)
	{
		System.out.println(listavetor);
	}

	
teclado.close();

	}

}
