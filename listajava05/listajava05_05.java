package listajava05;

import java.util.Scanner;

public class listajava05_05 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 05. Crie um programa que receba um array de inteiros 'n' e um valor inteiro 'b'. 
 * Retorne a quantidade de vezes que 'b' aparece no array 'n'. */

	System.out.println("Informe a quantidade de elementos do vetor 'n': ");
	int qtdd = teclado.nextInt();
	
	int [] n = new int [qtdd];
	
	
	for (int indice = 0; indice < qtdd; indice++)
	{
		System.out.println("Informe n[" + indice + "]:");
		n[indice] = teclado.nextInt();
	}
	
	
	System.out.println("Informe um número para saber quantas vezes ele aparece no decorrer do vetor n: ");
	int b = teclado.nextInt();
	
	
	int contador = 0;
	
	
	for (int indice = 0; indice < qtdd; indice++)
	{
		if (n[indice] == b) contador++;
	}
	
	
	System.out.println(b + " aparece " + contador + " vez(es) no decorrer do vetor n[" + qtdd + "].");
	
	
teclado.close();

	}

}
