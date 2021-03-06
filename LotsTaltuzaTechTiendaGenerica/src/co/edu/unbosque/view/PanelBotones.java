package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelBotones extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JButton butClientes;
	private JButton butProveedores;
	private JButton butProductos;
	private JButton butVentas;
	private JButton butEditarProperties;
	private JButton butConsultas;
	
	
	private JLabel labTitulo1;


	public PanelBotones() {
		
		setLayout( new GridLayout(7,1) );
		
		labTitulo1 = new JLabel("Taltuza Tech Tienda Generica", SwingConstants.CENTER);
		labTitulo1.setFont((new Font("Bahnschrift",Font.BOLD,20)));
		add(labTitulo1);
		
		butClientes = new JButton("Gestion clientes");
		butClientes.setActionCommand("CLIENTE");
		add(butClientes);
		
		butProveedores = new JButton("Gestion Proveedores");
		butProveedores.setActionCommand("PROVEEDORES");
		add(butProveedores);
		
		butProductos = new JButton("Gestion Productos");
		butProductos.setActionCommand("PRODUCTOS");
		add(butProductos);
		
		butVentas = new JButton("Gestion Ventas");
		butVentas.setActionCommand("VENTAS");
		add(butVentas);
		
		butEditarProperties = new JButton("Editar Propiedades");
		butEditarProperties.setActionCommand("EDITAR");
		add(butEditarProperties);
		
		butConsultas = new JButton("Consultas");
		butConsultas.setActionCommand("CONSULTAS");
		add(butConsultas);
		
		
	}

	public JButton getButEditarProperties() {
		return butEditarProperties;
	}



	public void setButEditarProperties(JButton butEditarProperties) {
		this.butEditarProperties = butEditarProperties;
	}
	
	
	public JButton getButClientes() {
		return butClientes;
	}



	public void setButClientes(JButton butClientes) {
		this.butClientes = butClientes;
	}



	public JButton getButProveedores() {
		return butProveedores;
	}



	public void setButProveedores(JButton butProveedores) {
		this.butProveedores = butProveedores;
	}



	public JButton getButProductos() {
		return butProductos;
	}



	public void setButProductos(JButton butProductos) {
		this.butProductos = butProductos;
	}



	public JButton getButVentas() {
		return butVentas;
	}



	public void setButVentas(JButton butVentas) {
		this.butVentas = butVentas;
	}



	public JLabel getLabTitulo1() {
		return labTitulo1;
	}



	public void setLabTitulo1(JLabel labTitulo1) {
		this.labTitulo1 = labTitulo1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getButConsultas() {
		return butConsultas;
	}

	public void setButConsultas(JButton butConsultas) {
		this.butConsultas = butConsultas;
	}


	
}
