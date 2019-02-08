package com.company;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(12, 20);

        Rectangle rectangle = new Rectangle(point1, point2);

        System.out.println("Диагональ равна: "+rectangle.lengthDiagonals(point1, point2));
        System.out.println("Площадь равна: "+rectangle.yardageRectangle(point1, point2));
    }
}
