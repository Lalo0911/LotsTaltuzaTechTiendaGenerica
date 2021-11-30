package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelClientes extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel labCedula;
	private JTextField txtCedula;
	
	private JLabel labNombre;
	private JTextField txtNombre;
	
	private JLabel labDireccion;
	private JTextField txtDireccion;
	
	private JLabel labTelefono;
	private JTextField txtTelefono;
	
	private JLabel labCorreo;
	private JTextField txtCorreo;
	
	
	private JLabel labVacio1;
	private JLabel labVacio2;
	
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butActualizar;
	private JButton butEliminar;

	public PanelClientes() {
		
		setLayout( new GridLayout(9,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Cliente");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labCedula = new JLabel("Cedula:");
		add(labCedula);
		
		txtCedula = new JTextField();
		txtCedula.setForeground(Color.BLACK);
		txtCedula.setBackground(Color.WHITE);
		add(txtCedula);
		
		labNombre = new JLabel("Nombre:");
		add(labNombre);
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		add(txtNombre);
		
		labDireccion = new JLabel("Direccion:");
		add(labDireccion);
		
		txtDireccion = new JTextField("");
		txtDireccion.setForeground(Color.BLACK);
		txtDireccion.setBackground(Color.WHITE);
		add(txtDireccion);
		
		labTelefono = new JLabel("Telefono:");
		add(labTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setBackground(Color.WHITE);
		add(txtTelefono);
		
		labCorreo = new JLabel("Correo:");
		add(labCorreo);
		
		txtCorreo = new JTextField("");
		txtCorreo.setForeground(Color.BLACK);
		txtCorreo.setBackground(Color.WHITE);
		add(txtCorreo);
		
		labVacio1 = new JLabel("");
		add(labVacio1);
		
		labVacio2 = new JLabel("");
		add(labVacio2);
		
		butEscribir = new JButton("Escribir Cliente");
		butEscribir.setActionCommand("AGREGARCLIENTE");
		add(butEscribir);
		
		butLeer = new JButton("Leer Cliente");
		butLeer.setActionCommand("LEERCLIENTE");
		add(butLeer);
		
		butActualizar = new JButton("Actualizar Cliente");
		butActualizar.setActionCommand("ACTUALIZARCLIENTE");
		add(butActualizar);
		
		butEliminar = new JButton("Borrar Cliente");
		butEliminar.setActionCommand("BORRARCLIENTE");
		add(butEliminar);
		
		
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLabCedula() {
		return labCedula;
	}



	public JTextField getTxtCedula() {
		return txtCedula;
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



	public JLabel getLabCorreo() {
		return labCorreo;
	}



	public JTextField getTxtCorreo() {
		return txtCorreo;
	}


	public JLabel getLabVacio1() {
		return labVacio1;
	}



	public JLabel getLabVacio2() {
		return labVacio2;
	}



	public JButton getButLeer() {
		return butLeer;
	}



	public JButton getButEscribir() {
		return butEscribir;
	}



	public void setLabCedula(JLabel labCedula) {
		this.labCedula = labCedula;
	}



	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
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



	public void setLabCorreo(JLabel labCorreo) {
		this.labCorreo = labCorreo;
	}



	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}


	public void setLabVacio1(JLabel labVacio1) {
		this.labVacio1 = labVacio1;
	}



	public void setLabVacio2(JLabel labVacio2) {
		this.labVacio2 = labVacio2;
	}



	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}



	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}

	public JButton getButActualizar() {
		return butActualizar;
	}



	public JButton getButEliminar() {
		return butEliminar;
	}



	public void setButActualizar(JButton butActualizar) {
		this.butActualizar = butActualizar;
	}



	public void setButEliminar(JButton butEliminar) {
		this.butEliminar = butEliminar;
	}
	

}
