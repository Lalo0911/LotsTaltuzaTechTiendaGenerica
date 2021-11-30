package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPropiedades extends JPanel{

private JLabel labNombreTienda;
	private JTextField txtNombreTienda;
	
	private JLabel labTipoComercio;
	private JTextField txtTipoComercio;
	
	private JLabel labNit;
	private JTextField txtNit;
	
	private JLabel labCiudad;
	private JTextField txtCiudad;
	
	private JLabel labValorIva;
	private JTextField txtValorIva;
	
	private JLabel labTasaInteres;
	private JTextField txtTasaInteres;
	
	private JLabel labNombreBanco;
	private JTextField txtNombreBanco;
	
	private JLabel labNumeroCuenta;
	private JTextField txtNumeroCuenta;
	
	private JLabel labNombreGerente;
	private JTextField txtNombreGerente;
	
	
	private JButton butEditar;
	

	private static final long serialVersionUID = 1L;
	
	public PanelPropiedades() {
		
		setLayout( new GridLayout(10,2) );
		
		TitledBorder border = BorderFactory.createTitledBorder("Propiedades");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labNombreTienda = new JLabel("Nombre Tienda:");
		
		
		txtNombreTienda = new JTextField("");
		txtNombreTienda .setForeground(Color.BLACK);
		txtNombreTienda .setBackground(Color.WHITE);
		
		
		labTipoComercio = new JLabel("Tipo comercio:");
		
		
		txtTipoComercio = new JTextField("");
		txtTipoComercio.setForeground(Color.BLACK);
		txtTipoComercio.setBackground(Color.WHITE);
		
		
		labNit = new JLabel("Nit empresa:");
		
		
		txtNit = new JTextField("");
		txtNit.setForeground(Color.BLACK);
		txtNit.setBackground(Color.WHITE);
		
		
		labCiudad = new JLabel("Ciudad de ubicación:");
		
		
		txtCiudad = new JTextField("");
		txtCiudad.setForeground(Color.BLACK);
		txtCiudad.setBackground(Color.WHITE);
		
		
		labValorIva = new JLabel("Valor Iva:");
		
		
		txtValorIva = new JTextField("");
		txtValorIva.setForeground(Color.BLACK);
		txtValorIva.setBackground(Color.WHITE);
		
		
		labTasaInteres = new JLabel("Tasa Interes:");
		
		
		txtTasaInteres = new JTextField("");
		txtTasaInteres.setForeground(Color.BLACK);
		txtTasaInteres.setBackground(Color.WHITE);
		
		
		labNombreBanco = new JLabel("Nombre Banco:");
		
		
		txtNombreBanco = new JTextField("");
		txtNombreBanco.setForeground(Color.BLACK);
		txtNombreBanco.setBackground(Color.WHITE);
		
		
		labNumeroCuenta = new JLabel("Numero Cuenta:");
		
		
		txtNumeroCuenta = new JTextField("");
		txtNumeroCuenta.setForeground(Color.BLACK);
		txtNumeroCuenta.setBackground(Color.WHITE);
		
		
		labNombreGerente = new JLabel("Nombre Gerente:");
		
		
		txtNombreGerente = new JTextField("");
		txtNombreGerente.setForeground(Color.BLACK);
		txtNombreGerente.setBackground(Color.WHITE);
		
		
		
		butEditar = new JButton("Editar prop");
		butEditar.setActionCommand("EDITARPROPIEDADES");
		
		
		add(labNombreTienda);
		add(txtNombreTienda);
		add(labTipoComercio);
		add(txtTipoComercio);
		add(labNit);
		add(txtNit);
		add(labCiudad);
		add(txtCiudad);
		add(labValorIva);
		add(txtValorIva);
		add(labTasaInteres);
		add(txtTasaInteres);
		add(labNombreBanco);
		add(txtNombreBanco);
		add(labNumeroCuenta);
		add(txtNumeroCuenta);
		add(labNombreGerente);
		add(txtNombreGerente);
		add(butEditar);
	
	}

	public JLabel getLabNombreTienda() {
		return labNombreTienda;
	}

	public JTextField getTxtNombreTienda() {
		return txtNombreTienda;
	}

	public JLabel getLabTipoComercio() {
		return labTipoComercio;
	}

	public JTextField getTxtTipoComercio() {
		return txtTipoComercio;
	}

	public JLabel getLabNit() {
		return labNit;
	}

	public JTextField getTxtNit() {
		return txtNit;
	}

	public JLabel getLabCiudad() {
		return labCiudad;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public JLabel getLabValorIva() {
		return labValorIva;
	}

	public JTextField getTxtValorIva() {
		return txtValorIva;
	}

	public JLabel getLabTasaInteres() {
		return labTasaInteres;
	}

	public JTextField getTxtTasaInteres() {
		return txtTasaInteres;
	}

	public JLabel getLabNombreBanco() {
		return labNombreBanco;
	}

	public JTextField getTxtNombreBanco() {
		return txtNombreBanco;
	}

	public JLabel getLabNumeroCuenta() {
		return labNumeroCuenta;
	}

	public JTextField getTxtNumeroCuenta() {
		return txtNumeroCuenta;
	}

	public JLabel getLabNombreGerente() {
		return labNombreGerente;
	}

	public JTextField getTxtNombreGerente() {
		return txtNombreGerente;
	}

	public JButton getButEditar() {
		return butEditar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}


