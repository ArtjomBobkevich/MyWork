package com.company;

public class Triangle extends Shape implements FoundSection {

    private double sectionA = this.foundSectionA();
    private double sectionB = this.foundSectionB();
    private double sectionC = this.foundSectionC();

    public Triangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double foundSectionA() {
        return Math.sqrt(Math.pow(point1.distanceY(point2), 2) + Math.pow(point1.distanceX(point2), 2));
    }

    @Override
    public double foundSectionB() {
        return Math.sqrt(Math.pow(point2.distanceY(point3), 2) + Math.pow(point2.distanceX(point3), 2));
    }

    @Override
    public double foundSectionC() {
        return Math.sqrt(Math.pow(point3.distanceY(point1), 2) + Math.pow(point3.distanceX(point1), 2));
    }

    @Override
    public double foundSectionD() {
        return 0;
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
    public String shapeCompare(Shape x) {
        if (this.yardage() == x.yardage())
            return "Эти фигуры равны!";
        else
            return "Эти фигуры не равны!";
    }

    @Override
    public String toString() {
        return "Высота треугольника равна: " + heightTriangle() + "\n Площаль треугольника равна: " + yardage();
    }
}
