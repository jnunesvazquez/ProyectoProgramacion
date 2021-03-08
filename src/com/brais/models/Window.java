package com.brais.models;

import javax.swing.JFrame;
import java.awt.event.WindowListener;
import java.awt.event.*;
public class Window extends JFrame implements WindowListener {

    public Window(String titleGame){
        super(titleGame);
        setSize(500,500);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * Este metodo nos permite cerrar la ventana
     * @param e
     */
    @Override
    public void windowClosing(WindowEvent e) {
       System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
