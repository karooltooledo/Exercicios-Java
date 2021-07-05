package ExerciciosJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int menos21=0, mais50=0;
		
		while(true) {
			System.out.println("Digite a idade: ");
			int idade = entrada.nextInt();
			
			if(idade != -99 ) {
				if(idade < 21) {
				menos21++;
				} else if(idade > 50) {
				mais50++;
				}
			}
			else {
				System.out.println("Fim!");
				break;
			}
		}
		System.out.println("Menores de 21: " + menos21);
		System.out.println("Maiores de 50: " + mais50);
	}

}
