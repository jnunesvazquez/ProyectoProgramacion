package com.main;

import brais.models.*;
import brais.models.Window;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Window wd=new Window("Destructor");
        ArrayList array=new ArrayList();

        PanelFG pFG= new PanelFG(array);

        wd.add(pFG);
        wd.setSize(500,400);
        wd.setVisible(true);
    }
}
