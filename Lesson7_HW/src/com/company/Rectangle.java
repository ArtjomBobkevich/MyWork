package com.company;

public class Rectangle extends Square {

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double yardage() {
        return getPoint1().distanceX(getPoint2()) * getPoint1().distanceY(getPoint2());
    }

    @Override
    public double lengthDiagonals() {
        return Math.sqrt(Math.pow(getPoint1().distanceY(getPoint2()), 2) + Math.pow(getPoint1().distanceX(getPoint2()), 2));
    }

    @Override
    public boolean shapeCompare(Shape x) {
        if (this.yardage() == x.yardage()) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        if (getPoint1().distanceY(getPoint2()) == 0 || getPoint1().distanceX(getPoint2()) == 0) {
            return "Координаты точек на одной оси, не соответствие исходным данным!!!";
        } else {
            return "Диагональ прямоугольника равна: " + this.lengthDiagonals() + "\n Площадь прямоугольника равна: " + this.yardage();
        }
    }
}

