package com.company;

public class Point {
    private int x;
    private int y;

    public Point (int x,int y){
        this.y=y;
        this.x=x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distanceX (Point x){
        return this.x-getX();
    }

    public int distanceY (Point x){
        return this.y-getY();
    }
}
