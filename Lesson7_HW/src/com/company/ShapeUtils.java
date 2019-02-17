package com.company;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangleToComparison(Shape shape, Rectangle rectangle, Square square) {
        if (shape == rectangle || shape == square) {
            return true;
        } else
            return false;
    }

    public static boolean isTriangleToComparison(Shape shape, Triangle triangle) {
        if (shape == triangle) {
            return true;
        } else
            return false;
    }
}