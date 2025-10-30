package com.jeffrey.swingapp;

import java.awt.Font;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;

import javax.swing.SwingUtilities;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
  public static void main(String[] args) {
    FlatInterFont.install();
    FlatRobotoFont.install();
    FlatJetBrainsMonoFont.install();

    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Mi Proyecto Swing con Maven");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      frame.setSize(400, 300);

      JLabel label1 = new JLabel("¡Hola, FlatInterFont!", SwingConstants.CENTER);
      JLabel label2 = new JLabel("¡Hola, FlatRobotoFont!", SwingConstants.CENTER);
      JLabel label3 = new JLabel("¡Hola, FlatJetBrainsMonoFont!", SwingConstants.CENTER);

      label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
      label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
      label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

      Font newFont1 = new Font(FlatInterFont.FAMILY, Font.BOLD, 24);
      Font newFont2 = new Font(FlatRobotoFont.FAMILY, Font.BOLD, 24);
      Font newFont3 = new Font(FlatJetBrainsMonoFont.FAMILY, Font.BOLD, 24);

      label1.setFont(newFont1);
      label2.setFont(newFont2);
      label3.setFont(newFont3);

      panel.add(Box.createVerticalGlue());
      panel.add(label1);
      panel.add(Box.createVerticalStrut(10));
      panel.add(label2);
      panel.add(Box.createVerticalStrut(10));
      panel.add(label3);
      panel.add(Box.createVerticalGlue());

      frame.setContentPane(panel);
      frame.pack();
      frame.setVisible(true);
    });
  }
}
