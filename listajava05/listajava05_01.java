package listajava05;

import java.util.Scanner;

public class listajava05_01 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 01. Escreva um programa que lê 4 números e, ao fim, exibe cada um e sua respectiva posição. */

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
