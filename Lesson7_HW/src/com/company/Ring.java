package com.company;

public class Ring extends Shape {

    private double radius;

    public Ring(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
        this.radius = this.lengthDiagonals();
    }

    @Override
    public double lengthDiagonals() {
        return Math.sqrt(Math.pow(getPoint1().distanceY(getPoint2()), 2) + Math.pow(getPoint1().distanceX(getPoint2()), 2));
    }

    @Override
    public double yardage() {
        return Math.pow(radius, 2) + Math.PI;
    }

    @Override
    public boolean shapeCompare(Shape x) {
        if (this.yardage() == x.yardage()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Если брать две координаты как центр и точка линии окружности, то радиус окружности равен: " + this.radius + "\n Площадь круга равна: " + yardage();
    }
}
