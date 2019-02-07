package com.company;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(4, 5);
        Point point2 = new Point(9, 10);
        Point point3 = new Point(17, 22);
        Point point4 = new Point(7, 15);

        Square square = new Square(point1, point2, point3, point4);
        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
        Triangle triangle = new Triangle(point1, point2, point3, point4);
        Rhomb rhomb = new Rhomb(point1, point2, point3, point4);
        Ring ring = new Ring(point1, point2, point3, point4);
//        ShapeUtils shapeUtils=new ShapeUtils();

        System.out.println(point1.toString());
        System.out.println();
        System.out.println(square.toString());
        System.out.println();
        System.out.println(rectangle.toString());
        System.out.println();
        System.out.println(triangle.toString());
        System.out.println();
        System.out.println(rhomb.toString());
        System.out.println();
        System.out.println(ring.toString());
        System.out.println();
        System.out.println(ring.shapeCompare(rhomb));
        System.out.println();
        System.out.println(square.shapeCompare(rectangle));
//        System.out.println(shapeUtils.);

    }
}
