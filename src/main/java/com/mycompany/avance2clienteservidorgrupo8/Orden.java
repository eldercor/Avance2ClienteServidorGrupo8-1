package com.mycompany.avance2clienteservidorgrupo8;

import java.util.List;

public class Orden {
    private int idOrden;
    private List<Producto> productos;
    private List<Combo> combos;
    private String estado;
    
//    constructor

    public Orden(int idOrden, List<Producto> productos, List<Combo> combos) {
        this.idOrden = idOrden;
        this.productos = productos;
        this.combos = combos;
        this.estado = "pendiente";
    }

//    metodos
    
//    metodo agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    
//    metodo agregar combo
    public void agregarCombo(Combo combo) {
        combos.add(combo);
    }

//    metodo para calcular total
    public double calcularTotal() {
        double total = 0;
        
//        itera por los productos de la lista y suma el total
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
//        igualmente aca
        for (Combo combo : combos) {
            total += combo.calcularPrecio();
        }
        return total;
    }

//    este agrega el nuevo estado a estado
    public void actualizarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }

//    getter del id de la orden
    public int getIdOrden() {
        return idOrden;
    }
}
