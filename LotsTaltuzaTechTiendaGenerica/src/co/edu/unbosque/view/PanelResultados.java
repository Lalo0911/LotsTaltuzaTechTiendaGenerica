package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class PanelResultados extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtObjeto1;
	private JScrollPane sp; 
	
	public PanelResultados() {
		
		
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("Listado de Resultados Juego");
		
		txtObjeto1 = new JTextArea("");
		txtObjeto1.setForeground(Color.BLACK);
		txtObjeto1.setOpaque(false);
		txtObjeto1.setEditable(false);
		txtObjeto1.setPreferredSize(new Dimension(650,250));

		add(txtObjeto1);
	}


	public JLabel getLabResultado() {
		return labResultado;
	}


	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}


	public JTextArea getTxtObjeto1() {
		return txtObjeto1;
	}


	public void setTxtObjeto1(JTextArea txtObjeto1) {
		this.txtObjeto1 = txtObjeto1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public JScrollPane getSp() {
		return sp;
	}


	public void setSp(JScrollPane sp) {
		this.sp = sp;
	}

}
