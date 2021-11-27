package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelBotones extends JPanel{
    
    private static final long serialVersionUID = 1L;

    private JButton butClientes;
    private JButton butProveedores;
    private JButton butProductos;
    private JButton butVentas;
    
    
    private JLabel labTitulo1;
    public static final String CLIENTE = "Cliente";
    public static final String PROVEEDORES = "Proveedores";
    public static final String VENTAS = "Venta";
    public static final String PRODUCTOS = "Productos";

    public PanelBotones() {
        
        setLayout( new GridLayout(6,1) );
        
        labTitulo1 = new JLabel("Nombre Tienda", SwingConstants.CENTER);
        labTitulo1.setFont((new Font("Bahnschrift",Font.BOLD,20)));
        add(labTitulo1);
        
        butClientes = new JButton("Gestion clientes");
        butClientes.setActionCommand(CLIENTE);
        add(butClientes);
        
        butProveedores = new JButton("Gestion Proveedores");
        butProveedores.setActionCommand(PROVEEDORES);
        add(butProveedores);
        
        butProductos = new JButton("Gestion Productos");
        butProductos.setActionCommand(PRODUCTOS);
        add(butProductos);
        
        butVentas = new JButton("Gestion Ventas");
        butVentas.setActionCommand(VENTAS);
        add(butVentas);
        
        
    }

    
    
    public JButton getButClientes() {
        return butClientes;
    }



    public void setButClientes(JButton butClientes) {
        this.butClientes = butClientes;
    }



    public JButton getButProveedores() {
        return butProveedores;
    }



    public void setButProveedores(JButton butProveedores) {
        this.butProveedores = butProveedores;
    }



    public JButton getButProductos() {
        return butProductos;
    }



    public void setButProductos(JButton butProductos) {
        this.butProductos = butProductos;
    }



    public JButton getButVentas() {
        return butVentas;
    }



    public void setButVentas(JButton butVentas) {
        this.butVentas = butVentas;
    }



    public JLabel getLabTitulo1() {
        return labTitulo1;
    }



    public void setLabTitulo1(JLabel labTitulo1) {
        this.labTitulo1 = labTitulo1;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public static String getCliente() {
        return CLIENTE;
    }



    public static String getProveedores() {
        return PROVEEDORES;
    }



    public static String getVentas() {
        return VENTAS;
    }



    public static String getProductos() {
        return PRODUCTOS;
    }
    
}