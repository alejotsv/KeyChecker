package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyChecker extends JFrame implements KeyListener {
    Dimension dim = new Dimension(1000, 600);
    JLabel subtitle;
    String currentSub;

    KeyChecker(String title){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("Add your subtitle: ");
        JTextField subField = new JTextField(50);
        subField.addKeyListener(this);
        JButton submit = new JButton("Submit");
        panel.add(subLabel);
        panel.add(subField);
        panel.add(submit);
        subtitle = new JLabel(currentSub);
        panel.add(subtitle);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {
        currentSub += keyEvent.getKeyChar();
        subtitle.setText(currentSub);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
