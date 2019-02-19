package com.company;

public class Triangle extends Shape implements FoundSection {

    private double sectionA;
    private double sectionB;
    private double sectionC;

    public Triangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
        this.sectionA = this.foundSectionA();
        this.sectionB= this.foundSectionB();
        this.sectionC= this.foundSectionC();
    }

    @Override
    public double foundSectionA() {
        return Math.sqrt(Math.pow(getPoint1().distanceY(getPoint2()), 2) + Math.pow(getPoint1().distanceX(getPoint2()), 2));
    }

    @Override
    public double foundSectionB() {
        return Math.sqrt(Math.pow(getPoint2().distanceY(getPoint3()), 2) + Math.pow(getPoint2().distanceX(getPoint3()), 2));
    }

    @Override
    public double foundSectionC() {
        return Math.sqrt(Math.pow(getPoint3().distanceY(getPoint1()), 2) + Math.pow(getPoint3().distanceX(getPoint1()), 2));
    }

    public double foundValueP() {
        return (sectionA + sectionB + sectionC) / 2;
    }

    public double heightTriangle() {
        double valueP = this.foundValueP();
        return 2 / sectionA * (Math.sqrt((valueP - sectionA) + (valueP - sectionB) + (valueP - sectionC)));
    }

    @Override
    public double yardage() {
        return 0.5 * sectionA * heightTriangle();
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
        return "Высота треугольника равна: " + heightTriangle() + "\n Площаль треугольника равна: " + yardage();
    }
}
