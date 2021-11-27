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

		gui.getPanelPartida().getButAgregar().addActionListener(this);
		gui.getPanelPartida().getButLeer().addActionListener(this);

		gui.getPanelJugador().getButLeer().addActionListener(this);
		gui.getPanelJugador().getButEscribir().addActionListener(this);
		
		gui.getPanelBotones2().getButRegresar().addActionListener(this);
		gui.getPanelBotones2().getButBuscar().addActionListener(this);
		
		gui.getPanelBuscar().getButAgregar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) 
	{
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
		//Juego
		if (evento.getActionCommand().equals(gui.getPanelJuego().LEERPRODUCTO)) 
		{
			//gui.getPanelResultados().getTxtObjeto1().setText(fachada.getJuegoDAO().leerJuego());
		}
		if (evento.getActionCommand().equals(gui.getPanelJuego().AGREGARPRODUCTO)) 
		{    
			//fachada.getJuegoDTO().setNombre(gui.getPanelJuego().getTxtNombreJuego().getText());
			//fachada.getJuegoDTO().setTipo(gui.getPanelJuego().getTxtTipoJuego().getText());
			//fachada.getJuegoDAO().agregarJuego(fachada.getJuegoDTO());
			//fachada.getB_file().escribirArchivoJuego(fachada.getJuegoDAO().getJuego());
		}

		//Jugador

		if (evento.getActionCommand().equals("LEERCLIENTE")) 
		{
			//gui.getPanelResultados().getTxtObjeto1().setText(fachada.getJugadorDAO().leerJugador());

		}
		if (evento.getActionCommand().equals("AGREGARCLIENTE")) 
		{		
			//fachada.getJugadorDTO().setGenero(gui.getPanelJugador().getTxtGenero().getText());
			//fachada.getJugadorDTO().setDocumento(Integer.parseInt(gui.getPanelJugador().getTxtDocumento().getText()));
			//fachada.getJugadorDTO().setNombre(gui.getPanelJugador().getTxtNombre().getText());
			//fachada.getJugadorDTO().setEdad(Integer.parseInt(gui.getPanelJugador().getTxtEdad().getText()));
			//fachada.getJugadorDTO().setPuntaje(Double.parseDouble(gui.getPanelJugador().getTxtPuntaje().getText()));
			//fachada.getJugadorDAO().agregarJugador(fachada.getJugadorDTO());
			//fachada.getB_file().escribirArchivoJugador(fachada.getJugadorDAO().getJugador());
		}
		
		if(evento.getActionCommand().equals("LEERPARTIDA")) {
			//gui.getPanelResultados().getTxtObjeto1().setText(fachada.getPartidaDAO().leerPartida());
		}

		if(evento.getActionCommand().equals("AGREGARPARTIDA")) {
			//fachada.getPartidaDTO().setJugador1(gui.getPanelPartida().getTxtJugador1().getText());
			//fachada.getPartidaDTO().setJugador2(gui.getPanelPartida().getTxtJugador2().getText());
			//fachada.getPartidaDTO().setPuntaje1(gui.getPanelPartida().getTxtPuntaje1().getText());
			//fachada.getPartidaDTO().setPuntaje2(gui.getPanelPartida().getTxtPuntaje2().getText());
			//fachada.getPartidaDTO().setTipoPartida(gui.getPanelPartida().getTxtTipoPartida().getText());
			//fachada.getPartidaDAO().agregarPartida(fachada.getPartidaDTO());
			//fachada.getB_file().escribirArchivoPartida(fachada.getPartidaDAO().getPartida());
			
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