package ExerciciosJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		 int contador = 1, idade, calmocontador = 0, mulhernervosa = 0, homemagressivo = 0, outrocalmo = 0, acima40Nervosa = 0, menor18Calma = 0;
	        int sexo; 
	        int opcao;
	        Scanner scan = new Scanner(System.in);

	        while(contador != 10) {
	            System.out.println("Insira sua idade:");
	            idade = scan.nextInt();
	            System.out.println("Insira seu sexo de acordo com os n�meros:" + "\n1-feminino" + "\n2-masculino" + "\n3-outros" );
	            sexo = scan.nextInt();
	            System.out.println("Selecione um dos estados que voc� se identifica:" + "\n1 - � uma pessoa calma" + "\n2 - � uma pessoa nervosa" + "\n3 - agressiva");
	            opcao = scan.nextInt();

	            if(opcao == 1) {
	                calmocontador++;
	            }
	            if(sexo == 1 && opcao == 2) {
	                mulhernervosa++;
	            }
	            if(sexo == 2 && opcao == 3) {
	                homemagressivo++;
	            }
	            if(sexo == 3 && opcao == 1) {
	                outrocalmo++;
	            }
	            if(idade > 40 && opcao == 2) {
	                acima40Nervosa++;
	            }
	            if(idade < 18 && opcao == 1) {
	                menor18Calma++;
	            }
	            contador++;
	        }
	        System.out.println("O n�mero de pessoas calmas �: " + calmocontador);
	        System.out.println("O n�mero de mulheres nervosas �: " + mulhernervosa);
	        System.out.println("O n�mero de homens agressivos �: " + homemagressivo);
	        System.out.println("O n�mero de outros calmos �: " + outrocalmo);
	        System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + acima40Nervosa);
	        System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + menor18Calma);
		}

	}


