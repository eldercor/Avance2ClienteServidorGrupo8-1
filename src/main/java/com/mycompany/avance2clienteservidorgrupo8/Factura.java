package com.mycompany.avance2clienteservidorgrupo8;

import java.util.Date;

public class Factura {
    private int idFactura;
    private Orden orden;
    private double total;
    private Date fecha;
    
//  constructor
    
    public Factura(Orden orden) {
        this.orden = orden;
        this.total = orden.calcularTotal();
        this.fecha = new Date();
    }

    
//    plantilla para generar el archivo de factura
    public void generarArchivo() {
        System.out.println("Generando archivo de la factura...");
    }
//    muestra el contenido de la factura
    public void mostrarFactura() {
        System.out.println("Factura ID: " + idFactura + ", Total: " + total + ", Fecha: " + fecha);
    }
}

