package com.main;

import com.brais.models.*;
import com.brais.models.Window;
import com.joel.gameObjects.Coordinate;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Window wd=new Window("Destructor");
        ArrayList array=new ArrayList();
        Coordinate coor1=new Coordinate(250,250);
        PanelFG pFG= new PanelFG(array);
        //Indicamos en que cordenadas estara,y que tamaño tendra a de mas de colo
        RectangleGraphic rec=new RectangleGraphic(coor1,50,30, Color.red);
        array.add(rec);
        wd.add(pFG);
        wd.setSize(800,600);
        wd.setVisible(true);
    }
}
