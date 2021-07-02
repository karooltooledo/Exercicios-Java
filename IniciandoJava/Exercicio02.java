package IniciandoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		
		System.out.println("Digite o 1° número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2° número: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3° número: ");
		numero3 = entrada.nextInt();
		
		
		if(numero1 < numero2 && numero1 < numero3) {
			if(numero2  < numero3) {
			System.out.println(numero1 + "," + numero2 + "," + numero3);
			}
			else {
				System.out.println(numero1 + "," + numero3 + "," + numero2);
		}	
		}
	
		if(numero2 < numero1 && numero2 < numero3) {
			if(numero1  < numero3) {
			System.out.println(numero2 + "," + numero1 + "," + numero3);
		}
			else {
				System.out.println(numero2 + "," + numero3 + "," + numero1);
		}
		}
			
		if(numero3 < numero1 && numero3 < numero2) {
			if(numero1  < numero2) {
			System.out.println(numero3 + "," + numero1 + "," + numero2);
		}
			else {
				System.out.println(numero3 + "," + numero2 + "," + numero1);
		}
		}
	}
}


