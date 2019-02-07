package com.company;

public class Square extends Shape {

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double lengthDiagonals(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.distanceY(point2), 2) + Math.pow(point1.distanceY(point2), 2));
    }

    @Override
    public double yardage() {
        return Math.pow(point1.distanceX(point2), 2);
    }

    @Override
    public String shapeCompare(Shape x) {
        if (this.yardage() == x.yardage())
            return "Эти фигуры равны!";
        else
            return "Эти фигуры не равны!";
    }

    @Override
    public String toString() {
        return "Длина диагонали квадрата равна: " + this.lengthDiagonals(point1, point2) + "\n Площадь квадрата равна: " + this.yardage();
    }
}
