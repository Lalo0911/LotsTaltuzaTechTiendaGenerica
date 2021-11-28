package co.edu.unbosque.view;

import java.awt.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class PanelVentas extends JPanel{

	private static final long serialVersionUID = 2L;
	
	private JTextField txfcantProd;
	private JTextField txfCodProd;
	private JLabel lblcantProd;
	private JLabel lblCliente;
	private JLabel lblNombreCliente;
	private JLabel lblNumeroFactura;
	private JLabel lblIndice_numeroFactura;
	private JLabel lblCodigoProd;
	private JButton btnBuscarProd;
	private JLabel lblproductoBuscado;
	private JButton btnAgregarProd;
	private JButton btnTerminarCompra;
	
	
	
	public PanelVentas() {
		
		TitledBorder border = BorderFactory.createTitledBorder("Ventas");
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
		
		lblCodigoProd = new JLabel("Codigo del producto");
		add(lblCodigoProd, "cell 1 2,grow");
		
		txfCodProd = new JTextField("");
		add(txfCodProd, "cell 2 2,grow");
		txfCodProd.setColumns(10);
		
		
		add(new JLabel(""), "cell 1 4,grow");
		
		lblproductoBuscado = new JLabel("Producto");
		add(lblproductoBuscado, "cell 2 4,alignx center,grow");
		
		btnBuscarProd = new JButton("Buscar Producto");
		btnBuscarProd.setActionCommand("BUSCARPRODUCTO_A_AÑADIR");
		add(btnBuscarProd, "cell 2 3,alignx center,grow");
		
		
		btnAgregarProd = new JButton("Agregar");
		btnAgregarProd.setActionCommand("AGREGARPRODUCTO1");
		add(btnAgregarProd, "cell 1 4");
		
		btnTerminarCompra = new JButton("Finalizar Compra");
		btnTerminarCompra.setActionCommand("FINALIZARCOMPRA"); 
		add(btnTerminarCompra, "cell 2 5, alignx center, growx");
		
		lblcantProd = new JLabel("Cantidad:");
		add(lblcantProd, "cell 3 4,growx");
		
		txfcantProd = new JTextField("");
		add(txfcantProd, "cell 4 4,grow");
		
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


	public JLabel getlblProductoBuscado() {
		return lblproductoBuscado;
	}


	public JButton getBtnAgregarProd() {
		return btnAgregarProd;
	}


	public JButton getBtnTerminarCompra() {
		return btnTerminarCompra;
	}


	public JTextField getTxfcantProd() {
		return txfcantProd;
	}


	public JLabel getLblcantProd() {
		return lblcantProd;
	}
	
}
