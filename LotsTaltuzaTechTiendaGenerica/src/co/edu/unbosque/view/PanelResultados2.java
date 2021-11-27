package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class PanelResultados2 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private DefaultTableModel mod1;
    private JTable tabla1;
    private JScrollPane scroll1;
    
    private JLabel iva;
    private JLabel sinIva;
    private JLabel total;
	

	public PanelResultados2() {


		
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
			
		
		
		setLayout(new MigLayout("", "[grow]", "[319.00][][][]"));
		mod1 = new DefaultTableModel(new String[]{"Cod", "Nombre", "Cantidad", "Precio Unit", "Precio Total"}, 0);
		tabla1 = new JTable(mod1);
		scroll1 = new JScrollPane(tabla1);
        tabla1.setEnabled(false);
        //tabla1.setFont(font);
        tabla1.getTableHeader().setReorderingAllowed(false);
        tabla1.getTableHeader().setResizingAllowed(false);
        
        
		tabla1.getColumnModel().getColumn(0).setPreferredWidth(10);
		 
		
	      // scroll1.setFont(font);
	       // scroll1.setBounds(25, 100, 380, 350
		add(scroll1, "cell 0 0,grow");
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, "cell 0 1,alignx right");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1, "cell 0 2,alignx right");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		add(lblNewLabel_2, "cell 0 3,alignx right");

		
	}




	
}
