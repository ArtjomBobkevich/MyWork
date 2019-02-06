package com.company;

public class Ring extends Rectangle {
    private final double VALUE_P=3.14;
    private double radius;

    public Ring(Point point1, Point point2) {
        super(point1, point2);
//        this.radius=ra
    }

    @Override
    public double lengthDiagonals (Point point1,Point point2){
        this.radius = Math.sqrt(Math.pow(point1.distanceY(point2),2)+Math.pow(point1.distanceX(point2),2));
        return radius;
    }

    public double yardageRing(double radius) {
        return Math.pow(radius,2)+VALUE_P;
    }

    @Override
    public void print() {
        System.out.println("Площадь круга равна: "+this.yardageRing(radius));
    }
}
