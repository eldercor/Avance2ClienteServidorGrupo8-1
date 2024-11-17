package com.mycompany.avance2clienteservidorgrupo8;

public class Cajero extends Usuario {
    private String sucursal;
    
//    constructor para cajero
    public Cajero(int idUsuario, String nombreUsuario, String contraseña, String sucursal) {
        super(idUsuario, nombreUsuario, contraseña, "cajero");
        this.sucursal = sucursal;
    }

    
//    metodos para cajero
//    aca muestra el id de la orden registrada
    public void registrarOrden(Orden orden) {
        System.out.println("Orden registrada: " + orden.getIdOrden());
    }
//    genera una nueva factura de la clase factura
    public void generarFactura(Orden orden) {
        Factura factura = new Factura(orden);
        factura.mostrarFactura();
    }
}
