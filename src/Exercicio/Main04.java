package Exercicio;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int horaInicial,horaFinal ;
		 
		int duracao;
		
		
		System.out.println("Digite a Hora Inicial :");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a Hora Final ");
		horaFinal = sc.nextInt();
		

		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
