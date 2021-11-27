package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class PanelBuscar extends JPanel{


	private static final long serialVersionUID = 1L;
	public static final String BUSCAR = "BuscarJugador";
	private JLabel labBuscar;
	private JTextField txtBuscar;
	private JButton butAgregar;

	public PanelBuscar() {
		setLayout( new GridLayout(4,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Buscar Jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labBuscar = new JLabel("Documento:");
		add(labBuscar);

		txtBuscar = new JTextField("");
		txtBuscar.setForeground(Color.BLACK);
		txtBuscar.setBackground(Color.WHITE);
		add(txtBuscar);

		butAgregar = new JButton("Buscar Jugador");
		butAgregar.setActionCommand(BUSCAR);
		add(butAgregar);
		
	}

	public JLabel getLabBuscar() {
		return labBuscar;
	}

	public void setLabBuscar(JLabel labBuscar) {
		this.labBuscar = labBuscar;
	}

	public JTextField getTxtBuscar() {
		return txtBuscar;
	}

	public void setTxtBuscar(JTextField txtBuscar) {
		this.txtBuscar = txtBuscar;
	}

	public JButton getButAgregar() {
		return butAgregar;
	}

	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getBuscar() {
		return BUSCAR;
	}
	
}
