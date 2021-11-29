package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import net.miginfocom.swing.MigLayout;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelConsultas extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitulo;
	private JLabel lblIngresar;
	private JButton btnConsultaClientes;
	private JButton btnConsultaProveedores;
	private JButton btnConsultaDetalleCliente;
	private JTextField txfIngresoId;
	
	
	public PanelConsultas() {
		setLayout(new MigLayout("", "[154.00][106.00px][128.00px][80.00px][130.00]", "[119.00][91.00px][52.00px][40.00]"));
		
		
		lblTitulo = new JLabel("CONSULTAS :D");
		add(lblTitulo, "cell 2 1,alignx center,growy");
		
		lblTitulo = new JLabel("Ingrese ID:");
		add(lblTitulo, "cell 1 3,alignx center,growy");

		btnConsultaClientes = new JButton("Consulta Clientes");
		btnConsultaClientes.setActionCommand("CONSULTACLIENTES");
		btnConsultaClientes.setPreferredSize(new Dimension(200,100));;
		add(btnConsultaClientes, "cell 1 2,alignx center,aligny center");
		
		btnConsultaDetalleCliente = new JButton("Consulta Detalle Clientes");
		btnConsultaDetalleCliente.setActionCommand("CONSULTADETALLECLIENTES");
		btnConsultaDetalleCliente.setPreferredSize(new Dimension(200,100));;
		add(btnConsultaDetalleCliente, "cell 2 2,alignx center,aligny center");

		 btnConsultaProveedores = new JButton("Consulta Proveedores");
		 btnConsultaProveedores.setActionCommand("CONSULTAPROVEEDORES");
		 btnConsultaProveedores.setPreferredSize(new Dimension(200,100));;
		add(btnConsultaProveedores, "cell 3 2,alignx center,aligny center");
		
		
		txfIngresoId = new JTextField("");
		add(txfIngresoId, "cell 2 3,grow");
		txfIngresoId.setColumns(5);

	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JButton getBtnConsultaClientes() {
		return btnConsultaClientes;
	}

	public void setBtnConsultaClientes(JButton btnConsultaClientes) {
		this.btnConsultaClientes = btnConsultaClientes;
	}

	public JButton getBtnConsultaProveedores() {
		return btnConsultaProveedores;
	}

	public void setBtnConsultaProveedores(JButton btnConsultaProveedores) {
		this.btnConsultaProveedores = btnConsultaProveedores;
	}


	public JLabel getLblIngresar() {
		return lblIngresar;
	}


	public JButton getBtnConsultaDetalleCliente() {
		return btnConsultaDetalleCliente;
	}


	public JTextField getTxfIngresoId() {
		return txfIngresoId;
	}

}
