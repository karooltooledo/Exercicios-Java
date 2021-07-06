package ExerciciosMatrizesVetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] dados = new int[10];
		int resultado=0, n=0, maiorPontuacao=0;
		
		
		System.out.println("Digite os 10 lançamentos: ");
		for(n = 0; n < dados.length; n++) {
			dados[n] = leia.nextInt();
		}
		
		double media=0, soma=0;
		int quantidade=0;
		
		for(n = 0; n < dados.length; n++) {
			
			soma = soma + dados[n];
			media = soma / 10;
			
			if(dados[n] > maiorPontuacao) {
				maiorPontuacao = dados[n];
				quantidade = 0;
			}		
		
			if(dados[n] == maiorPontuacao) {
				quantidade++;
			}
			
		}
		
		System.out.println("A média dos lançamentos é: " + media);
		System.out.println("A quantidade de ocorrências da maior pontuação é: " + quantidade);
	}
}
