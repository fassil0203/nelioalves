package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		int x;
		
		System.out.println("Digite um Numero :");
		x = sc.nextInt();
		
		if((x % 2) == 0 ) {
			System.out.println("O numero é PAR");
		}else {
			System.out.println(" O numero é IMPAR ");
		}
		sc.close();

	}

}
