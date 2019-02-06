package com.company;

public class Square implements Print {
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
        return Math.pow(point1.distanceX(point2),2);
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint1() {
        return point1;
    }

    @Override
    public void print() {
        System.out.println("Диагональ квадрата равна: "+this.lengthDiagonals(point1,point2));
        System.out.println("Площадь квадрата равна "+this.yardageSquare(point1,point2));
    }
}
