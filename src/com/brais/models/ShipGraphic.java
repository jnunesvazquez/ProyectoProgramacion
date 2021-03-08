package com.brais.models;

import com.joel.gameObjects.Coordinate;
import com.joel.gameObjects.Ship;

import java.awt.*;

public class ShipGraphic extends Ship implements Drawable{

    Color color;

    public ShipGraphic (Coordinate x,Coordinate y,Coordinate z,Color color){
        super(x,y,z);
        this.color=color;
    }

    @Override
    public void draw(Graphics dw) {
        dw.setColor(color);
        int x[]={(int)this.getX(),(int)this.corA.getX(),(int)this.corB.getX()};
        int y[]={(int)this.getY(),(int)this.corA.getY(),(int)this.corB.getY()};

        Polygon p=new Polygon(x,y,3);
        dw.fillPolygon(p);
    }
}
