package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite o Numero ");
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("NAO NEGATIVO ");
		} else {
		System.out.println("NEGATIVO");
		}
		
		sc.close();
		
		
	}

}
