package ListaExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int A, B, soma;
		
		System.out.println("Digite o valor de A : ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B :");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}

}
