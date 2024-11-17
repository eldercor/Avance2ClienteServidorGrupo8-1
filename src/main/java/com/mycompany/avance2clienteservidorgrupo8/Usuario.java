package com.mycompany.avance2clienteservidorgrupo8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String rol;

    // Constructor
    public Usuario(int idUsuario, String nombreUsuario, String contraseña, String rol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // metodo para iniciar sesion
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        if (nombreUsuario == null || contraseña == null || nombreUsuario.isEmpty() || contraseña.isEmpty()) {
            return false; // Validar que las entradas no sean nulas o vacías
        }
        return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    // Metodo para cambiar la contrasena
    public void cambiarContrasena(String nuevaContrasena) {
        if (nuevaContrasena == null || nuevaContrasena.isEmpty()) {
            throw new IllegalArgumentException("La nueva contraseña no puede estar vacía.");
        }
        this.contraseña = nuevaContrasena;
    }
}

