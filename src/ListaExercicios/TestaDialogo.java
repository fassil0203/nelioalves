package ListaExercicios;

import javax.swing.JOptionPane;

public class TestaDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
	      nome = JOptionPane.showInputDialog("Digite o seu nome");
	      JOptionPane.showMessageDialog(null,"Seu nome é "+nome);
	      System.exit(0);

	}

}
