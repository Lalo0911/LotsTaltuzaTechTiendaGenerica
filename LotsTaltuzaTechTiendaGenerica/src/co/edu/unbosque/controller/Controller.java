package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller {


	private View gui;
	private Fachada tienda;

	public Controller() {
	
		gui= new View(this);
		gui.setVisible(true);
		tienda = new Fachada();
		funcionar();
		asignarOyentes();
		
	}

	public void funcionar()
	{
		tienda.getProp().escribirPropiedades();	

			tienda.getClientesDTO().setCedula(1000579928);
			tienda.getClientesDTO().setNombre("Santiago");
			tienda.getClientesDTO().setDireccion("cll 10");
			tienda.getClientesDTO().setTelefono(32145657);
			tienda.getClientesDTO().setCiudad("Bog");
			tienda.getClientesDAO().agregarCliente(tienda.getClientesDTO(),0);
			tienda.getClientesDTO().setCedula(12345);
			tienda.getClientesDTO().setNombre("Lalo");
			tienda.getClientesDTO().setDireccion("frd r");
			tienda.getClientesDTO().setTelefono(5645);
			tienda.getClientesDTO().setCiudad("laNalga");
			tienda.getClientesDAO().agregarCliente(tienda.getClientesDTO(),0);
			tienda.getbF().escribirArchivoClientes(tienda.getClientesDAO().getClientes());
			//System.out.println(tienda.getClientesDAO().leerCliente());
			
			tienda.getClientesDAO().eliminarCliente(12345);
		//	tienda.getClientesDAO().actualizarCliente(12345, 9876, "Nelson", "ElMangoFeliz", 45, null);
			System.out.println(tienda.getClientesDAO().leerCliente());

	}
	
	public void asignarOyentes() 
	{
	//	gui.getPanelBotones().getButJugador().addActionListener(this);
		
	}

}
