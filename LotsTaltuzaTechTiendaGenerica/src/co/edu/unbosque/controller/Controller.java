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
		gui.getPanelBotones().getButEditarProperties().addActionListener(this);
		
		
		gui.getPanelProductos().getButEscribir().addActionListener(this);
		gui.getPanelProductos().getButLeer().addActionListener(this);
		gui.getPanelProductos().getButActualizar().addActionListener(this);
		gui.getPanelProductos().getButEliminar().addActionListener(this);

		gui.getPanelProveedores().getButEscribir().addActionListener(this);
		gui.getPanelProveedores().getButLeer().addActionListener(this);
		gui.getPanelProveedores().getButActualizar().addActionListener(this);
		gui.getPanelProveedores().getButEliminar().addActionListener(this);

		gui.getPanelClientes().getButEscribir().addActionListener(this);
		gui.getPanelClientes().getButLeer().addActionListener(this);
		gui.getPanelClientes().getButActualizar().addActionListener(this);
		gui.getPanelClientes().getButEliminar().addActionListener(this);
		
		gui.getPanelBotones2().getButRegresar().addActionListener(this);
		gui.getPanelBotones2().getButBuscar().addActionListener(this);
		
		gui.getPanelBuscar().getButBuscar().addActionListener(this);
		
		gui.getPanelVentas().getBtnAgregarProd().addActionListener(this);
		gui.getPanelVentas().getBtnBuscarProd().addActionListener(this);
			
		gui.getPanelPropiedades().getButEditar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento){ 
	
	String cedula = null;	
		
		if(evento.getActionCommand().equals("EDITARPROPIEDADES")) {
			gui.get
		}
	
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
		
		if(evento.getActionCommand().equals("EDITAR"))
		{
			
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setVisible(false);
			gui.getContentPane().add(gui.getPanelPropiedades(),BorderLayout.CENTER);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelPropiedades().setVisible(true);
			
			
		}
		
		if (evento.getActionCommand().equals("CLIENTE")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE");
			gui.getContentPane().add(gui.getPanelClientes(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelClientes().setVisible(true);


		}
		if (evento.getActionCommand().equals("PRODUCTOS")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Producto");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARPRODUCTO");
			gui.getContentPane().add(gui.getPanelProductos(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelProductos().setVisible(true);

		}
		if (evento.getActionCommand().equals("PROVEEDORES")) 
		{
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Proveedores");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARPROVEEDORES");
			gui.getPanelBotones2().getButRegresar().setVisible(true);
			gui.getContentPane().add(gui.getPanelProveedores(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelProveedores().setVisible(true);
		}
		
		if(evento.getActionCommand().equals("BUSCARPROVEEDORES"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
		}
		
		if(evento.getActionCommand().equals("BUSCARPRODUCTO"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
		}
		
		if(evento.getActionCommand().equals("LEERCLIENTE"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().leer());
			
		}
		
		if(evento.getActionCommand().equals("AGREGARCLIENTE")){
			
			fachada.getClientesDTO().setCedula(gui.getPanelClientes().getTxtCedula().getText());
			fachada.getClientesDTO().setDireccion(gui.getPanelClientes().getTxtDireccion().getText());
			fachada.getClientesDTO().setTelefono(gui.getPanelClientes().getTxtTelefono().getText());
			fachada.getClientesDTO().setNombre(gui.getPanelClientes().getTxtNombre().getText());
			fachada.getClientesDTO().setCorreo(gui.getPanelClientes().getTxtCorreo().getText());
			fachada.getClientesDAO().agregarCliente(fachada.getClientesDTO(), 0);
			
			gui.getPanelClientes().getTxtCedula().setText("");
			gui.getPanelClientes().getTxtDireccion().setText("");
			gui.getPanelClientes().getTxtTelefono().setText("");
			gui.getPanelClientes().getTxtNombre().setText("");
			gui.getPanelClientes().getTxtCorreo().setText("");
			
		}
		
		if(evento.getActionCommand().equals("BORRARCLIENTE")){
			fachada.getClientesDAO().eliminarCliente(gui.getPanelClientes().getTxtCedula().getText());
			JOptionPane.showMessageDialog(null, "Eliminado con exito");
		}
		
		if(evento.getActionCommand().equals("ACTUALIZARCLIENTE"))
		{
			
			try{
			
			gui.getPanelResultados().getTxtObjeto1().setText("");
			cedula = gui.getPanelClientes().getTxtCedula().getText();
			gui.getPanelClientes().getTxtDireccion().setText(fachada.getClientesDAO().buscarClientes(cedula).getDireccion());
			gui.getPanelClientes().getTxtNombre().setText(fachada.getClientesDAO().buscarClientes(cedula).getNombre());
			gui.getPanelClientes().getTxtTelefono().setText(fachada.getClientesDAO().buscarClientes(cedula).getTelefono());
			gui.getPanelClientes().getTxtCorreo().setText(fachada.getClientesDAO().buscarClientes(cedula).getCorreo());
			
			if(fachada.getClientesDAO().buscarClientes(cedula)!=null){
				
			gui.getPanelClientes().getButActualizar().setActionCommand("ACTUALIZARCLIENTEDOS");
			gui.getPanelClientes().getButEliminar().enable(false);
			gui.getPanelClientes().getButEscribir().enable(false);
			gui.getPanelClientes().getButLeer().enable(false);
			JOptionPane.showMessageDialog(null, "Ahora ingrese valores y oprima de nuevo el boton");
			
			}
			
				
			}
			
			catch(Exception y) {
				JOptionPane.showMessageDialog(null, "Primero debe ingresar una cédula válida en el campo indicado, para\npoder actualizar datos de algún cliente");
			}
	
		}
		
		if(evento.getActionCommand().equals("ACTUALIZARCLIENTEDOS"))
		{
			
			String cedula1 = gui.getPanelClientes().getTxtCedula().getText();
			String direccion = gui.getPanelClientes().getTxtDireccion().getText();
			String telefono = gui.getPanelClientes().getTxtTelefono().getText();
		    String nombre = gui.getPanelClientes().getTxtNombre().getText();
		    String correo = gui.getPanelClientes().getTxtCorreo().getText();
	
	        fachada.getClientesDAO().actualizarCliente(cedula, cedula1, nombre, direccion, telefono, correo);	
	        JOptionPane.showMessageDialog(null, "Actializado con exito");
	  
	        gui.getPanelClientes().getTxtCedula().setText("");
			gui.getPanelClientes().getTxtDireccion().setText("");
			gui.getPanelClientes().getTxtTelefono().setText("");
			gui.getPanelClientes().getTxtNombre().setText("");
			gui.getPanelClientes().getTxtCorreo().setText("");
	        gui.getPanelClientes().getButEliminar().enable(true);
			gui.getPanelClientes().getButEscribir().enable(true);
			gui.getPanelClientes().getButLeer().enable(true);
	        gui.getPanelClientes().getButActualizar().setActionCommand("ACTUALIZARCLIENTE");
		}
		
		if(evento.getActionCommand().equals("BUSCARCLIENTE"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARCLIENTEDOS");
		}
		
		if(evento.getActionCommand().equals("BUSCARCLIENTEDOS"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().buscarClientes(gui.getPanelBuscar().getTxtBuscar().getText()).toString());
		}

		if (evento.getActionCommand().equals("INICIO")) 
		{
			gui.getPanelResultados().setVisible(false);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(true);
			gui.getPanelBuscar().setVisible(false);
			gui.getPanelPropiedades().setVisible(false);
			gui.getPanelResultados2().setVisible(false);
			gui.getPanelVentas().setVisible(false);
			gui.getContentPane().add(gui.getPanelBotones(),BorderLayout.CENTER);
			gui.getPanelBotones2().setVisible(false);
			gui.getPanelResultados().getTxtObjeto1().setText("");
			gui.limpiar_texto(gui.getPanelClientes());
			gui.limpiar_texto(gui.getPanelProveedores());
			gui.limpiar_texto(gui.getPanelProductos());
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