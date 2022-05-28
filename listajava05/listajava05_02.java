package listajava05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava05_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
DecimalFormat nota = new DecimalFormat("##0.00");
						
/* 02. Escreva um programa que lê 4 notas, calcula a média e exibe o resultado. */

	double [] notas = new double [4];
	
	for (int indice = 0; indice < notas.length; indice++) 
	{
		System.out.println("Informe sua " + (indice + 1) + "ª nota: ");
		notas[indice] = teclado.nextDouble();
	}
	
	
	double soma = 0;
	
	for (int indice = 0; indice < notas.length; indice++) 
	{
		soma = soma + notas[indice];
	}
	
	
	double media = soma / 4;
	
	
	System.out.println(nota.format(media));
	

teclado.close();

	}

}
