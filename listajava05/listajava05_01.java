package listajava05;

import java.util.Scanner;

public class listajava05_01 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 05 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 01. Escreva um programa que l� 4 n�meros e, ao fim, exibe cada um e sua respectiva posi��o. */

	int [] numeros = new int [4];
	
	for (int indice = 0; indice < numeros.length; indice++) 
	{
		System.out.println("Informe o valor de numeros[" + "]: ");
		numeros[indice] = teclado.nextInt();
	}

	for (int indice = 0; indice < numeros.length; indice++) 
	{
		System.out.println("numeros[" + indice + "] = " + numeros[indice]);
	}

	
teclado.close();

	}

}
