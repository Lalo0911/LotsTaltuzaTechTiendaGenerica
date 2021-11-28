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
    
    private JLabel lblPrecioSinIva;
    private JLabel lblValorPrecioSinIva;
    private JLabel lblPrecioIva;
    private JLabel lblValorPrecioIva;
    private JLabel lblValorTotal;
    private JLabel lblPrecioValorTotal;

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
		
		lblPrecioSinIva = new JLabel("PRECIO SIN IVA: $");
		add(lblPrecioSinIva, "flowx,cell 0 1,alignx right");
		
		lblPrecioIva = new JLabel("IVA TOTAL: $");
		add(lblPrecioIva, "flowx,cell 0 2,alignx right ");
		
		lblValorTotal = new JLabel("PRECIO TOTAL: $");
		add(lblValorTotal, "flowx,cell 0 3,alignx right");
		
		lblValorPrecioSinIva = new JLabel(" 0");
	//	lblValorPrecioSinIva.setBorder(new );
		add(lblValorPrecioSinIva, "cell 0 1");
		
		lblValorPrecioIva = new JLabel(" 0");
		add(lblValorPrecioIva, "cell 0 2");
		
		lblPrecioValorTotal = new JLabel(" 0");
		add(lblPrecioValorTotal, "cell 0 3");

		
	}

	public DefaultTableModel getMod1() {
		return mod1;
	}

	public void setMod1(DefaultTableModel mod1) {
		this.mod1 = mod1;
	}

	public JTable getTabla1() {
		return tabla1;
	}

	public void setTabla1(JTable tabla1) {
		this.tabla1 = tabla1;
	}

	public JScrollPane getScroll1() {
		return scroll1;
	}

	public void setScroll1(JScrollPane scroll1) {
		this.scroll1 = scroll1;
	}

	public JLabel getLblPrecioSinIva() {
		return lblPrecioSinIva;
	}

	public void setLblPrecioSinIva(JLabel lblPrecioSinIva) {
		this.lblPrecioSinIva = lblPrecioSinIva;
	}

	public JLabel getLblValorPrecioSinIva() {
		return lblValorPrecioSinIva;
	}

	public void setLblValorPrecioSinIva(JLabel lblValorPrecioSinIva) {
		this.lblValorPrecioSinIva = lblValorPrecioSinIva;
	}

	public JLabel getLblPrecioIva() {
		return lblPrecioIva;
	}

	public void setLblPrecioIva(JLabel lblPrecioIva) {
		this.lblPrecioIva = lblPrecioIva;
	}

	public JLabel getLblValorPrecioIva() {
		return lblValorPrecioIva;
	}

	public void setLblValorPrecioIva(JLabel lblValorPrecioIva) {
		this.lblValorPrecioIva = lblValorPrecioIva;
	}

	public JLabel getLblValorTotal() {
		return lblValorTotal;
	}

	public void setLblValorTotal(JLabel lblValorTotal) {
		this.lblValorTotal = lblValorTotal;
	}

	public JLabel getLblPrecioValorTotal() {
		return lblPrecioValorTotal;
	}

	public void setLblPrecioValorTotal(JLabel lblPrecioValorTotal) {
		this.lblPrecioValorTotal = lblPrecioValorTotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
