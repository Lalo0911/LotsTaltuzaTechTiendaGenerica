package co.edu.unbosque.view;

import java.awt.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class PanelVentas extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField txfCodProd;
	private JLabel lblCliente;
	private JLabel lblNombreCliente;
	private JLabel lblNumeroFactura;
	private JLabel lblIndice_numeroFactura;
	private JLabel lblCodigoProd;
	private JButton btnBuscarProd;
	private JLabel productoBuscado;
	private JButton btnAgregarProd;
	
	
	public PanelVentas() {
		
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		setLayout(new MigLayout("", "[88.00][162.00px][205.00px][72.00]", "[][100px][44.00px][31.00px][100px][100px]"));
		
		lblCliente = new JLabel("Cliente:");
		add(lblCliente, "cell 1 0,alignx right");
		
		lblNombreCliente = new JLabel("----");
		add(lblNombreCliente, "cell 2 0,alignx center");
		
		lblNumeroFactura = new JLabel("No. Factura");
		add(lblNumeroFactura, "cell 1 1,alignx right,growy");
		
		lblIndice_numeroFactura = new JLabel("0");
		add(lblIndice_numeroFactura, "cell 2 1,alignx center,growy");
		
		add(new JLabel(""), "cell 0 2");
		
		lblCodigoProd = new JLabel("C\u00F3digo del producto");
		add(lblCodigoProd, "cell 1 2,grow");
		
		txfCodProd = new JTextField();
		add(txfCodProd, "cell 2 2,grow");
		txfCodProd.setColumns(10);
		
		btnBuscarProd = new JButton("Buscar Producto");
		add(btnBuscarProd, "cell 2 3,grow");
		
		add(new JLabel(""), "cell 1 4,grow");
		
		productoBuscado = new JLabel("\"producto buscado\"  #cantidad   ---$$  ");
		add(productoBuscado, "cell 2 4,grow");
		
		btnAgregarProd = new JButton("Agregar");
		add(btnAgregarProd, "cell 3 4");
		
		add(new JLabel(""), "cell 1 5,grow");

	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public JTextField getTxfCodProd() {
		return txfCodProd;
	}


	public JLabel getLblCliente() {
		return lblCliente;
	}


	public JLabel getLblNombreCliente() {
		return lblNombreCliente;
	}


	public JLabel getLblNumeroFactura() {
		return lblNumeroFactura;
	}


	public JLabel getLblIndice_numeroFactura() {
		return lblIndice_numeroFactura;
	}


	public JLabel getLblCodigoProd() {
		return lblCodigoProd;
	}


	public JButton getBtnBuscarProd() {
		return btnBuscarProd;
	}


	public JLabel getProductoBuscado() {
		return productoBuscado;
	}


	public JButton getBtnAgregarProd() {
		return btnAgregarProd;
	}
	
}
