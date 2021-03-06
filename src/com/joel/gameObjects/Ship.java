package com.joel.gameObjects;

public class Ship extends Coordinate{

    public Coordinate corA = new Coordinate(); //Se ocupa de la coordenada de la izquierda
    public Coordinate corB = new Coordinate(); //Se ocupa de la coordenada de la derecha

    //La coordenada que heredamos de ocupa de la punta de la nave

    public Ship(){
        super();
        this.corA.setX(0);
        this.corA.setY(0);

        this.corB.setX(0);
        this.corB.setY(0);
    }

    public Ship(Coordinate x, Coordinate y, Coordinate z){
        super(x.getX(),x.getY());

        this.corA.setX(y.getX());
        this.corA.setY(y.getY());

        this.corB.setX(z.getX());
        this.corB.setY(z.getY());
    }

    public Ship (Ship c){
        super(c.getX(), c.getY());

        this.corA.setX(c.getX());
        this.corA.setY(c.getY());

        this.corB.setX(c.getX());
        this.corB.setY(c.getY());
    }

    public void setVertex(Coordinate nw, int side){
        if (side == 1){
            this.setX(nw.getX());
            this.setY(nw.getY());
        }
        else if(side == 2){
            this.corA.setX(nw.getX());
            this.corA.setY(nw.getY());
        }
        else if (side == 3){
            this.corB.setX(nw.getX());
            this.corB.setY(nw.getY());
        }

    }
}
