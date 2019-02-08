package com.company;

public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle (Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }

    public double yardageRectangle(Point point1, Point point2) {
        return (point2.getX()-point1.getX())*(point2.getY()-point1.getY());
    }

    public double lengthDiagonals(Point point1, Point point2) {
        return point1.distance(point2);
    }
}

//Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2))







