package com.company;

public class Rectangle {
<<<<<<< HEAD

    private Point point1;
    private Point point2;

    public Rectangle (Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }

    public double yardageRectangle(Point point1, Point point2) {
        return point1.distanceX(point2) * point1.distanceY(point2);
    }

    public double lengthDiagonals(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point1.distanceX(point2), 2) + Math.pow(point1.distanceY(point2), 2)));
    }

}

=======

    private Point point1;
    private Point point2;



    public void lengthDiagonals (Point point1, Point point2){

    }
}

//    public Rectangle(Point point1, Point point2) {
// //       this.point1 = point1;
//        this.point2 = point2;


>>>>>>> 9d7c1d0619d81a3f58d523370435ccf465464e7b
