package com.jeffrey.swingapp;

import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Proyecto Swing con Maven");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JLabel label = new JLabel("¡Hola, Maven + Swing!", SwingConstants.CENTER);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
