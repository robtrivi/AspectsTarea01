package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel previousColorLabel; // Nueva etiqueta para mostrar el color anterior

    private JPanel getPanel(){
        return panel;
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.createGUI();
    }

    
    public void createGUI() {
        frame = new JFrame("Cambiar Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        
        button1 = new JButton("Rojo");
        button2 = new JButton("Verde");
        button3 = new JButton("Azul");
        previousColorLabel = new JLabel("Color anterior: "); // Inicializar la etiqueta

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Changes.changeBg(getPanel(), Color.RED, previousColorLabel);
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Changes.changeBg(getPanel(), Color.GREEN, previousColorLabel);
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Changes.changeBg(getPanel(), Color.BLUE, previousColorLabel);
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(previousColorLabel); // Agregar la etiqueta al panel

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(300, 250)); // Aumentar la altura de la ventana
        frame.pack();
        frame.setVisible(true);
    }

    // Método para actualizar la etiqueta del color anterior

}
