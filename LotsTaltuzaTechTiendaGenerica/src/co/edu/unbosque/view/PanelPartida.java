package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPartida extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public static final String AGREGARPARTIDA = "AgregarPartida";
	public static final String LEERPARTIDA = "LeerPartida";
	private JLabel labJugador1;
	private JTextField txtJugador1;
	private JLabel labPuntaje1;
	private JTextField txtPuntaje1;
	private JLabel labJugador2;
	private JTextField txtJugador2;
	private JButton butAgregar;
	private JButton butLeer;
	private JLabel labPuntaje2;
	private JTextField txtPuntaje2;
	private JTextField txtTipoPartida;
	private JLabel labTipoPartida;

	
	public PanelPartida() {
		setLayout( new GridLayout(6,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Partida");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labJugador1 = new JLabel("Jugador 1");
		add(labJugador1);
		
		txtJugador1 = new JTextField("");
		txtJugador1.setForeground(Color.BLACK);
		txtJugador1.setBackground(Color.WHITE);
		add(txtJugador1);
		
		labPuntaje1 = new JLabel("Puntaje 1");
		add(labPuntaje1);
		
		txtPuntaje1 = new JTextField("");
		txtPuntaje1.setForeground(Color.BLACK);
		txtPuntaje1.setBackground(Color.WHITE);
		add(txtPuntaje1);
		
		labJugador2 = new JLabel("Jugador 2");
		add(labJugador2);
		
		txtJugador2 = new JTextField("");
		txtJugador2.setForeground(Color.BLACK);
		txtJugador2.setBackground(Color.WHITE);
		add(txtJugador2);
		
		labPuntaje2 = new JLabel("Puntaje 2");
		add(labPuntaje2);
		
		txtPuntaje2 = new JTextField("");
		txtPuntaje2.setForeground(Color.BLACK);
		txtPuntaje2.setBackground(Color.WHITE);
		add(txtPuntaje2);
		
		labTipoPartida = new JLabel("Tipo de Partida");
		add(labTipoPartida);
		
		txtTipoPartida = new JTextField("");
		txtTipoPartida.setForeground(Color.BLACK);
		txtTipoPartida.setBackground(Color.WHITE);
		add(txtTipoPartida);
		
		butAgregar = new JButton("Escribir Partida");
		butAgregar.setActionCommand(AGREGARPARTIDA);
		add(butAgregar);
		
		butLeer = new JButton("Leer Partida");
		butLeer.setActionCommand(LEERPARTIDA);
		add(butLeer);
	}


	public JLabel getLabJugador1() {
		return labJugador1;
	}


	public void setLabJugador1(JLabel labJugador1) {
		this.labJugador1 = labJugador1;
	}


	public JTextField getTxtJugador1() {
		return txtJugador1;
	}


	public void setTxtJugador1(JTextField txtJugador1) {
		this.txtJugador1 = txtJugador1;
	}


	public JLabel getLabPuntaje1() {
		return labPuntaje1;
	}


	public void setLabPuntaje1(JLabel labPuntaje1) {
		this.labPuntaje1 = labPuntaje1;
	}


	public JTextField getTxtPuntaje1() {
		return txtPuntaje1;
	}


	public void setTxtPuntaje1(JTextField txtPuntaje1) {
		this.txtPuntaje1 = txtPuntaje1;
	}


	public JLabel getLabJugador2() {
		return labJugador2;
	}


	public void setLabJugador2(JLabel labJugador2) {
		this.labJugador2 = labJugador2;
	}


	public JTextField getTxtJugador2() {
		return txtJugador2;
	}


	public void setTxtJugador2(JTextField txtJugador2) {
		this.txtJugador2 = txtJugador2;
	}


	public JButton getButAgregar() {
		return butAgregar;
	}


	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}


	public JButton getButLeer() {
		return butLeer;
	}


	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}


	public JLabel getLabPuntaje2() {
		return labPuntaje2;
	}


	public void setLabPuntaje2(JLabel labPuntaje2) {
		this.labPuntaje2 = labPuntaje2;
	}


	public JTextField getTxtPuntaje2() {
		return txtPuntaje2;
	}


	public void setTxtPuntaje2(JTextField txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}


	public JTextField getTxtTipoPartida() {
		return txtTipoPartida;
	}


	public void setTxtTipoPartida(JTextField txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}


	public JLabel getLabTipoPartida() {
		return labTipoPartida;
	}


	public void setLabTipoPartida(JLabel labTipoPartida) {
		this.labTipoPartida = labTipoPartida;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getAgregarpartida() {
		return AGREGARPARTIDA;
	}


	public static String getLeerpartida() {
		return LEERPARTIDA;
	}
	


	

	


	
	


	
}
