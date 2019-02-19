package com.company;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangleToComparison(Shape shape) {
        if (shape instanceof Rectangle) {
            return true;
        } else if (shape instanceof Square) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangleToComparison(Shape shape) {
        if (shape instanceof Triangle) {
            return true;
        } else {
            return false;
        }
    }
}