package listajava05;

import java.util.Scanner;

public class listajava05_01 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 01. Para cada série de valores abaixo, escreva um código Java que preencha um array com os mesmos, imprimindo-os em seguida:
 * a. 2 3 4 5 6 11 65 2
 * b. 25 66 8 9 3 44 5
 * c. Campina Grande, João Pessoa, Conde, Cabedelo
 * d. A+, B-, AB, O+, O-. */

	int [] numeros1 = {2, 4, 5, 6, 11, 65, 2};
	int [] numeros2 = {25, 66, 8, 9, 3, 44, 5};
	String [] cidades = {"Campina Grande", "João Pessoa", "Conde", "Cabedelo"};
	String [] tiposanguineo = {"A+", "B-", "AB", "O+", "O-"};
	
	
	
	for (int inumeros1 = 0; inumeros1 < numeros1.length; inumeros1++) 
	{
		System.out.println("numeros1[" + inumeros1 + "] = " + numeros1[inumeros1]);
	}
	
	
	System.out.println("\n");
	
	
	for (int inumeros2 = 0; inumeros2 < numeros2.length; inumeros2++) 
	{
		System.out.println("numeros2[" + inumeros2 + "] = " + numeros2[inumeros2]);
	}

	
	System.out.println("\n");
	
	
	for (int icidades = 0; icidades < cidades.length; icidades++) 
	{
		System.out.println("cidades[" + icidades + "] = " + cidades[icidades]);
	}

	
	System.out.println("\n");
	
	
	for (int itiposanguineo = 0; itiposanguineo < tiposanguineo.length; itiposanguineo++) 
	{
		System.out.println("tiposanguineo[" + itiposanguineo + "] = " + tiposanguineo[itiposanguineo]);
	}

	
teclado.close();

	}

}
