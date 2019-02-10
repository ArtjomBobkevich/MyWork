package com.company;

public abstract class Shape {

    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public Shape(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public double lengthDiagonals() {
        return 0;
    }

    public double yardage() {
        return 0;
    }

    public String shapeCompare(Shape x) {
        if (this.yardage() == x.yardage())
            return "Эти фигуры равны!";
        else
            return "Эти фигуры не равны!";
    }
}
