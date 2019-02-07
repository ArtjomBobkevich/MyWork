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

    public double distanceX(Point x) {
        return (this.x > x.getX()) ? this.x - x.getX() : x.getX() - this.x;
    }

    public double distanceY(Point x) {
        return (this.y > x.getY()) ? this.y - x.getY() : x.getY() - this.y;
    }

    public String toString() {
        return "Координата X равна: " + x + " Y равна: " + y;
    }
}
