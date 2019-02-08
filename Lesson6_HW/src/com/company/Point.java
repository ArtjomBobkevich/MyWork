package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public double distanceX(Point x) {
//        return (this.x>x.getX())?this.x - x.getX():x.getX()-this.x;
//    }

//    public double distanceY(Point x) {
//        return (this.y>x.getY())?this.y - x.getY():x.getY()-this.y;
//    }

    public double distance (Point x){
        return Math.sqrt(Math.pow(this.x-x.getX(),2)+Math.pow(this.y-x.getY(),2));
    }

//   public double distance(Point x) {
//       if (this.x > x.getX() && this.y > x.getY()) {
//           return this.x - x.getX() & this.y - x.getY();
//       } else if (this.x > x.getX() && this.y < x.getY()){
//            return this.x - x.getX() & x.getY() - this.y;
//        } else if (this.x < x.getX() && this.y > x.getY()){
//            return x.getX() - this.x & this.y - x.getY();
//        } else
//            return x.getX() - this.x & x.getY() - this.y;
//    }
}

