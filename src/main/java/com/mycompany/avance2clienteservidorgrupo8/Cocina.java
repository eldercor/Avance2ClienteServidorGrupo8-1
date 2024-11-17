package com.mycompany.avance2clienteservidorgrupo8;

import java.util.List;

public class Cocina {
    private List<Orden> pedidosPendientes;

    
//    constructor
    public Cocina(List<Orden> pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }

//    
    public void notificarOrden(Orden orden) {
        pedidosPendientes.add(orden);
        System.out.println("Nueva orden recibida: " + orden.getIdOrden());
    }

//    metodo para ver estado de la orden
    public void marcarComoPreparada(int idOrden) {
        
//        logica: busca una orden en una lista, y si la encuentra, cambia 
//        su estado a "preparada" y muestra un mensaje diciendo que ya esta lista
        for (Orden orden : pedidosPendientes) {
            if (orden.getIdOrden() == idOrden) {
                orden.actualizarEstado("preparada");
                System.out.println("Orden " + idOrden + " está preparada.");
            }
        }
    }
}

