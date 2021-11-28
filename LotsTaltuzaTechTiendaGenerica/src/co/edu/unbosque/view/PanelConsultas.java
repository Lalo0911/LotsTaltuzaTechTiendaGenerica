package co.edu.unbosque.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelConsultas extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitulo;
	private JButton btnConsultaClientes;
	private JButton btnConsultaProveedores;
	
	public PanelConsultas() {
		setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][]"));

		lblTitulo = new JLabel("CONSULTAS :D");
		add(lblTitulo, "cell 3 0 5 3,alignx center");

		btnConsultaClientes = new JButton("Consulta Clientes");
		btnConsultaClientes.setActionCommand("CONSULTACLIENTES");
		add(btnConsultaClientes, "cell 3 5");

		 btnConsultaProveedores = new JButton("Consulta Proveedores");
		 btnConsultaClientes.setActionCommand("CONSULTAPROVEEDORES");
		add(btnConsultaProveedores, "cell 7 5");

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

}
