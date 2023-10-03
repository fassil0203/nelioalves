package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		JanelaBasica tela = new JanelaBasica("Soma");
		
		String str_A,str_B,str_C,str_D;
		int num1,num2,num3,num4;

		

		str_A = JOptionPane.showInputDialog(null, "Digite o Valor de A");
		num1 = Integer.parseInt(str_A);
		
		str_B = JOptionPane.showInputDialog(null, "Digite o Valor de B");
		num2 = Integer.parseInt(str_B);
		
		str_C = JOptionPane.showInputDialog(null,"Digite o valor de C");
		num3 = Integer.parseInt(str_C);
		
		str_D = JOptionPane.showInputDialog(null, "Digite o Valor de D");
		num4 = Integer.parseInt(str_D);

		tela.println("A soma é : " + (num1 * num2 + num3 * num4));
		

		

		sc.close();
		
	}

}
