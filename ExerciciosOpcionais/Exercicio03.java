package ExerciciosOpcionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tempoEvento, tempoHoras, tempoMinutos, tempoSegundos;
		
		System.out.println("Informe quantos segundos durou o Evento: ");
		tempoEvento = entrada.nextInt();
				
		tempoHoras = tempoEvento / 3600;
		tempoMinutos = (tempoEvento % 3600) / 60;
		tempoSegundos = (tempoEvento % 60);
		
		System.out.println(tempoHoras + " Horas " + tempoMinutos + " minutos, e " + tempoSegundos + " segundos de duração de evento");
	}

}
