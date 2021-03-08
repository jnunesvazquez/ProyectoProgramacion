package com.brais.models;

import com.joel.gameObjects.Asteroid;
import com.joel.gameObjects.Coordinate;


import java.awt.*;

public class RectangleGraphic extends Asteroid implements Drawable{
    /**
     * Clase que se va a ver en nuestra ventana
     */

    Color color;

    /**
     *
     * @param cor   Cordenadas
     * @param axisX eje X
     * @param axisY eje Y
     * @param color Color que le daremos
     */
    public RectangleGraphic(Coordinate cor, float axisX, float axisY, Color color){
        super(cor,axisX,axisY);
        this.color=color;
    }

    @Override
    public void draw(Graphics dw) {
        dw.setColor(color);
        dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.getSide(1),(int)this.getSide(2));
    }




}
