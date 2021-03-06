package com.joel.gameObjects;

public class Coordinate {

    private float x;
    private float y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate (Coordinate nw){
        this.x = nw.x;
        this.x = nw.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
