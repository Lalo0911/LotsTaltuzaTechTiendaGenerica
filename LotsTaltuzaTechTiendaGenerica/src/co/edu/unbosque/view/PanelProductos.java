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

public class PanelProductos extends JPanel{

	
	
	private JLabel labCodigoProducto;
	private JTextField txtCodigoProducto;
	
	private JLabel labNombreProducto;
	private JTextField txtNombreProducto;
	
	private JLabel labNitProveedorDeProducto;
	private JTextField txtNitProveedorDeProducto;
	
	private JLabel labPrecioCompraProducto;
	private JTextField txtPrecioCompraProducto;
	
	private JLabel labPrecioVentaProducto;
	private JTextField txtPrecioVentaProducto;
	
	
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butActualizar;
	private JButton butEliminar;
	

	private static final long serialVersionUID = 1L;
	
	public PanelProductos() {
		
		setLayout( new GridLayout(8,2) );
		
		TitledBorder border = BorderFactory.createTitledBorder("Productos");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labCodigoProducto = new JLabel("Codigo Producto:");
		add(labCodigoProducto);
		
		txtCodigoProducto = new JTextField("");
		txtCodigoProducto .setForeground(Color.BLACK);
		txtCodigoProducto .setBackground(Color.WHITE);
		add(txtCodigoProducto );
		
		labNombreProducto = new JLabel("Nombre Producto:");
		add(labNombreProducto);
		
		txtNombreProducto = new JTextField("");
		txtNombreProducto.setForeground(Color.BLACK);
		txtNombreProducto.setBackground(Color.WHITE);
		add(txtNombreProducto);
		
		labNitProveedorDeProducto = new JLabel("Proveedor del producto:");
		add(labNitProveedorDeProducto);
		
		txtNitProveedorDeProducto = new JTextField("");
		txtNitProveedorDeProducto.setForeground(Color.BLACK);
		txtNitProveedorDeProducto.setBackground(Color.WHITE);
		add(txtNitProveedorDeProducto);
		
		labPrecioCompraProducto = new JLabel("Precio de compra producto:");
		add(labPrecioCompraProducto);
		
		txtPrecioCompraProducto = new JTextField("");
		txtPrecioCompraProducto.setForeground(Color.BLACK);
		txtPrecioCompraProducto.setBackground(Color.WHITE);
		add(txtPrecioCompraProducto);
		
		labPrecioVentaProducto = new JLabel("Precio de venta producto:");
		add(labPrecioVentaProducto);
		
		txtPrecioVentaProducto = new JTextField("");
		txtPrecioVentaProducto.setForeground(Color.BLACK);
		txtPrecioVentaProducto.setBackground(Color.WHITE);
		add(txtPrecioVentaProducto);
		
		butEscribir = new JButton("Escribir Producto");
		butEscribir.setActionCommand("AGREGARPRODUCTO");
		add(butEscribir);
		
		butLeer = new JButton("Leer Producto");
		butLeer.setActionCommand("LEERPRODUCTO");
		add(butLeer);
		
		butActualizar = new JButton("Actualizar Producto");
		butActualizar.setActionCommand("ACTUALIZARPRODUCTO");
		add(butActualizar);
		
		butEliminar = new JButton("Borrar Producto");
		butEliminar.setActionCommand("BORRARPRODUCTO");
		add(butEliminar);
		
		
	}

	public JLabel getLabCodigoProducto() {
		return labCodigoProducto;
	}

	public JTextField getTxtCodigoProducto() {
		return txtCodigoProducto;
	}

	public JLabel getLabNombreProducto() {
		return labNombreProducto;
	}

	public JTextField getTxtNombreProducto() {
		return txtNombreProducto;
	}

	public JLabel getLabNitProveedorDeProducto() {
		return labNitProveedorDeProducto;
	}

	public JTextField getTxtNitProveedorDeProducto() {
		return txtNitProveedorDeProducto;
	}

	public JLabel getLabPrecioCompraProducto() {
		return labPrecioCompraProducto;
	}

	public JTextField getTxtPrecioCompraProducto() {
		return txtPrecioCompraProducto;
	}

	public JLabel getLabPrecioVentaProducto() {
		return labPrecioVentaProducto;
	}

	public JTextField getTxtPrecioVentaProducto() {
		return txtPrecioVentaProducto;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public JButton getButActualizar() {
		return butActualizar;
	}

	public JButton getButEliminar() {
		return butEliminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setLabCodigoProducto(JLabel labCodigoProducto) {
		this.labCodigoProducto = labCodigoProducto;
	}

	public void setTxtCodigoProducto(JTextField txtCodigoProducto) {
		this.txtCodigoProducto = txtCodigoProducto;
	}

	public void setLabNombreProducto(JLabel labNombreProducto) {
		this.labNombreProducto = labNombreProducto;
	}

	public void setTxtNombreProducto(JTextField txtNombreProducto) {
		this.txtNombreProducto = txtNombreProducto;
	}

	public void setLabNitProveedorDeProducto(JLabel labNitProveedorDeProducto) {
		this.labNitProveedorDeProducto = labNitProveedorDeProducto;
	}

	public void setTxtNitProveedorDeProducto(JTextField txtNitProveedorDeProducto) {
		this.txtNitProveedorDeProducto = txtNitProveedorDeProducto;
	}

	public void setLabPrecioCompraProducto(JLabel labPrecioCompraProducto) {
		this.labPrecioCompraProducto = labPrecioCompraProducto;
	}

	public void setTxtPrecioCompraProducto(JTextField txtPrecioCompraProducto) {
		this.txtPrecioCompraProducto = txtPrecioCompraProducto;
	}

	public void setLabPrecioVentaProducto(JLabel labPrecioVentaProducto) {
		this.labPrecioVentaProducto = labPrecioVentaProducto;
	}

	public void setTxtPrecioVentaProducto(JTextField txtPrecioVentaProducto) {
		this.txtPrecioVentaProducto = txtPrecioVentaProducto;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}

	public void setButActualizar(JButton butActualizar) {
		this.butActualizar = butActualizar;
	}

	public void setButEliminar(JButton butEliminar) {
		this.butEliminar = butEliminar;
	}

	
	
}
