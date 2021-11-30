package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelProveedores extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JLabel labNit;
	private JTextField txtNit;
	
	private JLabel labNombre;
	private JTextField txtNombre;
	
	private JLabel labDireccion;
	private JTextField txtDireccion;
	
	private JLabel labTelefono;
	private JTextField txtTelefono;
	
	private JLabel labCiudad;
	private JTextField txtCiudad;
	
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butActualizar;
	private JButton butEliminar;
	
	public PanelProveedores() {
		setLayout( new GridLayout(8,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Proveedores");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labNit = new JLabel("Nit");
		add(labNit);
		
		txtNit= new JTextField("");
		txtNit.setForeground(Color.BLACK);
		txtNit.setBackground(Color.WHITE);
		add(txtNit);
		
		labNombre = new JLabel("Nombre");
		add(labNombre);
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		add(txtNombre);
		
		labDireccion = new JLabel("Direccion");
		add(labDireccion);
		
		txtDireccion = new JTextField("");
		txtDireccion.setForeground(Color.BLACK);
		txtDireccion.setBackground(Color.WHITE);
		add(txtDireccion);
		
		labTelefono = new JLabel("Telefono");
		add(labTelefono);
		
		txtTelefono = new JTextField("");
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setBackground(Color.WHITE);
		add(txtTelefono);
		
		labCiudad = new JLabel("Ciudad");
		add(labCiudad);
		
		txtCiudad = new JTextField("");
		txtCiudad.setForeground(Color.BLACK);
		txtCiudad.setBackground(Color.WHITE);
		add(txtCiudad);
		
		butEscribir = new JButton("Escribir Proveedor");
		butEscribir.setActionCommand("AGREGARPROVEEDOR");
		add(butEscribir);
		
		butLeer = new JButton("Leer Proveedor");
		butLeer.setActionCommand("LEERPROVEEDOR");
		add(butLeer);
		
		butActualizar = new JButton("Actualizar Proveedor");
		butActualizar.setActionCommand("ACTUALIZARPROVEEDOR");
		add(butActualizar);
		
		butEliminar = new JButton("Borrar Proveedor");
		butEliminar.setActionCommand("BORRARPROVEEDOR");
		add(butEliminar);
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public JLabel getLabNit() {
		return labNit;
	}




	public JTextField getTxtNit() {
		return txtNit;
	}




	public JLabel getLabNombre() {
		return labNombre;
	}




	public JTextField getTxtNombre() {
		return txtNombre;
	}




	public JLabel getLabDireccion() {
		return labDireccion;
	}




	public JTextField getTxtDireccion() {
		return txtDireccion;
	}




	public JLabel getLabTelefono() {
		return labTelefono;
	}




	public JTextField getTxtTelefono() {
		return txtTelefono;
	}




	public JLabel getLabCiudad() {
		return labCiudad;
	}




	public JTextField getTxtCiudad() {
		return txtCiudad;
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




	public void setLabNit(JLabel labNit) {
		this.labNit = labNit;
	}




	public void setTxtNit(JTextField txtNit) {
		this.txtNit = txtNit;
	}




	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}




	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}




	public void setLabDireccion(JLabel labDireccion) {
		this.labDireccion = labDireccion;
	}




	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}




	public void setLabTelefono(JLabel labTelefono) {
		this.labTelefono = labTelefono;
	}




	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}




	public void setLabCiudad(JLabel labCiudad) {
		this.labCiudad = labCiudad;
	}




	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
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
