package com.brais.models;

import com.joel.gameObjects.Bullet;
import com.joel.gameObjects.Coordinate;
import com.joel.gameObjects.Ship;

import java.awt.*;

public class BulletGraphic extends Bullet implements Drawable{

    Color color;

    public BulletGraphic(Coordinate cor,float radio, Color color){
        super(cor,radio);
        this.color=color;
    }
    @Override
    public void draw(Graphics dw) {
        dw.setColor(color);
        dw.fillOval((int)(this.getX()-this.getRadio()),(int)(this.getY()-this.getRadio()),(int)(2*this.getRadio()),(int)(2*this.getRadio()));
    }
}
