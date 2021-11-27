package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJugador1 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public static final String AGREGARJUGADOR = "AgregarJugador";
	public static final String LEERJUGADOR = "LeerJugador";
	private JLabel labNombre;
	private JTextField txtNombre;
	private JLabel labEdad;
	private JTextField txtEdad;
	private JLabel labGenero;
	private JTextField txtGenero;
	private JTextField txtPuntaje;
	private JButton butLeer;
	private JLabel labPuntaje;
	private JLabel labVacio1;
	private JLabel labVacio2;
	private JButton butAgregar2;
	private JLabel labDocumento;
	private JTextField txtDocumento;


	
	public PanelJugador1() {
		setLayout( new GridLayout(7,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		
		
		labDocumento = new JLabel("Documento:");
		add(labDocumento);
		
		txtDocumento = new JTextField("");
		txtDocumento.setForeground(Color.BLACK);
		txtDocumento.setBackground(Color.WHITE);
		add(txtDocumento);
		
		labNombre = new JLabel("Nombre:");
		add(labNombre);
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		add(txtNombre);
		
		labEdad = new JLabel("Edad:");
		add(labEdad);
		
		txtEdad = new JTextField("");
		txtEdad.setForeground(Color.BLACK);
		txtEdad.setBackground(Color.WHITE);
		add(txtEdad);
		
		labGenero = new JLabel("Genero:");
		add(labGenero);
		
		txtGenero = new JTextField("");
		txtGenero.setForeground(Color.BLACK);
		txtGenero.setBackground(Color.WHITE);
		add(txtGenero);
		
		labPuntaje = new JLabel("Puntaje:");
		add(labPuntaje);
		
		txtPuntaje = new JTextField("");
		txtPuntaje.setForeground(Color.BLACK);
		txtPuntaje.setBackground(Color.WHITE);
		add(txtPuntaje);
		
		labVacio1 = new JLabel("");
		add(labVacio1);
		
		labVacio2 = new JLabel("");
		add(labVacio2);
		
		butAgregar2 = new JButton("Escribir Jugador");
		butAgregar2.setActionCommand(AGREGARJUGADOR);
		add(butAgregar2);
		
		butLeer = new JButton("Leer Jugador");
		butLeer.setActionCommand(LEERJUGADOR);
		add(butLeer);
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public static String getAgregarjugador() {
		return AGREGARJUGADOR;
	}



	public static String getLeerjugador() {
		return LEERJUGADOR;
	}



	public JLabel getLabNombre() {
		return labNombre;
	}



	public JTextField getTxtNombre() {
		return txtNombre;
	}



	public JLabel getLabEdad() {
		return labEdad;
	}



	public JTextField getTxtEdad() {
		return txtEdad;
	}



	public JLabel getLabGenero() {
		return labGenero;
	}



	public JTextField getTxtGenero() {
		return txtGenero;
	}



	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}



	public JButton getButLeer() {
		return butLeer;
	}



	public JLabel getLabPuntaje() {
		return labPuntaje;
	}



	public JLabel getLabVacio1() {
		return labVacio1;
	}



	public JLabel getLabVacio2() {
		return labVacio2;
	}


	public JButton getButAgregar2() {
		return butAgregar2;
	}



	public JLabel getLabDocumento() {
		return labDocumento;
	}



	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	



	

}
