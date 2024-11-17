package com.mycompany.avance2clienteservidorgrupo8;

import java.util.List;

public class Combo extends Producto {
    private List<Producto> productos;

//    constructor
    public Combo(int idCombo, String nombre, List<Producto> productos) {
        super(idCombo, nombre, 0);  
        this.productos = productos;
    }

//    metodo para calcular
    public double calcularPrecio() {
        double total = 0;
        
//        bucle para iterar por los productos e ir sumando al precio
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

//    metodo para mostrar la informacion del combo
    @Override
    public void mostrarInformacion() {
        System.out.println("Combo: " + getNombre() + ", Precio: " + calcularPrecio());
    }
}


