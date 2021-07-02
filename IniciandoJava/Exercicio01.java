package IniciandoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		double resultado, maiorNumero;
		
		System.out.println("Digite o 1° número: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite o 2° número: ");
		numero2 = entrada.nextDouble();
		
		System.out.println("Digite o 3° número: ");
		numero3 = entrada.nextDouble();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO maior valor é: " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO maior valor é: " + numero3);
		}
		else {
			System.out.println("\nO maior valor é: " + numero3);
	}
	}
}
