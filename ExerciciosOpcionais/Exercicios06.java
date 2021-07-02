package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = entrada.nextDouble();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y2-y1), 2.0);
		
		d = Math.sqrt(p1+p2);
		
		System.out.println("\nA distancia de P1 para P2 é: " + d);
		
	}

}
