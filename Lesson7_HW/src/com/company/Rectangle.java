package com.company;

public class Rectangle extends Square implements Print {
//    private Point point1;
//    private Point point2;

    public Rectangle(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public double yardageSquare(Point point1, Point point2) {
        return point1.distanceX(point2) * point1.distanceY(point2);
    }

    @Override
    public double lengthDiagonals(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.distanceY(point2), 2) + Math.pow(point1.distanceX(point2), 2));
    }

    @Override
    public void print() {
        System.out.println("Площадь прямоугольника равна: "+this.yardageSquare(getPoint1(),getPoint2()));
        System.out.println("Диагональ прямоугольника равна: "+this.lengthDiagonals(getPoint1(),getPoint2()));
    }
    }
