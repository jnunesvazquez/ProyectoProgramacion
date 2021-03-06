package com.joel.gameObjects;

public class Bullet extends Coordinate{

    private float radio;

    public Bullet() {
        super();
        this.radio = 0;
    }

    public Bullet(Coordinate nw, float r){
        super(nw);
        this.radio = r;
    }

    public Bullet(Bullet bl){
        super(bl);
        this.radio = bl.radio;
    }

    public void setRadio(float r) {
        this.radio = r;
    }

    public float getRadio(){
        return this.radio;
    }

    public Coordinate getCentro(){
        Coordinate nw = new Coordinate(this.getX(),this.getY());
        return nw;
    }
}
