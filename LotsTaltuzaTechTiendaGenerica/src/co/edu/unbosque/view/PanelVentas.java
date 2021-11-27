package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelVentas extends JPanel{

	private static final long serialVersionUID = 1L;
	public static final String AGREGARCLIENTE = "AgregarCliente";
	public static final String LEERCLIENTE = "LeerCliente";
	public static final String ACTUALIZARCLIENTE = "ActualizarCliente";
	public static final String BORRARCLIENTE = "BorrarCliente";

	
	
	public PanelVentas() {
		setLayout( new GridLayout(9,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
	}
	
	
	
}
