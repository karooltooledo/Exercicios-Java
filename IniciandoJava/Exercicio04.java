package IniciandoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um n�mero: ");
		n1 = entrada.nextInt();
		
		if ((n1%2) == 0) {
			System.out.println("Este n�mero � par.");
			System.out.println("A raiz quadrada do seu n�mero �: " + Math.sqrt(n1));
		}
		else {
			System.out.println("Seu n�mero � impar.");
			System.out.println("Seu n�mero elevado ao quadrado �: " + Math.pow(n1, 2));
		}
	}

}
