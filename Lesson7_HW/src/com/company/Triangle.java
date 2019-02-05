package com.company;

public class Triangle extends Rectangle{
    private Point point3;

    public Triangle (Point point1,Point point2, Point point3){
        super(point1,point2);
        this.point3=point3;
    }

    public double valueP (Point point1,Point point2,Point point3){
        return (Math.sqrt(Math.pow(point1.distanceY(point2),2)+Math.pow(point1.distanceX(point2),2))+
                Math.sqrt(Math.pow(point2.distanceY(point3),2)+Math.pow(point2.distanceX(point3),2))+
                Math.sqrt(Math.pow(point3.distanceY(point1),2)+Math.pow(point3.distanceX(point1),2)))/2;
    }

    public double heightTriangle(Point point1,Point point2,Point point3, double valueP){
      valueP=this.valueP(point1,point2,point3);
      return 2*(Math.sqrt((valueP-Math.sqrt(Math.pow(point1.distanceY(point2),2)+Math.pow(point1.distanceX(point2),2)))+
              (valueP-Math.sqrt(Math.pow(point1.distanceY(point2),2)+Math.pow(point1.distanceX(point2),2))))
    }
    public int yardageTriangle
}
