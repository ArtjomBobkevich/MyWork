package com.company;

public class Point implements Print {
    private int x;
    private int y;

    public Point (int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceX (Point x){
        return (this.x>x.getX())?this.x - x.getX():x.getX()-this.x;
    }

    public double distanceY (Point x){
        return (this.y>x.getY())?this.y-x.getY():x.getY()-this.y;
    }

    @Override
    public void print() {
        System.out.println("Координаты точки X:"+x+" Y:"+y);
    }
}
