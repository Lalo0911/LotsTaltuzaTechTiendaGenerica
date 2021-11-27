package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller {

	private View gui;
	private Fachada tienda;

	public Controller() {
		gui= new View();
		tienda = new Fachada();
		funcionar();
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
			tienda.getbF().escribirArchivoClientes(tienda.getClientesDAO().getClientes());
			System.out.println(tienda.getClientesDAO().leerCliente());

	}

}
