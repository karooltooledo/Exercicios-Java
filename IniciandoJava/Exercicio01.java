package IniciandoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		double resultado, maiorNumero;
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextDouble();
		
		System.out.println("Digite o 3� n�mero: ");
		numero3 = entrada.nextDouble();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO maior valor �: " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO maior valor �: " + numero3);
		}
		else {
			System.out.println("\nO maior valor �: " + numero3);
	}
	}
}
