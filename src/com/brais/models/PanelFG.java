package com.brais.models;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class PanelFG extends JPanel {

    ArrayList v;

    /**
     *
     * @param asd
     */
    public PanelFG(ArrayList asd){
        this.v=asd;
    }

    /**
     *
     * @param g
     */
    public void paint(Graphics g){
        Drawable dw;

        for(int i=0;i<v.size();i++){
            dw=(Drawable) v.get(i);
            dw.draw(g);
        }
    }
}
