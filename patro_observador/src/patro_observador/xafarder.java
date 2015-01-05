package patro_observador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class xafarder extends JFrame  implements IObserver{

	private JPanel contentPane;
	private JTextField txtResultat;



	public xafarder(absEmissor  emissor) {
		emissor.afegirObservador(this);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResultat = new JTextField();
		txtResultat.setEditable(false);
		txtResultat.setBounds(91, 84, 86, 20);
		contentPane.add(txtResultat);
		txtResultat.setColumns(10);
	}



	@Override
	public void notificar(absEmissor clase, String metode) {


		if (metode == "resultat"){
			txtResultat.setText(String.valueOf( clase.totalSuma()));
		}
		
		
	}

}
