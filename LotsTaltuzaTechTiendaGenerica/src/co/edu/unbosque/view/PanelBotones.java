package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelBotones extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JButton butJugador;
	private JButton butJuego;
	private JButton butPartida;
	private JLabel labTitulo1, labTitulo2;
	public static final String JUGADOR = "Jugador";
	public static final String JUEGO = "Juego";
	public static final String PARTIDA = "Partida";

	public PanelBotones() {
		setLayout( new GridLayout(5,1) );
		labTitulo1 = new JLabel("LOTS TALTUZA TECH", SwingConstants.CENTER);
		labTitulo1.setFont((new Font("Bahnschrift",Font.BOLD,20)));
		add(labTitulo1);
		butJugador = new JButton("Jugador");
		butJugador.setActionCommand(JUGADOR);
		add(butJugador);
		butJuego = new JButton("Juego");
		butJuego.setActionCommand(JUEGO);
		add(butJuego);
		butPartida = new JButton("Partida");
		butPartida.setActionCommand(PARTIDA);
		add(butPartida);
		labTitulo2 = new JLabel("");
		add(labTitulo2);
	}

	public JButton getButJugador() {
		return butJugador;
	}

	public void setButJugador(JButton butJugador) {
		this.butJugador = butJugador;
	}

	public JButton getButJuego() {
		return butJuego;
	}

	public void setButJuego(JButton butJuego) {
		this.butJuego = butJuego;
	}

	public JButton getButPartida() {
		return butPartida;
	}

	public void setButPartida(JButton butPartida) {
		this.butPartida = butPartida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getJugador() {
		return JUGADOR;
	}

	public static String getJuego() {
		return JUEGO;
	}

	public static String getPartida() {
		return PARTIDA;
	}
	
}
