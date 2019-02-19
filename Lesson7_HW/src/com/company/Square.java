package com.company;

public class Square extends Shape {

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double lengthDiagonals() {
        return Math.sqrt(Math.pow(getPoint1().distanceY(getPoint2()), 2) + Math.pow(getPoint1().distanceY(getPoint2()), 2));
    }

    @Override
    public double yardage() {
        return Math.pow(getPoint1().distanceX(getPoint2()), 2);
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
        if (getPoint1().distanceY(getPoint2()) == 0 || getPoint1().distanceX(getPoint2()) == 0) {
            return "Координаты точек на одной оси, не соответствие исходным данным!!!";
        } else if (getPoint1().distanceX(getPoint2()) != getPoint1().distanceY(getPoint2())) {
            return "Это не квадрат, стороны не равны!!!";
        } else
            return "Длина диагонали квадрата равна: " + this.lengthDiagonals() + "\n Площадь квадрата равна: " + this.yardage();
    }
}
