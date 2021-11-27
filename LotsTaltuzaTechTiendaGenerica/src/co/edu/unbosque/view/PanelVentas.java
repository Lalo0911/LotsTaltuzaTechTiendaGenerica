package co.edu.unbosque.view;

import java.awt.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class PanelVentas extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField txfCodProd;
	
	public PanelVentas() {
		
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		setLayout(new MigLayout("", "[88.00][162.00px][205.00px][72.00]", "[][100px][44.00px][31.00px][100px][100px]"));
		
		JLabel lblCliente = new JLabel("Cliente:");
		add(lblCliente, "cell 1 0,alignx right");
		
		JLabel lblNombreCliente = new JLabel("----");
		add(lblNombreCliente, "cell 2 0,alignx center");
		
		JLabel lblNumeroFactura = new JLabel("No. Factura");
		add(lblNumeroFactura, "cell 1 1,alignx right,growy");
		
		JLabel lblIndice_numeroFactura = new JLabel("0");
		add(lblIndice_numeroFactura, "cell 2 1,alignx center,growy");
		
		add(new JLabel(""), "cell 0 2");
		
		JLabel lblCodigoProd = new JLabel("C\u00F3digo del producto");
		add(lblCodigoProd, "cell 1 2,grow");
		
		txfCodProd = new JTextField();
		add(txfCodProd, "cell 2 2,grow");
		txfCodProd.setColumns(10);
		
		JButton btnBuscarProd = new JButton("Buscar Producto");
		add(btnBuscarProd, "cell 2 3,grow");
		
		JLabel label = new JLabel("");
		add(label, "cell 1 4,grow");
		
		JLabel lblNewLabel_3 = new JLabel("\"producto buscado\"  #cantidad   ---$$  ");
		add(lblNewLabel_3, "cell 2 4,grow");
		
		JButton btnAgregarProd = new JButton("Agregar");
		add(btnAgregarProd, "cell 3 4");
		
		JLabel label_1 = new JLabel("");
		add(label_1, "cell 1 5,grow");

	}
	
}
