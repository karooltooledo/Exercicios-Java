package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, dias, resultados;
		
		System.out.println("Calculadora dias de vida\n");
		
		System.out.println("Quantos anos voc� tem:");
		anos = entrada.nextInt();
				
		System.out.println("Sua idade em meses �: " + anos * 12);
		
		System.out.println("\nSua idade em dias �: " + anos * 365);
	}

}
