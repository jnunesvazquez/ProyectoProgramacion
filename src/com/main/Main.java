package com.main;

import java.awt.*;
import java.util.ArrayList;

import com.brais.models.*;
import com.brais.models.Window;
import com.joel.gameObjects.Coordinate;


public class Main {

    public static void main(String[] args) {
        //ventana
        Window wd=new Window("Destructor");
        ArrayList array=new ArrayList();
        PanelFG pFG= new PanelFG(array);
        wd.add(pFG);
        wd.setSize(800,600);
        wd.setVisible(true);
        //Rectangulo
        //Indicamos en que cordenadas estara,y que tamaño tendra a de mas de colo
        Coordinate coor1=new Coordinate(250,250); //Cordenadas donde aparece el objeto
        RectangleGraphic rec=new RectangleGraphic(coor1,50,30, Color.blue);
        array.add(rec);
        //Circulo
        Coordinate coor2=new Coordinate(100,100); //Cordenadas donde aparece el objeto
        BulletGraphic bullet=new BulletGraphic(coor2,50,Color.magenta);
        array.add(bullet);
        //nave
        Coordinate coor3=new Coordinate(475,500); //punta
        Coordinate coor4=new Coordinate(425,575); //esquina Izquierda
        Coordinate coor5=new Coordinate(525,575); //esquina Derecha
        ShipGraphic ship=new ShipGraphic(coor3,coor4,coor5,Color.red);
        array.add(ship);

    }
}
