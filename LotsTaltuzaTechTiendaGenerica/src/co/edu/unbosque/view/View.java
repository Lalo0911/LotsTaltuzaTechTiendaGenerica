package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	
	public View(Controller control) {
		setSize(700,500); 
		setResizable(false); 
		setTitle("Lots Taltuza Tech"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( new BorderLayout() );
		
	}
	
	    public void limpiar_texto(JPanel panel){
	        for(int i = 0; panel.getComponents().length > i; i++){
	            if(panel.getComponents()[i] instanceof JTextField){
	                ((JTextField)panel.getComponents()[i]).setText("");
	            }
	            else if(panel.getComponents()[i] instanceof JPasswordField){
	                ((JPasswordField)panel.getComponents()[i]).setText("");
	            }
	        }
	    }


}
 