package com.company;

public class Rhomb extends Triangle {
    Point point4;
    private double sectionA;
    private double sectionB;
    private double sectionC;
    private double sectionD;

    public Rhomb(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3);
        this.point4 = point4;
    }

    @Override
    public double foundSectionA(Point point1, Point point2) {
        sectionA = Math.sqrt(Math.pow(point1.distanceY(point2), 2) + Math.pow(point1.distanceX(point2), 2));
        return this.sectionA;
    }

    @Override
    public double foundSectionB(Point point2, Point point3) {
        sectionB = Math.sqrt(Math.pow(point2.distanceY(point3), 2) + Math.pow(point2.distanceX(point3), 2));
        return this.sectionB;
    }

    @Override
    public double foundSectionC(Point point3, Point point4) {
        sectionC = Math.sqrt(Math.pow(point3.distanceY(point4), 2) + Math.pow(point3.distanceX(point4), 2));
        return this.sectionC;
    }

    public double foundSectionD(Point point4, Point point1) {
        sectionD = Math.sqrt(Math.pow(point4.distanceY(point1), 2) + Math.pow(point4.distanceX(point1), 2));
        return this.sectionD;
    }

    public double lengthDiagonals1(double sectionA, double sectionB) {
        return Math.sqrt(Math.pow(sectionA, 2) + Math.pow(sectionB, 2));
    }

    public double lengthDiagonals2(double sectionC, double sectionD) {
        return Math.sqrt(Math.pow(sectionC, 2) + Math.pow(sectionD, 2));
    }

    public double yardageRhomb (double sectionA,double sectionB,double sectionC,double sectionD){
        double diagonals1=this.lengthDiagonals1(sectionA,sectionB);
        double diagonals2=this.lengthDiagonals2(sectionC,sectionD);
        return (diagonals1+diagonals2)/2;
    }

    @Override
    public void print() {
        System.out.println("Площадь ромба равна: "+this.yardageRhomb(sectionA,sectionB,sectionC,sectionD));
    }
}
