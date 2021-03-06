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
}
