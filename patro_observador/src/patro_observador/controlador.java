package patro_observador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class controlador extends absEmissor {

	private JFrame frmControlador;
	private JTextField txtNumero;
private JLabel lblResultat;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlador window = new controlador();
					window.frmControlador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public controlador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	xafarder xafarder = new xafarder(this);
	CopyOfxafarder xafarder1 = new CopyOfxafarder(this);
	xafarder.setVisible(true);
	xafarder1.setVisible(true);
		frmControlador = new JFrame();
		frmControlador.setBounds(100, 100, 450, 300);
		frmControlador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlador.getContentPane().setLayout(null);
		
		JButton btnAfegir = new JButton("Afegir");
		btnAfegir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			afegir( Integer.valueOf(txtNumero.getText()));
			}
			
		});
		publicarSucces(this, "canvis");
		btnAfegir.setBounds(315, 228, 89, 23);
		frmControlador.getContentPane().add(btnAfegir);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(153, 73, 195, 20);
		frmControlador.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		 lblResultat = new JLabel("0");
		lblResultat.setBounds(77, 149, 46, 14);
		frmControlador.getContentPane().add(lblResultat);
	}
	
	
	private void afegir(int valor){
		int suma = Integer.valueOf(this.lblResultat.getText());
		suma = suma +valor;
	this.lblResultat.setText( String.valueOf(suma));
	publicarSucces(this, "resultat");
	}
	
	public int obtenirDades(){
		return Integer.valueOf(lblResultat.getText());
		
	}

	@Override
	public int totalSuma() {
		
		return Integer.valueOf(this.lblResultat.getText());
	}

	
}


