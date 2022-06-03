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
		
		
		
		
	/* 02. Escreva um código Java que recebe um array de tipo int com tamanho informado pelo usuário.
	Em seguida, imprima todos os elementos do array em uma única linha.

	System.out.println("Informe o tamanho do vetor: ");
	int tamanho = teclado.nextInt();
	
	
	int [] vetor = new int [tamanho];
	
	
	if (tamanho == 0)
	{
		System.out.println("Valor inválido");
	}
	else 
	{
		for (int indice = 0; indice < tamanho; indice++)
		{
				System.out.println("Informe vetor[" + indice + "]:");
				vetor[indice] = teclado.nextInt();
		}
	}
	
	
	
	for (int indice = 0; indice < tamanho; indice ++)
	{
		if (tamanho == 1)
		{
			System.out.println("vetor[" + indice + "] = {" + vetor[indice] + "}");
		}
		
		else
		{
			if (indice == 0)
			{
				System.out.print("vetor[" + indice + "] = {" + vetor[indice] + ", ");
			}
			
			else if (indice == (vetor.length - 1))
			{
				System.out.print(vetor[indice] + "}");
			}
			
			else
			{
				System.out.print(vetor[indice] + ", ");
			}
		}
	}
		
		
		
		
	/* 03. Construa um programa que leia 5 valores double e os armazene em um array 'notas', exibindo-os em seguida.

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
		
		
		
		
	/* 04. Crie um código que leia o array de inteiros nums[3, 4, 5, 2, -6, 8, 18, -3, 0] e retorne:
	a. A quantidade de elementos;
	b. A quantidade de elementos que são números negativos;
	c. A quantidade de elementos que são números pares.

	int [] notas = {3, 4, 5, 2, -6, 8, 18, -3, 0};
	
	
	int qtddelementos = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		qtddelementos++;
	}
	
	
	int qtddnegativos = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		if (notas[indice] < 0) qtddnegativos++;
	}
	
	
	int qtddpares = 0;
	
	for (int indice = 0; indice < notas.length; indice++)
	{
		if (notas[indice] %2 == 0) qtddpares++;
	}
	
	
	
	System.out.println("Quantidade de elementos: " + qtddelementos);
	System.out.println("Quantidade de elementos que são números negativos: " + qtddnegativos);
	System.out.println("Quantidade de elementos que são números pares: " + qtddpares);

		
		
		
	/* 05. Crie um programa que receba um array de inteiros 'n' e um valor inteiro 'b'. 
	Retorne a quantidade de vezes que 'b' aparece no array 'n'.

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
		
		
		
		
	/* 06. Escreva um código que receba um array de inteiros com tamanho e elementos determinados pelo usuário,
	exibindo-os em seguida.

	System.out.println("Defina o tamanho do vetor: ");
	int tamanho = teclado.nextInt();
	
	int [] vetor = new int [tamanho];
	
	for (int indice = 0; indice < tamanho; indice++)
	{
		System.out.println("Informe o " + (indice + 1) + "º elemento do vetor: ");
		vetor[indice] = teclado.nextInt();
	}
	
	System.out.println("\n");
	
	//exibição com for:
	for (int indice = 0; indice < tamanho; indice++)
	{
		System.out.println("vetor[" + indice + "] = " + vetor[indice]);
	}
	
	System.out.println("\n");
	
	//exibição com foreach:
	for (int listavetor: vetor)
	{
		System.out.println(listavetor);
	}
		
		
		
		
	/* 07. Faça um código Java que receba um array de inteiros 'a' e retorne um array de booleanos no qual,
	a cada posição, indique true se o elemento correspondente de 'a' for par,
	e false se o elemento correspondente de 'a' for ímpar.

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "º numero: ");
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
		
		
		
		
	/* 08. Escreva um código que percorra um array de inteiros e retorne a posição de maior valor.
	Caso haja mais de um valor, trazer apenas a primeira ocorrência.

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "º numero: ");
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
	
	
	
	System.out.println("Maior número do vetor: ");
	System.out.println("vetor[" + maiorindice + "] = " + maiornumero);
	
		
		
		
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
