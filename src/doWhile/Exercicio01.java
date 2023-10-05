package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite a Temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja Repetir (S/N)? ");
			resp = sc.next().charAt(0);
			
		}while (resp !='n');
		
		
		sc.close();

	}

}
