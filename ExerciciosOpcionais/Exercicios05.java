package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Média ponderada: " + n1 * 2);
		
		System.out.println("\nDigite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Média ponderada: " + n2 * 3);
		
		System.out.println("\nDigite a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Média ponderada: " + n3 * 5);
		
		media = (n1 *2) + (n2 * 3) + (n3 * 5);
		media = media / (2 + 3 + 5);
		
		System.out.println("\nA media final é: " + media);
	}

}
