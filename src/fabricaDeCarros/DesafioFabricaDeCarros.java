
/*
 * 
 * Desafio
 * O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). O gerente de uma loja de carros gostaria de um programa para calcular o pre�o de um carro novo para os clientes. Voc� receber� o custo de f�brica e as porcentagens referentes ao distribuidor e os impostos e dever� escrever programa para ler esses valores e imprimir o valor final do carro.
 *
 * Entrada
 * Voc� recebera tr�s valores inteiros que representam o custo de f�brica, as porcentagens do distribuidor e os impostos.

 * Sa�da 
 * Como sa�da, teremos o valor final do pre�o de um carro novo.
 * */

package fabricaDeCarros;

import java.util.Scanner;

public class DesafioFabricaDeCarros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do custo de f�brica:");
		int custoFabrica = scan.nextInt(); 
		System.out.println("Digite o valor do percentual do distribuidor:");
		int porcentagemDistribuidor = scan.nextInt(); 
		System.out.println("Digite o valor do percentual dos impostos:");
		int percentualImpostos = scan.nextInt(); 
		int custoConsumidor;
		int distribuidor;
		int valorImpostos;
		
		distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
		valorImpostos = ( custoFabrica * percentualImpostos) / 100;
		custoConsumidor = custoFabrica + distribuidor + valorImpostos;
		
		System.out.println(custoConsumidor);
	}
}
