package com.company;

public class Triangle extends Rectangle{
    private Point point3;
    private double sectionA;
    private double sectionB;
    private double sectionC;

    public Triangle (Point point1,Point point2, Point point3){
        super(point1,point2);
        this.point3=point3;
    }

    public double foundSectionA (Point point1,Point point2){
        sectionA=Math.sqrt(Math.pow(point1.distanceY(point2),2)+Math.pow(point1.distanceX(point2),2));
        return this.sectionA;
    }

    public double foundSectionB (Point point2,Point point3){
        sectionB=Math.sqrt(Math.pow(point2.distanceY(point3),2)+Math.pow(point2.distanceX(point3),2));
        return this.sectionB;
    }

    public double foundSectionC (Point point1,Point point3){
        sectionC=Math.sqrt(Math.pow(point3.distanceY(point1),2)+Math.pow(point3.distanceX(point1),2));
        return this.sectionC;
    }

    public double foundValueP (double sectionA,double sectionB,double sectionC){
        return (sectionA+ sectionB+ sectionC)/2;
    }

    public double heightTriangle(double sectionA,double sectionB,double sectionC){
        double valueP=this.foundValueP( sectionA, sectionB, sectionC);
      return 2/sectionA*(Math.sqrt((valueP-sectionA)+ (valueP-sectionB)+(valueP-sectionC)));
    }

    public double yardageTriangle(double sectionA,double sectionB,double sectionC) {
    return 0.5*sectionA*heightTriangle(sectionA,sectionB,sectionC);
    }
}
