package listajava05_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava05_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


	/* 01. Para cada série de valores abaixo, escreva um código Java que preencha um array com os mesmos, imprimindo-os em seguida:
	a. 2 3 4 5 6 11 65 2
	b. 25 66 8 9 3 44 5
	c. Campina Grande, João Pessoa, Conde, Cabedelo
	d. A+, B-, AB, O+, O-.

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


	//exibição com for (na mesma linha):
	
	for (int indice = 0; indice < numeros.length; indice++)
	{
		if (indice < (numeros.length - 1)) System.out.print(numeros[indice] + ", ");
		else System.out.println(numeros[indice] + ".");
	}
		
		
		
		
	/* 02. Escreva um programa que leia 3 notas, calcule a média e, ao final, exiba as três notas e a média.
		
	double [] notas = new double [3];
	
	
	for (int indice = 0; indice < 3; indice++)
	{
		System.out.println("Informe a " + (indice + 1) + "ª nota: ");
		notas[indice] = teclado.nextDouble();
	}
	
	
	
	double soma = 0;
	
	for (int indice = 0; indice < 3; indice++)
	{
		soma = soma + notas[indice];
	}
	
	double media = soma / notas.length;
	
	
	
	for (int indice = 0; indice < 3; indice++)
	{
		
		if (indice == 0) System.out.print("Suas notas são: " + nota.format(notas[indice]) + "/ ");
		else if (indice < (notas.length - 1)) System.out.print(nota.format(notas[indice]) + "/ ");
		else System.out.print(nota.format(notas[indice]) + ".");
		
	}
	
	System.out.println("\nSua média é: " + nota.format(media));
		
		
		
		
	/* 03. Escreva um programa que receba um vetor de 5 elementos e, em seguida,
	multiplique os elementos pares por 3 e adicionando 1 aos elementos ímpares.
	Mostre o vetor alterado.
		
	int [] vetor = new int [5];
	
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		System.out.println("Informe o elemento de índice " + indice + " do vetor: ");
		vetor[indice] = teclado.nextInt();
		
	}
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		if (vetor[indice] %2 == 0) System.out.println(vetor[indice] * 3);
		else System.out.println(vetor[indice] + 1);		
		
	}
		
		
		
		
	/* 04. Declarar e ler um vetor de 5 números inteiro e, após, exibir o vetor na ordem inversa dos elementos digitados.
		
	int [] vetor = new int [5];
	
	
	for (int indice = 0; indice < vetor.length; indice++) 
	{
		
		System.out.println("Informe o elemento de índice " + indice + " do vetor: ");
		vetor[indice] = teclado.nextInt();
		
	}
	
	
	for (int indice = 4; indice >= 0; indice--)
	{
		
		System.out.println("vetor[" + indice + "] = " + vetor[indice]);
		
	}

		
		
		
	//* 05. Faça um programa para gerar um array de 30 elementos, onde cada elemento corresponde ao quadrado de sua posição.
	Depois imprima os elementos resultantes.
		
	double [] vetor = new double [30];
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		vetor[indice] = Math.pow(indice, 2);
	}
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		System.out.println(vetor[indice]);
	}
		
		
		
		
	/* 06. Criar um vetor A com 5 elementos inteiros e um vetor B com mesmo tipo, tamanho e elementos do vetor A.
		
	int [] vetorA = new int [5];
	int [] vetorB = new int [5];
	
	
	for (int indice = 0; indice < 5; indice++)
	{
		
		System.out.println("Defina vetorA[" + indice + "]: ");
		vetorA[indice] = teclado.nextInt();
		
		vetorB[indice] = vetorA[indice];
		
	}
	
	
	for (int indice = 0; indice < 5; indice++)
	{
	
	System.out.println("vetorA[" + indice + "] = " + vetorA[indice]);
	
	}
	

	for (int indice = 0; indice < 5; indice++)
	{
	
	System.out.println("vetorB[" + indice + "] = " + vetorB[indice]);
	
	}
		
		
		
		
	/* 07. Criar um vetor A com 10 elementos inteiros.
	Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento do vetor A multiplicado pelo índice.
	Ou seja, vetorB[indice] = vetorA[indice] * indice.
	Exiba os elementos do vetor A e do vetor B.
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [10];
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		
		System.out.println("Defina vetorA[" + indice + "]: ");
		vetorA[indice] = teclado.nextInt();
		
		vetorB[indice] = vetorA[indice] * indice;
		
	}
	
	
	for (int indice = 0; indice < 10; indice++)
	{
	
	System.out.println("vetorA[" + indice + "] = " + vetorA[indice]);
	
	}
	

	System.out.println("\n");


	for (int indice = 0; indice < 10; indice++)
	{
	
	System.out.println("vetorB[" + indice + "] = " + vetorB[indice]);
	
	}
		
		
		
		
	/* 08. Criar dois vetores (A e B), cada um com 10 elementos inteiros.
	Após, construir um vetor C, no qual cada elemento é o resultado da multiplicação dos respectivos elementos em A e B.
	Ou seja, C[indice] = A[indice] * B[indice].
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [10];
	int [] vetorC = new int [10];
	
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("Defina vetorA[" + indice + "]:");
		vetorA[indice] = teclado.nextInt();
	}
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("Defina vetorB[" + indice + "]:");
		vetorB[indice] = teclado.nextInt();
	}
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		vetorC[indice] = vetorA[indice] * vetorB[indice];
	}
	
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("vetorA[" + indice + "] = " + vetorA[indice]);
	}
	
	System.out.println("\n");
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("vetorB[" + indice + "] = " + vetorB[indice]);
	}
	
	System.out.println("\n");
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("vetorC[" + indice + "] = " + vetorC[indice]);
	}
	
		
		
		
	/* 09. Faça um programa para criar um vetor de 20 posições: as 10 primeiras são números informados pelos usuário
	e as 10 seguintes são os mesmos números em ordem inversa.
		

	int [] vetorA = new int [10];
	int [] vetorB = new int [vetorA.length];
	int [] vetorfinal = new int [vetorA.length + vetorB.length];


	//10 primeiros valores (ordem padrão):

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		System.out.println("Informe o " + (iA + 1) + "º número: ");
		vetorA[iA] = teclado.nextInt();
	}


	//10 últimos valores (ordem inversa):

	int inicializacao = (vetorA.length - 1);

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		int iB = inicializacao;
		vetorB[iB] = vetorA[iA];
		inicializacao--;
	}


	//inserindo os valores em ordem padrão e os em ordem inversa:
	
	for (int iA = 0; iA < vetorA.length; iA++)
	{
		int ifinal = iA;
		vetorfinal[ifinal] = vetorA[iA];
	}

	for (int iB = 0; iB < vetorB.length; iB++)
	{
	int ifinal = iB + 10;
	vetorfinal[ifinal] = vetorB[iB];
	}	


	//exibindo os valores do vetorfinal:

	for (int ifinal = 0; ifinal < (vetorA.length + vetorB.length); ifinal++)
	{
	System.out.println("vetor[" + ifinal + "] = " + vetorfinal[ifinal]);
	}
		
		
		
		
	/* 10. Crie dois vetores (A e B). A com 10 números inteiros e B com 15 números inteiros. 
	Em seguida, crie um terceiro vetor (C), que deverá ser a junção dos dois primeiros vetores (A e B). 
	Exiba os vetores criados.
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [15];
	int [] vetorC = new int [vetorA.length + vetorB.length];
	
	for (int ia = 0; ia < vetorA.length; ia++) {
		System.out.println("Informe vetorA[" + ia + "]: ");
		vetorA[ia] = teclado.nextInt();
	}
	
	for (int ib = 0; ib < vetorB.length; ib++) {
		System.out.println("Informe vetorB[" + ib + "]: ");
		vetorB[ib] = teclado.nextInt();
	}
	
	
	
	for (int ia = 0; ia < vetorA.length; ia++) {
		int ic = ia;
		vetorC[ic] = vetorA[ia];
	}
	
	for (int ib = 0; ib < vetorB.length; ib++) {
		int ic = ib + 10;
		vetorC[ic] = vetorB[ib];
	}
	
	
	
	for (int listaA : vetorA) {
		System.out.println("vetorA: " + listaA);
	}
	
	System.out.println("\n");
	
	for (int listaB : vetorB) {
		System.out.println("vetorB: " + listaB);
	}
	
	System.out.println("\n");
	
	for (int listaC : vetorC) {
		System.out.println("vetorC: " + listaC);
	}
				
		
				
		
*/		
teclado.close();		

	}

}
