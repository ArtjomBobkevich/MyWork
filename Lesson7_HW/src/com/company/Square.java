package com.company;

public class Square {
    private Point point1;
    private Point point2;

    public Square (Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }

    public double lengthDiagonals (Point point1,Point point2){
        return Math.sqrt(point1.distanceY(point2)*2);
    }

    public double yardageSquare (Point point1,Point point2){
        return point1.distanceX(point2)*2;
    }
}
