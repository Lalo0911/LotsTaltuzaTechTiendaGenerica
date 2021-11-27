package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;


public class View extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private PanelClientes panelJugador; 
	private PanelBuscar panelBuscar;
	private PanelResultados panelResultados; 
	private PanelProductos panelJuego;
	private PanelPartida panelPartida;
	private PanelBotones panelBotones;
	private PanelBotones2 panelBotones2;
	
	public View(Controller control) {
		
		setSize(700,500); 
		setResizable(false); 
		setTitle("Lots Taltuza Tech"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout( new BorderLayout() );
		panelJugador = new PanelClientes();
		panelBotones = new PanelBotones();
		panelBuscar = new PanelBuscar();
		
		add(panelBotones,BorderLayout.CENTER);
		panelJuego = new PanelProductos();
		panelBotones2 = new PanelBotones2();
		
		add(panelBotones2,BorderLayout.NORTH);
		panelPartida = new PanelPartida();
		panelResultados = new PanelResultados();
		panelBotones2.setVisible(false);
		panelResultados.setVisible(false);
		
		panelBuscar = new PanelBuscar();
		panelBuscar.setVisible(false);
		
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


	public PanelClientes getPanelEntrada() {
		return panelJugador;
	}

	public void setPanelEntrada(PanelClientes panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelProductos getPanelRegistro() {
		return panelJuego;
	}

	public void setPanelRegistro(PanelProductos panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Sistema", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public PanelClientes getPanelJugador() {
		return panelJugador;
	}

	public void setPanelJugador(PanelClientes panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelProductos getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelProductos panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelPartida getPanelPartida() {
		return panelPartida;
	}

	public void setPanelPartida(PanelPartida panelPartida) {
		this.panelPartida = panelPartida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelBotones2 getPanelBotones2() {
		return panelBotones2;
	}

	public void setPanelBotones2(PanelBotones2 panelBotones2) {
		this.panelBotones2 = panelBotones2;
	}

	public PanelBuscar getPanelBuscar() {
		return panelBuscar;
	}

	public void setPanelBuscar(PanelBuscar panelBuscar) {
		this.panelBuscar = panelBuscar;
	}	
	
}
