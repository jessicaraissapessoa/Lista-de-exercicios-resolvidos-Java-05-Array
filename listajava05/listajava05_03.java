package listajava05;

import java.util.Scanner;

public class listajava05_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 03. Construa um programa que leia 5 valores double e os armazene em um array 'notas', exibindo-os em seguida. */

	double [] notas = new double [5];
	
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		System.out.println("Informe a " + (indice + 1) + "ª nota: ");
		notas[indice] = teclado.nextDouble();
	}
	
	
	for (double listanotas: notas)
	{
		System.out.println(listanotas);
	}
	
	
teclado.close();

	}

}
