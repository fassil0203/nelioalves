package ListaExercicios;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaBasica {
	
		// instance variables - replace the example below with your own
		private JTextArea  texto;
		private JFrame     frame;

		/**
		 * Constructor for objects of class JanelaBasica
		 */
		public JanelaBasica(String tit)
		{
			// initialise instance variables
			frame = new JFrame(tit);
			frame.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);	} } );
			Container c = frame.getContentPane();
			c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
			texto = new JTextArea(20,30);
			//int larg = 12; //texto.getColumnWidth();
			texto.setEditable(false);
			c.add(new JScrollPane(texto));;
			frame.setSize(300,300);
			frame.show();
		}

		public void print(String linha)
		{
			texto.append(linha);
		}

		public void println(String linha)
		{
			print(linha+'\n');
		}

}
