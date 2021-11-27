package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class PanelBuscar extends JPanel{


	private static final long serialVersionUID = 1L;
	private JLabel labBuscar;
	private JTextField txtBuscar;
	private JButton butBuscar;

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

		butBuscar = new JButton("Buscar");
		butBuscar .setActionCommand("BUSCARPANEL");
		add(butBuscar);
		
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

	public JButton getButBuscar() {
		return butBuscar ;
	}

	public void setButBuscar(JButton butBuscar) {
		this.butBuscar = butBuscar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
