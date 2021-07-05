package ExerciciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numeroEscolhido=0; 
		int par=0, impar=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int numero = 1; numero <= 10; numero++) {
			
			System.out.println("Digite um número: ");
			numeroEscolhido = entrada.nextInt();
			
		if(numeroEscolhido % 2 == 0) {
			par++;
		}
		else {
			impar++;
			}
		}
		System.out.println("A quantidade de números pares são: " + par + "\nA quantidade de números impares são: " + impar);
}

}
