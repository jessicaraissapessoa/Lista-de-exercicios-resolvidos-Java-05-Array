package listajava05;

import java.util.Scanner;

public class listajava05_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 05 - Array
//Organizador / Professor: Pablo Ramon
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
						
/* 02. Escreva um código Java que recebe um array de tipo int com tamanho informado pelo usuário.
 * Em seguida, imprima todos os elementos do array em uma única linha */

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

	
teclado.close();

	}

}
