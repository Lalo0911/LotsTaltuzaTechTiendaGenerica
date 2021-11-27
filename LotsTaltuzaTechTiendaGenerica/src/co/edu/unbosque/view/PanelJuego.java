package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelJuego extends JPanel{

	private JTextField txtTipoJuego;
	private JTextField txtNombreJuego;
	private JButton butAgregar;
	private JButton butLeer;
	private JLabel labNombreJuego;
	private JLabel labTipoJuego;
	public static final String AGREGARJUEGO = "AgregarJuego";
	public static final String LEERJUEGO = "LeerJuego";
	private static final long serialVersionUID = 1L;
	
	public PanelJuego() {
		setLayout( new GridLayout(3,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Juego");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labNombreJuego = new JLabel("Nombre Juego:");
		add(labNombreJuego);
		txtNombreJuego = new JTextField("");
		txtNombreJuego.setForeground(Color.BLACK);
		txtNombreJuego.setBackground(Color.WHITE);
		add(txtNombreJuego);
		labTipoJuego = new JLabel("Tipo Juego:");
		add(labTipoJuego);
		txtTipoJuego = new JTextField("");
		txtTipoJuego.setForeground(Color.BLACK);
		txtTipoJuego.setBackground(Color.WHITE);
		add(txtTipoJuego);
		butAgregar = new JButton("Escribir Juego");
		butAgregar.setActionCommand(AGREGARJUEGO);
		butLeer = new JButton("Leer Juego");
		butLeer.setActionCommand(LEERJUEGO);
		add(butAgregar);
		add(butLeer);
	}

	
	public JTextField getTxtTipoJuego() {
		return txtTipoJuego;
	}

	public void setTxtTipoJuego(JTextField txtTipoJuego) {
		this.txtTipoJuego = txtTipoJuego;
	}

	public JTextField getTxtNombreJuego() {
		return txtNombreJuego;
	}

	public void setTxtNombreJuego(JTextField txtNombreJuego) {
		this.txtNombreJuego = txtNombreJuego;
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

	public JLabel getLabNombreJuego() {
		return labNombreJuego;
	}

	public void setLabNombreJuego(JLabel labNombreJuego) {
		this.labNombreJuego = labNombreJuego;
	}

	public JLabel getLabTipoJuego() {
		return labTipoJuego;
	}

	public void setLabTipoJuego(JLabel labTipoJuego) {
		this.labTipoJuego = labTipoJuego;
	}

	public static String getAgregar() {
		return AGREGARJUEGO;
	}

	public static String getLeer() {
		return LEERJUEGO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	

	
	
}
