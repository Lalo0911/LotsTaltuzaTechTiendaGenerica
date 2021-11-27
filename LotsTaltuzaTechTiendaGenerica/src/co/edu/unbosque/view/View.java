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
	private PanelClientes panelClientes; 
	private PanelBuscar panelBuscar;
	private PanelResultados panelResultados; 
	private PanelProductos panelProductos;
	private PanelProveedores panelProveedores;
	private PanelBotones panelBotones;
	private PanelBotones2 panelBotones2;
	private PanelVentas panelVentas;
	private PanelResultados2 panelResultados2;	
	
	public View(Controller control) {
		
		setSize(700,700);
		setResizable(false); 
		setTitle("Lots Taltuza Tech"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		setLayout( new BorderLayout() );
		panelClientes = new PanelClientes();
		panelBotones = new PanelBotones();
		panelBuscar = new PanelBuscar();
		
		
		add(panelBotones,BorderLayout.CENTER);
		panelProductos = new PanelProductos();
		panelBotones2 = new PanelBotones2();
		panelVentas = new PanelVentas();
		
		add(panelBotones2,BorderLayout.NORTH);
		panelProveedores = new PanelProveedores();
		panelResultados = new PanelResultados();
		panelResultados2 = new PanelResultados2();
		panelBotones2.setVisible(false);
		panelResultados.setVisible(false);
		panelResultados2.setVisible(false);
		
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
		return panelClientes;
	}

	public void setPanelEntrada(PanelClientes panelJugador) {
		this.panelClientes = panelJugador;
	}

	public PanelProductos getPanelRegistro() {
		return panelProductos;
	}

	public void setPanelRegistro(PanelProductos panelJuego) {
		this.panelProductos = panelJuego;
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
		return panelClientes;
	}

	public void setPanelJugador(PanelClientes panelJugador) {
		this.panelClientes = panelJugador;
	}

	public PanelProductos getPanelJuego() {
		return panelProductos;
	}

	public void setPanelJuego(PanelProductos panelJuego) {
		this.panelProductos = panelJuego;
	}

	public PanelProveedores getPanelPartida() {
		return panelProveedores;
	}

	public void setPanelPartida(PanelProveedores panelPartida) {
		this.panelProveedores = panelPartida;
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

	public PanelVentas getPanelVentas() {
		return panelVentas;
	}

	public void setPanelVentas(PanelVentas panelVentas) {
		this.panelVentas = panelVentas;
	}

	public PanelResultados2 getPanelResultados2() {
		return panelResultados2;
	}

	public void setPanelResultados2(PanelResultados2 panelResultados2) {
		this.panelResultados2 = panelResultados2;
	}	
	
}
