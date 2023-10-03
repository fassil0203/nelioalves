package ListaExercicios;

import javax.swing.JOptionPane;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		{
		      String str_num1,str_num2;
		      int num1,num2;
		      JanelaBasica tela = new JanelaBasica("Soma");
		      str_num1 = JOptionPane.showInputDialog("Digite um número");
		      str_num2 = JOptionPane.showInputDialog("Digite outro número");
		      num1 = Integer.parseInt(str_num1);
		      num2 = Integer.parseInt(str_num2);
		      tela.println("A soma é: "+(num1+num2));
		   }
	}

}
