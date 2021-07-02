package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicios08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double carroValor, carroFabrica, distribuidor, impostos;
		
		System.out.println("Qual o valor do carro? ");
		carroValor = entrada.nextDouble();
		
		distribuidor = (carroValor * 28) / 100;
		impostos = (carroValor * 45) / 100;
		carroFabrica = carroValor + distribuidor + impostos;
		
		System.out.println("O valor do carro com preço de fábrica é: " + carroFabrica);

	}

}
