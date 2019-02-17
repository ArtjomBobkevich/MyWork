package com.company;

public class Square extends Shape {

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double lengthDiagonals() {
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
        if (point1.distanceY(point2) == 0 || point1.distanceX(point2) == 0) {
            return "Координаты точек на одной оси, не соответствие исходным данным!!!";
        } else if (point1.distanceX(point2) != point1.distanceY(point2)) {
            return "Это не квадрат, стороны не равны!!!";
        } else
            return "Длина диагонали квадрата равна: " + this.lengthDiagonals() + "\n Площадь квадрата равна: " + this.yardage();
    }
}
