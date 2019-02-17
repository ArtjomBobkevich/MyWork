package com.company;

public class Rhomb extends Shape implements FoundSection {

    private double sectionA = this.foundSectionA();
    private double sectionB = this.foundSectionB();
    private double sectionC = this.foundSectionC();
    private double sectionD = this.foundSectionD();

    public Rhomb(Point point1, Point point2, Point point3, Point point4) {
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
        return Math.sqrt(Math.pow(point3.distanceY(point4), 2) + Math.pow(point3.distanceX(point4), 2));
    }

    @Override
    public double foundSectionD() {
        return Math.sqrt(Math.pow(point4.distanceY(point1), 2) + Math.pow(point4.distanceX(point1), 2));
    }

    public int angleBetweenParties() {
        return point1.angleToAxis(point4) - point1.angleToAxis(point2);
    }

    public double lengthDiagonals1() {
        return 2 * sectionA * Math.cos(angleBetweenParties() / 2);
    }

    public double lengthDiagonals2() {
        return 2 * sectionA * Math.sin(angleBetweenParties() / 2);
    }

    @Override
    public double yardage() {
        return 0.5 * this.lengthDiagonals1() * this.lengthDiagonals2();
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
        if (sectionA == sectionB & sectionB == sectionC & sectionC == sectionD & sectionD == sectionA) {
            return "Угол между стороной А и стороной Б равен: " + angleBetweenParties() + " \n Первая диагональ ромба равна: " + this.lengthDiagonals1() + " Вторая диагональ ромба равна: " + this.lengthDiagonals2() + "\n Площадь ромба равна: " + yardage();
        } else
            return "Это не ромб!";
    }
}
