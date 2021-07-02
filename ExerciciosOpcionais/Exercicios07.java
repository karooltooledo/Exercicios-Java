package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicios07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, e, f, x, y;
		
		System.out.println("Digite um número para a: ");
		a = entrada.nextInt();
		
		System.out.println("Digite um número para b: ");
		b = entrada.nextInt();
		
		System.out.println("Digite um número para c: ");
		c = entrada.nextInt();
		
		System.out.println("Digite um número para d: ");
		d = entrada.nextInt();
		
		System.out.println("Digite um número para e: ");
		e = entrada.nextInt();
		
		System.out.println("Digite um número para f: ");
		f = entrada.nextInt();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.println("O resultado final de X é: " + x);
		System.out.println("\nO resultado final de Y é: " + y);
	}

}
