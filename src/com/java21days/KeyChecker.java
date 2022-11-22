package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyChecker extends JFrame implements KeyListener {
    Dimension dim = new Dimension(200, 200);
    JLabel subtitle;

    KeyChecker(String title){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
