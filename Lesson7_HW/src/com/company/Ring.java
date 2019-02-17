package com.company;

public class Ring extends Shape {

    private final double VALUE_P = 3.14;
    private double radius = this.lengthDiagonals();

    public Ring(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double lengthDiagonals() {
        return Math.sqrt(Math.pow(point1.distanceY(point2), 2) + Math.pow(point1.distanceX(point2), 2));
    }

    @Override
    public double yardage() {
        return Math.pow(radius, 2) + VALUE_P;
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
        return "Если брать две координаты как центр и точка линии окружности, то радиус окружности равен: " + this.radius + "\n Площадь круга равна: " + yardage();
    }
}
