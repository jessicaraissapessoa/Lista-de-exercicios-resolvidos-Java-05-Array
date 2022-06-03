package listajava05_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava05_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exerc�cios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


	/* 01. Para cada s�rie de valores abaixo, escreva um c�digo Java que preencha um array com os mesmos, imprimindo-os em seguida:
	a. 2 3 4 5 6 11 65 2
	b. 25 66 8 9 3 44 5
	c. Campina Grande, Jo�o Pessoa, Conde, Cabedelo
	d. A+, B-, AB, O+, O-.

	int [] numeros1 = {2, 4, 5, 6, 11, 65, 2};
	int [] numeros2 = {25, 66, 8, 9, 3, 44, 5};
	String [] cidades = {"Campina Grande", "Jo�o Pessoa", "Conde", "Cabedelo"};
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


	//exibi��o com for (na mesma linha):
	
	for (int indice = 0; indice < numeros.length; indice++)
	{
		if (indice < (numeros.length - 1)) System.out.print(numeros[indice] + ", ");
		else System.out.println(numeros[indice] + ".");
	}
		
		
		
		
	/* 02. Escreva um c�digo Java que recebe um array de tipo int com tamanho informado pelo usu�rio.
	Em seguida, imprima todos os elementos do array em uma �nica linha.

	System.out.println("Informe o tamanho do vetor: ");
	int tamanho = teclado.nextInt();
	
	
	int [] vetor = new int [tamanho];
	
	
	if (tamanho == 0)
	{
		System.out.println("Valor inv�lido");
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
		System.out.println("Informe a " + (indice + 1) + "� nota: ");
		notas[indice] = teclado.nextDouble();
	}
	
	
	for (double listanotas: notas)
	{
		System.out.println(listanotas);
	}
		
		
		
		
	/* 04. Crie um c�digo que leia o array de inteiros nums[3, 4, 5, 2, -6, 8, 18, -3, 0] e retorne:
	a. A quantidade de elementos;
	b. A quantidade de elementos que s�o n�meros negativos;
	c. A quantidade de elementos que s�o n�meros pares.

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
	System.out.println("Quantidade de elementos que s�o n�meros negativos: " + qtddnegativos);
	System.out.println("Quantidade de elementos que s�o n�meros pares: " + qtddpares);

		
		
		
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
	
	
	System.out.println("Informe um n�mero para saber quantas vezes ele aparece no decorrer do vetor n: ");
	int b = teclado.nextInt();
	
	
	int contador = 0;
	
	
	for (int indice = 0; indice < qtdd; indice++)
	{
		if (n[indice] == b) contador++;
	}
	
	
	System.out.println(b + " aparece " + contador + " vez(es) no decorrer do vetor n[" + qtdd + "].");
		
		
		
		
	/* 06. Escreva um c�digo que receba um array de inteiros com tamanho e elementos determinados pelo usu�rio,
	exibindo-os em seguida.

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
		
		
		
		
	/* 07. Fa�a um c�digo Java que receba um array de inteiros 'a' e retorne um array de booleanos no qual,
	a cada posi��o, indique true se o elemento correspondente de 'a' for par,
	e false se o elemento correspondente de 'a' for �mpar.

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
		
		
		
		
	/* 08. Escreva um c�digo que percorra um array de inteiros e retorne a posi��o de maior valor.
	Caso haja mais de um valor, trazer apenas a primeira ocorr�ncia.

	System.out.println("Informe a quantidade de elementos do vetor: ");
	int qtdd = teclado.nextInt();
	
	
	
	int [] vetor = new int [qtdd];
	
	for (int indice = 0; indice < qtdd; indice++) {
		System.out.println("Informe o " + (indice + 1) + "� numero: ");
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
	
	
	
	System.out.println("Maior n�mero do vetor: ");
	System.out.println("vetor[" + maiorindice + "] = " + maiornumero);
	
		
		
		
	/* 09. Fa�a um programa para criar um vetor de 20 posi��es: as 10 primeiras s�o n�meros informados pelos usu�rio
	e as 10 seguintes s�o os mesmos n�meros em ordem inversa.
		

	int [] vetorA = new int [10];
	int [] vetorB = new int [vetorA.length];
	int [] vetorfinal = new int [vetorA.length + vetorB.length];


	//10 primeiros valores (ordem padr�o):

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		System.out.println("Informe o " + (iA + 1) + "� n�mero: ");
		vetorA[iA] = teclado.nextInt();
	}


	//10 �ltimos valores (ordem inversa):

	int inicializacao = (vetorA.length - 1);

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		int iB = inicializacao;
		vetorB[iB] = vetorA[iA];
		inicializacao--;
	}


	//inserindo os valores em ordem padr�o e os em ordem inversa:
	
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
		
		
		
		
	/* 10. Crie dois vetores (A e B). A com 10 n�meros inteiros e B com 15 n�meros inteiros. 
	Em seguida, crie um terceiro vetor (C), que dever� ser a jun��o dos dois primeiros vetores (A e B). 
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
