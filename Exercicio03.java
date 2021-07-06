package ExerciciosMatrizesVetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] n1 = new double[2][3];
		double[][] n2 = new double[2][3];
		double[][] m1 = new double[2][3];
		double[][] m2 = new double[2][3];
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Digite n1: ");
				n1[l][c] = leia.nextDouble();
				System.out.println("Digite n2: ");
				n2[l][c] = leia.nextDouble();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
			for(int l = 0; l < 2; l++) {
				for(int c = 0; c < 3; c++) {
									
				System.out.println("Matriz m1: " + m1[l][c]);
				System.out.println("Matriz m2: " + m2[l][c]);
									
				}
			}
		}
	}


