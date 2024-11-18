package com.mycompany.avance2clienteservidorgrupo8;

import javax.swing.*;

public class Avance2ClienteServidorGrupo8 {
    public static void main(String[] args) {
        // Usar la apariencia del sistema operativo para la interfaz de usuario, si es posible.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Asegúrate de que la creación de la GUI se ejecute en el Event Dispatch Thread (EDT).
        SwingUtilities.invokeLater(() -> {
            new Bienvenida();  // Inicia con la ventana de bienvenida
        });
    }
}
