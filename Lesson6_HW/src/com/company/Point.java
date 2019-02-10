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

    public double distance(Point x) {
        return Math.sqrt(Math.pow(this.x - x.getX(), 2) + Math.pow(this.y - x.getY(), 2));
    }
}