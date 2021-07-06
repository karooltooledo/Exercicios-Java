package ExerciciosMatrizesVetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int resultado=0;
		
		System.out.println("Digite as 5 pontuações da atividade: ");
		for(int n = 0; n < pontuacao.length; n++) {
			pontuacao[n] = leia.nextInt();
			
			if(pontuacao[n] > resultado) {
				resultado = pontuacao[n];
			}
		}
			System.out.println("A maior pontuação é: " + resultado);
	}

}
