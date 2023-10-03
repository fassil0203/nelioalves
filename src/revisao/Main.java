package revisao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.334455;
		System.out.println(y);
		
		System.out.println(x);
		
		System.out.print("Oi  ");
		
		System.out.println("bom Dia !!!");
		
		System.out.printf("%.2f%n",x);
		
		System.out.printf("%.4f%n",x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.println("");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
