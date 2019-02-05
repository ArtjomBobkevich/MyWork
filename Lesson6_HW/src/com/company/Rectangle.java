package com.company;

public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle (Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }

    public double yardageRectangle(Point point1, Point point2) {
        return point1.distanceX(point2) * point1.distanceY(point2);
    }

    public double lengthDiagonals(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point1.distanceX(point2), 2) + Math.pow(point1.distanceY(point2), 2)));
    }
}








