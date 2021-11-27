package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener{

	private Fachada fachada;
	private View gui;

	public Controller() 

	{

		fachada = new Fachada();
		gui = new View(this);
		gui.setVisible(true);
		asignarOyentes();
	}

	public void asignarOyentes() 
	{
		gui.getPanelBotones().getButClientes().addActionListener(this);
		gui.getPanelBotones().getButProductos().addActionListener(this);
		gui.getPanelBotones().getButVentas().addActionListener(this);
		gui.getPanelBotones().getButProveedores().addActionListener(this);
		
		
		gui.getPanelJuego().getButEscribir().addActionListener(this);
		gui.getPanelJuego().getButLeer().addActionListener(this);
		gui.getPanelJuego().getButActualizar().addActionListener(this);
		gui.getPanelJuego().getButEliminar().addActionListener(this);

		gui.getPanelPartida().getButEscribir().addActionListener(this);
		gui.getPanelPartida().getButLeer().addActionListener(this);
		gui.getPanelPartida().getButActualizar().addActionListener(this);
		gui.getPanelPartida().getButEliminar().addActionListener(this);

		gui.getPanelJugador().getButEscribir().addActionListener(this);
		gui.getPanelJugador().getButLeer().addActionListener(this);
		gui.getPanelJugador().getButActualizar().addActionListener(this);
		gui.getPanelJugador().getButEliminar().addActionListener(this);
		
		gui.getPanelBotones2().getButRegresar().addActionListener(this);
		gui.getPanelBotones2().getButBuscar().addActionListener(this);
		
		gui.getPanelBuscar().getButBuscar().addActionListener(this);
			
	}

	public void actionPerformed(ActionEvent evento){ 
	
	long cedula = 0;	
		
		if(evento.getActionCommand().equals("VENTAS"))
		{
			
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE");
			gui.getContentPane().add(gui.getPanelVentas(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados2(),BorderLayout.SOUTH);
			gui.getPanelVentas().setVisible(true);
			gui.getPanelResultados2().setVisible(true);
			
			
		}
		
		if (evento.getActionCommand().equals("CLIENTE")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE");
			gui.getContentPane().add(gui.getPanelJugador(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelJugador().setVisible(true);


		}
		if (evento.getActionCommand().equals("PRODUCTOS")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Producto");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARPRODUCTO");
			gui.getContentPane().add(gui.getPanelJuego(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelJuego().setVisible(true);

		}
		if (evento.getActionCommand().equals("PROVEEDORES")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Proveedores");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARPROVEEDORES");
			gui.getPanelBotones2().getButRegresar().setVisible(true);
			gui.getContentPane().add(gui.getPanelPartida(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelPartida().setVisible(true);
		}
		
		if(evento.getActionCommand().equals("BUSCARPROVEEDORES"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
		}
		
		if(evento.getActionCommand().equals("BUSCARPRODUCTO"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
		}
		
		if(evento.getActionCommand().equals("LEERCLIENTE"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().leerCliente());
			
		}
		
		if(evento.getActionCommand().equals("AGREGARCLIENTE")){
			
			fachada.getClientesDTO().setCedula(Long.parseLong(gui.getPanelJugador().getTxtCedula().getText()));
			fachada.getClientesDTO().setDireccion(gui.getPanelJugador().getTxtDireccion().getText());
			fachada.getClientesDTO().setTelefono(Integer.parseInt(gui.getPanelJugador().getTxtTelefono().getText()));
			fachada.getClientesDTO().setNombre(gui.getPanelJugador().getTxtNombre().getText());
			fachada.getClientesDTO().setCorreo(gui.getPanelJugador().getTxtCorreo().getText());
			fachada.getClientesDAO().agregarCliente(fachada.getClientesDTO(), 0);
			
			gui.getPanelJugador().getTxtCedula().setText("");
			gui.getPanelJugador().getTxtDireccion().setText("");
			gui.getPanelJugador().getTxtTelefono().setText("");
			gui.getPanelJugador().getTxtNombre().setText("");
			gui.getPanelJugador().getTxtCorreo().setText("");
			
		}
		
		if(evento.getActionCommand().equals("ACTUALIZARCLIENTE"))
		{
			
			try{
			
			cedula = Long.parseLong(gui.getPanelJugador().getTxtCedula().getText());
			gui.getPanelJugador().getTxtDireccion().setText(fachada.getClientesDAO().buscarClientes(cedula).getDireccion());
			gui.getPanelJugador().getTxtNombre().setText(fachada.getClientesDAO().buscarClientes(cedula).getNombre());
			gui.getPanelJugador().getTxtTelefono().setText(String.valueOf(fachada.getClientesDAO().buscarClientes(cedula).getTelefono()));
			
			gui.getPanelJugador().getButActualizar().setActionCommand("ACTUALIZARCLIENTEDOS");
			gui.getPanelJugador().getButEliminar().enable(false);
			gui.getPanelJugador().getButEscribir().enable(false);
			gui.getPanelJugador().getButLeer().enable(false);
			JOptionPane.showMessageDialog(null, "Ahora ingrese valores y oprima de nuevo el boton");
				
			}
			
			catch(Exception y) {
				JOptionPane.showMessageDialog(null, "Primero debe ingresar una cédula válida en el campo indicado, para\npoder actualizar datos de algún cliente");
			}
	
		}
		
		if(evento.getActionCommand().equals("ACTUALIZARCLIENTEDOS"))
		{
			
			long cedula1 = Long.parseLong(gui.getPanelJugador().getTxtCedula().getText());
			String direccion = gui.getPanelJugador().getTxtDireccion().getText();
			int telefono = Integer.parseInt(gui.getPanelJugador().getTxtTelefono().getText());
		    String nombre = gui.getPanelJugador().getTxtNombre().getText();
		    String correo = gui.getPanelJugador().getTxtCorreo().getText();
	
	        fachada.getClientesDAO().actualizarCliente(cedula, cedula1, nombre, direccion, telefono,correo);	
	        JOptionPane.showMessageDialog(null, "Actializado con exito");
	        
	        gui.getPanelJugador().getTxtCedula().setText("");
			gui.getPanelJugador().getTxtDireccion().setText("");
			gui.getPanelJugador().getTxtTelefono().setText("");
			gui.getPanelJugador().getTxtNombre().setText("");
	        gui.getPanelJugador().getButEliminar().enable(true);
			gui.getPanelJugador().getButEscribir().enable(true);
			gui.getPanelJugador().getButLeer().enable(true);
	        gui.getPanelJugador().getButActualizar().setActionCommand("ACTUALIZARCLIENTE");
		}
		
		if(evento.getActionCommand().equals("BUSCARCLIENTE"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARCLIENTEDOS");
		}
		
		if(evento.getActionCommand().equals("BUSCARCLIENTEDOS"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().buscarClientes(Long.parseLong(gui.getPanelBuscar().getTxtBuscar().getText())).toString());
		}

		if (evento.getActionCommand().equals("INICIO")) 
		{
			gui.getPanelResultados().setVisible(false);
			gui.getPanelPartida().setVisible(false);
			gui.getPanelJugador().setVisible(false);
			gui.getPanelJuego().setVisible(false);
			gui.getPanelBotones().setVisible(true);
			gui.getPanelBuscar().setVisible(false);
			gui.getContentPane().add(gui.getPanelBotones(),BorderLayout.CENTER);
			gui.getPanelBotones2().setVisible(false);
			gui.getPanelResultados().getTxtObjeto1().setText("");
			gui.limpiar_texto(gui.getPanelJugador());
			gui.limpiar_texto(gui.getPanelPartida());
			gui.limpiar_texto(gui.getPanelJuego());
			gui.limpiar_texto(gui.getPanelBuscar());
		}
		
		
		/*if (evento.getActionCommand().equals("BUSCAR")) 
		{			
			
					
				if(fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText()))!=null) {
					
			gui.getPanelResultados().getTxtObjeto1().setText(	
			"Documento: "+fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText())).getDocumento()+"\n"+
			"Nombre: "+fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText())).getNombre()+"\n"+
			"Edad: "+fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText())).getEdad()+"\n"+
			"Genero: "+fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText())).getGenero()+"\n"+
			"Puntaje: "+fachada.getJugadorDAO().buscarJugador(Integer.parseInt(gui.getPanelBuscar().getTxtBuscar().getText())).getPuntaje());
				}
				else {
					JOptionPane.showMessageDialog(null, "El jugador con documento '"+gui.getPanelBuscar().getTxtBuscar().getText()+"' no existe");
				}
				
			
		}*/
		
	}

}