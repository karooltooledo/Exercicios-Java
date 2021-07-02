package IniciandoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um número: ");
		n1 = entrada.nextInt();
		
		if ((n1%2) == 0) {
			System.out.println("Este número é par.");
			System.out.println("A raiz quadrada do seu número é: " + Math.sqrt(n1));
		}
		else {
			System.out.println("Seu número é impar.");
			System.out.println("Seu número elevado ao quadrado é: " + Math.pow(n1, 2));
		}
	}

}
