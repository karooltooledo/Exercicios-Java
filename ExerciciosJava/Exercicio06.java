package ExerciciosJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		int total=0;
		int quantidade=0;
		
		while(true) {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero == 0) {
				break;
			}
			if(numero % 3 == 0) {
				quantidade++;
				total += numero;
			}
		}
		System.out.println("Média dos valores: " + (total / quantidade));
	}

}
