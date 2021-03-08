package com.joel.gameObjects;

public class Asteroid extends Coordinate{

    private float sideA;
    private float sideB;

    public Asteroid() {
        super();
        this.sideA = 0;
        this.sideB = 0;
    }

    public Asteroid(Coordinate cor, float x, float y) {
        super(cor);
        this.sideA = x;
        this.sideB = y;
    }

    public Asteroid(Asteroid nw) {
        super(nw.getX(), nw.getY());
        this.sideA = nw.sideA;
        this.sideB = nw.sideB;
    }

    public float getSide(int side){
        if(side==1){
            return this.sideA;
        }
        if(side==2){
            return this.sideB;
        }
        if(side!=1 && side!=2){
            return 0;
        }
        return 0;
    }
}
