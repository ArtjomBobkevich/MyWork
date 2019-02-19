package com.company;

public abstract class Shape {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Shape(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public double lengthDiagonals() {
        return Math.sqrt(Math.pow(getPoint1().distanceY(getPoint2()), 2) + Math.pow(getPoint1().distanceX(getPoint2()), 2));
    }

    public double yardage() {
        return getPoint1().distanceX(getPoint2()) * getPoint1().distanceY(getPoint2());
    }

    public boolean shapeCompare(Shape x) {
        if (this.yardage() == x.yardage()) {
            return true;
        } else {
            return false;
        }
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }
}
