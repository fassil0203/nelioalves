package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y ;
		double z;
		//char w;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		
//		System.out.println("Digite o valor de X");
//		x = sc.next();
//		
//		System.out.println("Digite o Valor de Y");
//		y = sc.nextInt();
//		
//		System.out.println("Digite o Valor de z ");
//		z =sc.nextDouble();
//		
//		System.out.println("Digite o valor de w");
//		w = sc.next().charAt(0);
		
//		
//		System.out.println("O valor digitado de x foi " + x);
//		System.out.println("O valor de Y foi : " + y);
//		System.out.printf("O valor de Z foi: %.2f%n", z);
//		System.out.println(w);
		
		
		
		System.out.println("Dados Digitados :");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
		

	}

}
