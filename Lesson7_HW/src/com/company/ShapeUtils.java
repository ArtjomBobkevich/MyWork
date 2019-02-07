package com.company;

public class ShapeUtils {

    private Shape shape;
    private Triangle triangle;
    private Rectangle rectangle;
    private Square square;

    public static String shape(Shape shape, Triangle triangle, Rectangle rectangle, Square square) {
        if (shape == triangle) {
            return "Это треугольник!";
        } else if (shape == rectangle || shape == square) {
            return "Это прямоугольник";
        } else
            return "Это не прямоугольник или треугольник";
    }
}
