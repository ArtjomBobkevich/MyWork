package com.company;

public class Rectangle {
    Point point1 = new Point(1, 2);
    Point point2 = new Point(1, 2);

    private int point1X = point1.getX();
    private int point1Y = point1.getY();
    private int point2X = point2.getX();
    private int point2Y = point2.getY();

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.point1X = x1;
        this.point1Y = y1;
        this.point2X = x2;
        this.point2Y = y2;
    }

    public double lengthDiagonals(int x1, int y1, int x2, int y2) {

        if (x1 > x2 && y1 > y2) {
            return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        } else if (x1 < x2 && y1 > y2) {
            return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y1 - y2) * (y1 - y2)));
        } else if (x1 < x2 && y1 < y2) {
            return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        } else
            return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y2 - y1) * (y2 - y1)));
    }

    public int yardageRectangle(int x1, int y1, int x2, int y2) {
        if (x1 > x2 && y1 > y2) {
            return (x1 - x2) * (y1 - y2);
        } else if (x1 < x2 && y1 > y2) {
            return (x2 - x1) * (y1 - y2);
        } else if (x1 < x2 && y1 < y2) {
            return (x2 - x1) * (y2 - y1);
        } else
            return (x1 - x2) * (y2 - y1);
    }

    public void printYardage() {
        System.out.println("Площадь данного прямоугольника равна: " + yardageRectangle(point1X, point1Y, point2X, point2Y));
    }

    public void printDiagonals() {
        System.out.println("Диагональ данного прямоугольника равна: " + lengthDiagonals(point1X, point1Y, point2X, point2Y));
    }
}
