package application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CambioColorFondo extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel panel;
    private JButton botonRojo, botonVerde, botonAzul;

    public CambioColorFondo() {
        // Configuración de la ventana
        setTitle("Cambio de Color de Fondo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear panel
        panel = new JPanel();

        // Crear botones
        botonRojo = new JButton("Rojo");
        botonVerde = new JButton("Verde");
        botonAzul = new JButton("Azul");

        // Agregar botones al panel
        panel.add(botonRojo);
        panel.add(botonVerde);
        panel.add(botonAzul);

        // Agregar panel a la ventana
        getContentPane().add(panel);

        // Agregar ActionListener a los botones
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonAzul.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener el botón que se ha presionado
        JButton botonPresionado = (JButton) e.getSource();

        // Cambiar el color de fondo según el botón presionado
        if (botonPresionado == botonRojo) {
            panel.setBackground(Color.RED);
        } else if (botonPresionado == botonVerde) {
            panel.setBackground(Color.GREEN);
        } else if (botonPresionado == botonAzul) {
            panel.setBackground(Color.BLUE);
       }
    }
}