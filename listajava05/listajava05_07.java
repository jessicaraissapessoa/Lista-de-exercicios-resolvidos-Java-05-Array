package listajava05;

import java.util.Scanner;

public class listajava05_07 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 07. Fa�a um c�digo Java que receba um array de inteiros 'a' e retorne um array de booleanos no qual,
 * a cada posi��o, indique true se o elemento correspondente de 'a' for par,
 * e false se o elemento correspondente de 'a' for �mpar. */

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "� numero: ");
		vetor[indice] = teclado.nextInt();
	}
	
	
	
	boolean parouimpar = false;
	
	for (int indice = 0; indice < qtdd; indice++) {
		if (vetor[indice] %2 == 0) 
			{
			parouimpar = true;
			System.out.println(vetor[indice] + " - " + parouimpar);
			}
		else 
			{
			parouimpar = false;
			System.out.println(vetor[indice] + " - " + parouimpar);
			}
	}
	
	
teclado.close();

	}

}
