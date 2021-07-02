package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idadeDias, resultadoAnos, resultadoMeses, resultadoDias;
		
		System.out.println("Informe a quantidade de dias: ");
		idadeDias = entrada.nextInt();
		
		resultadoAnos = idadeDias / 365;
		
		System.out.println("Você tem " + resultadoAnos + " anos, ");
		
		resultadoMeses = idadeDias % 365 / 30;
		
		System.out.println(resultadoMeses + " meses e ");
		
		resultadoDias = idadeDias % 365 % 30;
		
		System.out.println(resultadoDias + " dias de vida");
				
	}

}
