/*
 * Desafio
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 * Entrada
 * A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ). Pelo menos um destes números será positivo.
 * Saída
 * O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
 * 
 * */
package imprimindoPositivosMedia;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ImprimindoPositivosMedia {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double media = 0;
		double numeroInformado;
		double soma = 0;
		ArrayList<Double> numeros = new ArrayList<>();
		ArrayList<Double> numerosPares = new ArrayList<>();

		System.out.println("O tamanho inicial do array é: " + numeros.size());

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um número:");
			numeroInformado = leitor.nextDouble();
			numeros.add(numeroInformado);
		}
		System.out.println("O tamanho pós população do array é: " + numeros.size());

		for (double numero : numeros) {
			if (numero > 0) {
				numerosPares.add(numero);
			}
		}
		
		for (double numero : numerosPares) {
			soma += numero;
		}
		System.out.println("A soma dos pares é: "+ soma);
		media = soma / numerosPares.size();
		System.out.println("Tamanho dos pares: " +numerosPares.size());
		System.out.println(numerosPares);
		System.out.println(numerosPares.size() + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}
}
