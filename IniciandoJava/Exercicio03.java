package IniciandoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Voc� � de categoria Infantil!");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Voc� � de categoria Juvenil!");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Voc� � de categoria Adulto!");
		}
		else {
			System.out.println("Voc� n�o se encontra dentro de nenhuma categoria.");
		}
	}

}
