package ExerciciosMatrizesVetores;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [][] matriz = new double[3][3];		
		double soma=0, diagonal=0;
		
		System.out.println("Digite os 10 lan�amentos: ");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Digite o n�mero da Matriz: ");
				matriz[l][c] = leia.nextDouble();
				
				soma += matriz[l][c];
			}
			
		}
		diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("A soma da diagonal principal �: " + diagonal);
	}
}
