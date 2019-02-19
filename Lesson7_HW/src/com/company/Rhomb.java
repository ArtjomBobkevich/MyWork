package com.company;

public class Rhomb extends Shape implements FoundSection {

    private double sectionA;
    private double sectionB;
    private double sectionC;
    private double sectionD;

    public Rhomb(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
        this.sectionA= this.foundSectionA();
        this.sectionB= this.foundSectionB();
        this.sectionC= this.foundSectionC();
        this.sectionD= this.foundSectionD();

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
        return Math.sqrt(Math.pow(getPoint3().distanceY(getPoint4()), 2) + Math.pow(getPoint3().distanceX(getPoint4()), 2));
    }

    public double foundSectionD() {
        return Math.sqrt(Math.pow(getPoint4().distanceY(getPoint1()), 2) + Math.pow(getPoint4().distanceX(getPoint1()), 2));
    }

    public int angleBetweenParties() {
        return getPoint1().angleToAxis(getPoint4()) - getPoint1().angleToAxis(getPoint2());
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
    public boolean shapeCompare(Shape x) {
        if (this.yardage() == x.yardage()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (sectionA == sectionB & sectionB == sectionC & sectionC == sectionD & sectionD == sectionA) {
            return "Угол между стороной А и стороной Б равен: " + angleBetweenParties() + " \n Первая диагональ ромба равна: " + this.lengthDiagonals1() + " Вторая диагональ ромба равна: " + this.lengthDiagonals2() + "\n Площадь ромба равна: " + yardage();
        } else
            return "Это не ромб!";
    }
}
