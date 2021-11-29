package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener{

	private Fachada fachada;
	private View gui;
	private String cedula;
	private String codigoProducto;
	private String nit;
	int valortotalCompra = 0;
	double ivaTotal = 0; 

	public Controller() throws IOException

	{
		fachada = new Fachada();
		gui = new View(this);
		gui.setVisible(true);
		//fachada.rellenar();
		asignarOyentes();
	}

	public void asignarOyentes() 
	{
		gui.getPanelBotones().getButClientes().addActionListener(this);
		gui.getPanelBotones().getButProductos().addActionListener(this);
		gui.getPanelBotones().getButVentas().addActionListener(this);
		gui.getPanelBotones().getButProveedores().addActionListener(this);
		gui.getPanelBotones().getButEditarProperties().addActionListener(this);
		gui.getPanelBotones().getButConsultas().addActionListener(this);

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
		gui.getPanelBuscar().getButSeleccionarCliente().addActionListener(this);

		gui.getPanelVentas().getBtnAgregarProd().addActionListener(this);
		gui.getPanelVentas().getBtnBuscarProd().addActionListener(this);
		gui.getPanelVentas().getBtnTerminarCompra().addActionListener(this);

		gui.getPanelPropiedades().getButEditar().addActionListener(this);

		gui.getPanelConsultas().getBtnConsultaProveedores().addActionListener(this);
		gui.getPanelConsultas().getBtnConsultaClientes().addActionListener(this);
		gui.getPanelConsultas().getBtnConsultaDetalleCliente().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento){ 


		//Modulo 1
		if(evento.getActionCommand().equals("EDITARPROPIEDADES")) {
			String nombreTienda =  gui.getPanelPropiedades().getTxtNombreTienda().getText()+"";
			String TipoComercio =  gui.getPanelPropiedades().getTxtTipoComercio().getText()+"";
			String nit = gui.getPanelPropiedades().getTxtNit().getText()+"";
			String ciudad = gui.getPanelPropiedades().getTxtCiudad().getText()+"";
			String iva = gui.getPanelPropiedades().getTxtValorIva().getText()+"";
			String tasaInteres = gui.getPanelPropiedades().getTxtTasaInteres().getText()+"";
			String nombreBanco = gui.getPanelPropiedades().getTxtNombreBanco().getText()+"";
			String numeroCuenta = gui.getPanelPropiedades().getTxtNumeroCuenta().getText()+"";
			String nombreGerente = gui.getPanelPropiedades().getTxtNombreGerente().getText()+"";
			fachada.getProp().escribirPropiedades(nombreTienda, TipoComercio, nit, ciudad, iva, tasaInteres, nombreBanco, numeroCuenta, nombreGerente);
			gui.mostrarMensajeJOption("Se ha Actualizado con éxito", "Actualización Propiedades", 2);
			gui.limpiar_texto(gui.getPanelPropiedades());
		}

		//Modulo 5
		if(evento.getActionCommand().equals("VENTAS"))
		{

			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE1");
			gui.getContentPane().add(gui.getPanelVentas(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados2(),BorderLayout.SOUTH);
			gui.getPanelVentas().setVisible(true);
			gui.getPanelResultados2().setVisible(true);	
		}

		if(evento.getActionCommand().equals("SELECCIONAR")) {
			String cliente = gui.getPanelResultados().getTxtObjeto1().getText();			
			String[] divisiones = cliente.split("-"); 
			String[] nombreCliente = divisiones[2].split(",");
			String[] cedula_cliente = divisiones[1].split(",");
			gui.getPanelVentas().getLblNombreCliente().setText(nombreCliente[0]+ "-"+ cedula_cliente[0]);

			//regresa al panel ventas
			gui.getPanelResultados().setVisible(false);
			gui.getPanelBuscar().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE1");
			gui.getContentPane().add(gui.getPanelVentas(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados2(),BorderLayout.SOUTH);
			gui.getPanelVentas().setVisible(true);
			gui.getPanelResultados2().setVisible(true);

		}

		if(evento.getActionCommand().equals("BUSCARPRODUCTO_A_AÑADIR"))
		{
			String codProducto = gui.getPanelVentas().getTxfCodProd().getText();

			String precioVenta = fachada.getProductosDAO().buscarProducto(codProducto).getPrecioVentaProducto();

			String nombreProducto = fachada.getProductosDAO().buscarProducto(codProducto).getNombreProducto();

			gui.getPanelVentas().getlblProductoBuscado().setText(nombreProducto+ "  $ "+ precioVenta);

		}

		if(evento.getActionCommand().equals("FINALIZARCOMPRA"))
		{
			//Archivo Venta

			String valorSinIva = gui.getPanelResultados2().getLblValorPrecioSinIva().getText();
			String[] cedula = gui.getPanelVentas().getLblNombreCliente().getText().split("-");
			String archivoVentas = cedula[1];
			String ValorPrecioIva = gui.getPanelResultados2().getLblValorPrecioIva().getText();
			String ValorTotal = gui.getPanelResultados2().getLblPrecioValorTotal().getText();
			int numeroFactura = Integer.parseInt(gui.getPanelVentas().getLblIndice_numeroFactura().getText());
			gui.getPanelVentas().getLblIndice_numeroFactura().setText(numeroFactura+"");

			String rta = 
					"Numero de factura: " + String.valueOf(numeroFactura) + " | " +
							"Cedula: " + cedula[1] + " | " + 
							"Valor sin iva: " + valorSinIva  + " | " +
							"Valor total iva " + ValorPrecioIva  + " | " +
							"Valor total: " + ValorTotal+ "\n";


			//Archivo Detalles de Venta


			String tablaValores="";
			for (int i = 0; i < gui.getPanelResultados2().getTabla1().getRowCount(); i++) {
				for (int j = 0; j < gui.getPanelResultados2().getTabla1().getColumnCount(); j++) {

					if(j==0)
					{
						tablaValores = "No. Factura: " + gui.getPanelVentas().getLblIndice_numeroFactura().getText() +"\n"+tablaValores;
					}

					switch(j) {

					case 0: tablaValores = "Codigo: "+ gui.getPanelResultados2().getTabla1().getValueAt(i, j) + " | "+ tablaValores;  
					break;

					case 1: tablaValores = "Nombre: " + gui.getPanelResultados2().getTabla1().getValueAt(i, j) + " | "+ tablaValores;
					break;

					case 2: tablaValores = "Cantidad: " + gui.getPanelResultados2().getTabla1().getValueAt(i, j) + " | "+ tablaValores;
					break;

					case 3: tablaValores = "Valor unitario: " + gui.getPanelResultados2().getTabla1().getValueAt(i, j)+ " | "+ tablaValores;
					break;

					case 4: tablaValores = "Valor total: " + gui.getPanelResultados2().getTabla1().getValueAt(i, j) +" | "+ tablaValores;
					break;

					case 5:  tablaValores = "Cantidad: " + gui.getPanelResultados2().getTabla1().getValueAt(i, j) +" | "+ tablaValores;
					break;

					}
				}
			}

			//Guarda los datos 


//						
//						fachada.getbF().leerArchivoClientes().get(indiceCliente).setHistorialVentas((fachada.getbF().leerArchivoClientes().get(indiceCliente).getHistorialVentas()+"\n"+rta));
//						fachada.getClientesDAO().getClientes().get(indiceCliente).setDetallerDeVentas((fachada.getClientesDAO().buscarClientes(cedula[1]).getDetallerDeVentas()+"\n"+tablaValores));
//						fachada.getClientesDAO().getClientes().get(indiceCliente).setHistorialVentas((fachada.getClientesDAO().buscarClientes(cedula[1]).getHistorialVentas()+"\n"+rta));
//				
						
			//Actualizar Archivo
			fachada.getClientesDAO().agregarCliente(fachada.getClientesDTO(), 1);

			//fachada.getClientesDAO().buscarClientes(cedula[1]).setDetallerDeVentas((fachada.getClientesDAO().buscarClientes(cedula[1]).getDetallerDeVentas()+"\n"+tablaValores));
			//fachada.getClientesDAO().buscarClientes(cedula[1]).setHistorialVentas((fachada.getClientesDAO().buscarClientes(cedula[1]).getHistorialVentas()+"\n"+rta));

			System.out.println("Historial Ventas: "+fachada.getClientesDAO().buscarClientes(cedula[1]).getHistorialVentas()
					+"\n"+"Detalles Ventas: "+fachada.getClientesDAO().buscarClientes(cedula[1]).getDetallerDeVentas());
            
			
            //actualiza el numero Factura
			numeroFactura = Integer.parseInt(gui.getPanelVentas().getLblIndice_numeroFactura().getText())+1;
			gui.getPanelVentas().getLblIndice_numeroFactura().setText(numeroFactura+"");

			//Borrar valores tabla
			gui.getPanelResultados2().getMod1().setRowCount(0);
			gui.getPanelResultados2().getLblValorPrecioSinIva().setText("");
			gui.getPanelResultados2().getLblValorPrecioIva().setText("");
			gui.getPanelResultados2().getLblPrecioValorTotal().setText("");

			//Mensaje Transacción
			gui.mostrarMensajeJOption("Su transacción ha sido efectuada","Transacción", 1);

		}





		if(evento.getActionCommand().equals("AGREGARPRODUCTO1")) 
		{

			String codProducto = gui.getPanelVentas().getTxfCodProd().getText();

			String nombreProducto = fachada.getProductosDAO().buscarProducto(codProducto).getNombreProducto();

			String cantidad = gui.getPanelVentas().getTxfcantProd().getText();

			String precioUni = fachada.getProductosDAO().buscarProducto(codProducto).getPrecioVentaProducto();

			int valortotal =  Integer.parseInt(precioUni) *  Integer.parseInt(cantidad);
			double iva = Double.parseDouble(fachada.getProp().getProp().getProperty("Iva"));

			ivaTotal = valortotal * iva + ivaTotal;


			valortotalCompra  = valortotalCompra  + valortotal;

			gui.getPanelResultados2().getMod1().addRow(new String[]{codProducto, nombreProducto, cantidad ,precioUni,String.valueOf(valortotal)});

			gui.getPanelResultados2().getLblPrecioValorTotal().setText(String.valueOf(valortotalCompra));
			gui.getPanelResultados2().getLblValorPrecioIva().setText(String.valueOf(ivaTotal));
			gui.getPanelResultados2().getLblValorPrecioSinIva().setText(String.valueOf(valortotalCompra - ivaTotal));
			gui.getPanelVentas().getTxfcantProd().setText("");
			gui.getPanelVentas().getlblProductoBuscado().setText("");


		}


		//FIN MODULO 5


		//Modulo 6

		if(evento.getActionCommand().equals("CONSULTAS"))
		{

			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setVisible(false);
			gui.getContentPane().add(gui.getPanelConsultas(),BorderLayout.CENTER);			
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelConsultas().setVisible(true);


		}


	if(evento.getActionCommand().equals("CONSULTACLIENTES"))
		{
		
			String informacionCliente = fachada.getClientesDAO().consultarCliente();
			
			gui.getPanelResultados().getTxtObjeto1().setText(informacionCliente);
			
		//Generar PDF
			try {
				
				//D:\\\\Desktop\\\\DetalleClientes.pdf
				
				System.out.println(fachada.getCpdf().CrearPdfConsultaClientes(informacionCliente));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
	
		if(evento.getActionCommand().equals("CONSULTADETALLECLIENTES"))
		{
		
			String detalleCliente = "Hola, amigos";
			gui.getPanelResultados().getTxtObjeto1().setText(detalleCliente);
			
		//Generar PDF
			try {
				System.out.println(fachada.getCpdf().CrearPdfConsultaDetallesClientes(detalleCliente));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
			
	
	
		if(evento.getActionCommand().equals("CONSULTAPROVEEDORES"))
		{
			
			String informacionProveedores= "Just Killed a man";
			
			gui.getPanelResultados().getTxtObjeto1().setText(informacionProveedores);
			//Generar PDF
			try {
				System.out.println(fachada.getCpdf().CrearPdfConsultaProveedores(informacionProveedores));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}


		//Fin Modulo 6


		if(evento.getActionCommand().equals("EDITAR"))
		{

			gui.getPanelBotones().setVisible(false);
			gui.getPanelBotones2().setVisible(true);
			gui.getPanelBotones2().getButBuscar().setText("Buscar Cliente");
			gui.getPanelBotones2().getButBuscar().setActionCommand("BUSCARCLIENTE");
			gui.getContentPane().add(gui.getPanelPropiedades(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
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

		if (evento.getActionCommand().equals("LEERPRODUCTO")){
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getProductosDAO().leer());
		}

		if (evento.getActionCommand().equals("AGREGARPRODUCTO")) {

			if(fachada.getProductosDAO().Verificar(gui.getPanelProductos().getTxtCodigoProducto().getText())==false){

				fachada.getProductosDTO().setCodigoProducto(gui.getPanelProductos().getTxtCodigoProducto().getText());
				fachada.getProductosDTO().setNitProveedor(gui.getPanelProductos().getTxtNitProveedorDeProducto().getText());
				fachada.getProductosDTO().setNombreProducto(gui.getPanelProductos().getTxtNombreProducto().getText());
				fachada.getProductosDTO().setPrecioCompraProducto(gui.getPanelProductos().getTxtPrecioCompraProducto().getText());
				fachada.getProductosDTO().setPrecioVentaProducto(gui.getPanelProductos().getTxtPrecioVentaProducto().getText());
				fachada.getProductosDAO().agregarProducto(fachada.getProductosDTO(), 0);	
				gui.getPanelProductos().getTxtCodigoProducto().setText("");
				gui.getPanelProductos().getTxtNitProveedorDeProducto().setText("");
				gui.getPanelProductos().getTxtNombreProducto().setText("");
				gui.getPanelProductos().getTxtPrecioCompraProducto().setText("");
				gui.getPanelProductos().getTxtPrecioVentaProducto().setText("");	

			}else{
				gui.mostrarMensajeJOption("Este codigo de producto ya fue ingresado con anterioridad", "Informacion", 1);
			}



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
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARPRODUCTODOS");
		}

		if(evento.getActionCommand().equals("BUSCARPRODUCTODOS")) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getProductosDAO().buscarProducto(gui.getPanelBuscar().getTxtBuscar().getText()).toString());
		}

		if(evento.getActionCommand().equals("ACTUALIZARPRODUCTO")){

			try{

				gui.getPanelResultados().getTxtObjeto1().setText("");
				codigoProducto = gui.getPanelProductos().getTxtCodigoProducto().getText();

				gui.getPanelProductos().getTxtCodigoProducto().setText(fachada.getProductosDAO().buscarProducto(codigoProducto).getCodigoProducto());
				gui.getPanelProductos().getTxtNitProveedorDeProducto().setText(fachada.getProductosDAO().buscarProducto(codigoProducto).getNitProveedor());
				gui.getPanelProductos().getTxtNombreProducto().setText(fachada.getProductosDAO().buscarProducto(codigoProducto).getNombreProducto());
				gui.getPanelProductos().getTxtPrecioCompraProducto().setText(fachada.getProductosDAO().buscarProducto(codigoProducto).getPrecioCompraProducto());
				gui.getPanelProductos().getTxtPrecioVentaProducto().setText(fachada.getProductosDAO().buscarProducto(codigoProducto).getPrecioVentaProducto());


				if(fachada.getClientesDAO().buscarClientes(cedula)!=null){

					gui.getPanelProductos().getButActualizar().setActionCommand("ACTUALIZARPRODUCTODOS");
					gui.mostrarMensajeJOption("Ahora ingrese valores y oprima de nuevo el boton", "Proceso a seguir", 1);

				}


			}

			catch(Exception y) {
				JOptionPane.showMessageDialog(null, "Primero debe ingresar una cÃ©dula vÃ¡lida en el campo indicado, para\npoder actualizar datos de algÃºn cliente");
			}

		}

		if(evento.getActionCommand().equals("ACTUALIZARPRODUCTODOS")){

			String codigoProductoDos = gui.getPanelProductos().getTxtCodigoProducto().getText();
			String nitProducto = gui.getPanelProductos().getTxtNitProveedorDeProducto().getText();
			String nombreProducto = gui.getPanelProductos().getTxtNombreProducto().getText();
			String precioCompraProducto = gui.getPanelProductos().getTxtPrecioCompraProducto().getText();
			String precioVentaProducto = gui.getPanelProductos().getTxtPrecioVentaProducto().getText();

			fachada.getProductosDAO().actualizarProducto(codigoProducto, codigoProductoDos, nitProducto ,nombreProducto, precioCompraProducto, precioVentaProducto);	
			JOptionPane.showMessageDialog(null, "Actializado con exito");

			gui.getPanelProductos().getTxtCodigoProducto().setText("");
			gui.getPanelProductos().getTxtNitProveedorDeProducto().setText("");
			gui.getPanelProductos().getTxtNombreProducto().setText("");
			gui.getPanelProductos().getTxtPrecioCompraProducto().setText("");
			gui.getPanelProductos().getTxtPrecioVentaProducto().setText("");
			gui.getPanelClientes().getButActualizar().setActionCommand("ACTUALIZARPRODUCTO");	

		}

		if(evento.getActionCommand().equals("BORRARPRODUCTO")){
			fachada.getProductosDAO().eliminarProducto(gui.getPanelProductos().getTxtCodigoProducto().getText());
			gui.mostrarMensajeJOption("Eliminado con exito", "Proceso exitoso", 1);
		}

		if(evento.getActionCommand().equals("LEERCLIENTE"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().leer());


		}

		if(evento.getActionCommand().equals("AGREGARCLIENTE")){

			if(fachada.getClientesDAO().Verificar(gui.getPanelClientes().getTxtCedula().getText())==false){

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

			}else{
				gui.mostrarMensajeJOption("Esta caedula ya fue ingresado con anterioridad", "Informacion", 1);
			}		

		}

		if(evento.getActionCommand().equals("BORRARCLIENTE")){
			fachada.getClientesDAO().eliminarCliente(gui.getPanelClientes().getTxtCedula().getText());
			gui.mostrarMensajeJOption("Eliminado con exito", "Proceso exitoso", 1);
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
					gui.mostrarMensajeJOption("Ahora ingrese valores y oprima de nuevo el boton", "Proceso a seguir", 1);

				}


			}

			catch(Exception y) {
				JOptionPane.showMessageDialog(null, "Primero debe ingresar una cÃ©dula vÃ¡lida en el campo indicado, para\npoder actualizar datos de algÃºn cliente");
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
			gui.getPanelClientes().getButActualizar().setActionCommand("ACTUALIZARCLIENTE");
		}

		if(evento.getActionCommand().equals("BUSCARCLIENTE"))
		{

			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelBuscar().getButSeleccionarCliente().setVisible(false);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.getPanelResultados2().setVisible(false);
			gui.getPanelVentas().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARCLIENTEDOS");

		}


		if(evento.getActionCommand().equals("BUSCARCLIENTE1"))
		{
			gui.getContentPane().add(gui.getPanelBuscar(),BorderLayout.CENTER);
			gui.getContentPane().add(gui.getPanelResultados(),BorderLayout.SOUTH);
			gui.getPanelResultados().setVisible(true);
			gui.getPanelBuscar().setVisible(true);
			gui.getPanelBuscar().getButSeleccionarCliente().setVisible(true);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(false);
			gui.getPanelResultados2().setVisible(false);
			gui.getPanelVentas().setVisible(false);
			gui.limpiar_texto(gui.getPanelBuscar());	
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARCLIENTEDOS");
		}

		if(evento.getActionCommand().equals("BUSCARCLIENTEDOS"))
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getClientesDAO().buscarClientes(gui.getPanelBuscar().getTxtBuscar().getText()).toString());

		}


		if(evento.getActionCommand().equals("AGREGARPROVEEDOR")){

			if(fachada.getProveedoresDAO().Verificar(gui.getPanelProveedores().getTxtNit().getText())==false){

				fachada.getProveedoresDTO().setNit(gui.getPanelProveedores().getTxtNit().getText());
				fachada.getProveedoresDTO().setCiudad(gui.getPanelProveedores().getTxtCiudad().getText());
				fachada.getProveedoresDTO().setDireccion(gui.getPanelProveedores().getTxtDireccion().getText());
				fachada.getProveedoresDTO().setNombreProveedor(gui.getPanelProveedores().getTxtNombre().getText());
				fachada.getProveedoresDTO().setTelefono(gui.getPanelProveedores().getTxtTelefono().getText());
				fachada.getProveedoresDAO().agregarProveedor(fachada.getProveedoresDTO(), 0);

				gui.getPanelProveedores().getTxtNit().setText("");
				gui.getPanelProveedores().getTxtCiudad().setText("");
				gui.getPanelProveedores().getTxtDireccion().setText("");
				gui.getPanelProveedores().getTxtTelefono().setText("");
				gui.getPanelProveedores().getTxtNombre().setText("");
				gui.getPanelProveedores().getTxtTelefono();	

			}else{

				gui.mostrarMensajeJOption("Este NIT ya fue ingresado con anterioridad", "Informacion", 1);	
			}


		}

		if(evento.getActionCommand().equals("LEERPROVEEDOR")){
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getProveedoresDAO().leer());
		}

		if(evento.getActionCommand().equals("BORRARPROVEEDOR")){
			fachada.getProveedoresDAO().eliminarProveedor(gui.getPanelProveedores().getTxtNit().getText());
			gui.mostrarMensajeJOption("Eliminado con exito", "Proceso exitoso", 1);
		}

		if(evento.getActionCommand().equals("ACTUALIZARPROVEEDOR")){

			try{

				gui.getPanelResultados().getTxtObjeto1().setText("");
				nit = gui.getPanelProveedores().getTxtNit().getText();
				gui.getPanelProveedores().getTxtDireccion().setText(fachada.getProveedoresDAO().buscarProveedor(nit).getDireccion());
				gui.getPanelProveedores().getTxtNombre().setText(fachada.getProveedoresDAO().buscarProveedor(nit).getNombreProveedor());
				gui.getPanelProveedores().getTxtTelefono().setText(fachada.getProveedoresDAO().buscarProveedor(nit).getTelefono());
				gui.getPanelProveedores().getTxtCiudad().setText(fachada.getProveedoresDAO().buscarProveedor(nit).getCiudad());

				if(fachada.getProveedoresDAO().buscarProveedor(nit)!=null){

					gui.getPanelProveedores().getButActualizar().setActionCommand("ACTUALIZARPROVEEDORDOS");
					gui.mostrarMensajeJOption("Ahora ingrese valores y oprima de nuevo el boton", "Proceso a seguir", 1);

				}


			}

			catch(Exception y) {
				JOptionPane.showMessageDialog(null, "Primero debe ingresar una cÃ©dula vÃ¡lida en el campo indicado, para\npoder actualizar datos de algÃºn cliente");
			}

		}

		if(evento.getActionCommand().equals("ACTUALIZARPROVEEDORDOS")){

			String nituno = gui.getPanelProveedores().getTxtNit().getText();
			String nombre = gui.getPanelProveedores().getTxtNombre().getText();
			String direccion = gui.getPanelProveedores().getTxtDireccion().getText();
			String telefono = gui.getPanelProveedores().getTxtTelefono().getText();
			String ciudad = gui.getPanelProveedores().getTxtCiudad().getText();

			fachada.getProveedoresDAO().actualizarProveedor(nit, nituno, nombre, direccion, telefono, ciudad); 
			JOptionPane.showMessageDialog(null, "Actializado con exito");

			gui.getPanelProveedores().getTxtNit().setText("");
			gui.getPanelProveedores().getTxtDireccion().setText("");
			gui.getPanelProveedores().getTxtTelefono().setText("");
			gui.getPanelProveedores().getTxtNombre().setText("");
			gui.getPanelProveedores().getTxtCiudad().setText("");
			gui.getPanelProveedores().getButActualizar().setActionCommand("ACTUALIZARPROVEEDOR");

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
			gui.getPanelBuscar().getButBuscar().setActionCommand("BUSCARPROVEEDORESDOS");
		}

		if(evento.getActionCommand().equals("BUSCARPROVEEDORESDOS")) 
		{
			gui.getPanelResultados().getTxtObjeto1().setText(fachada.getProveedoresDAO().buscarProveedor(gui.getPanelBuscar().getTxtBuscar().getText()).toString());
		}

		if (evento.getActionCommand().equals("INICIO")) 
		{
			gui.getPanelResultados().setVisible(false);
			gui.getPanelConsultas().setVisible(false);
			gui.getPanelProveedores().setVisible(false);
			gui.getPanelClientes().setVisible(false);
			gui.getPanelProductos().setVisible(false);
			gui.getPanelBotones().setVisible(true);
			gui.getPanelBuscar().setVisible(false);
			gui.getPanelBotones2().getButBuscar().setVisible(true);
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

	}


}