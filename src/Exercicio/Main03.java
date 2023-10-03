package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite o Valor de X ");
		A = sc.nextInt();
		System.out.println("Digite o Valor de Y ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		

	}

}
