package com.mycompany.avance2clienteservidorgrupo8;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;

//    constructor
    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

//    getter
    public String getNombre() {
        return nombre;
    }

//    metodos de producto
    
//    consultar producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio);
    }
    
//    consulta precio
    public double getPrecio() {
        return precio;
    }
}

