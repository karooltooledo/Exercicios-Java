package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C, R, S, D;
		
		System.out.println("Qual o valor de A: ");
		A = entrada.nextDouble();
		
		System.out.println("Qual o valor de B: ");
		B = entrada.nextDouble();
		
		System.out.println("Qual o valor de C: ");
		C = entrada.nextDouble();

		R = Math.pow((A+B), 2.0);
		S = Math.pow((B+C), 2.0);
		
		D = (R + S) / 2;
		
		System.out.println("\nO resultado final é: " + D);
	}

}
