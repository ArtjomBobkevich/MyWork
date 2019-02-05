package com.company;

public class Test {
    public static void main(String[] args) {

        Rectangle coordinates=new Rectangle(new Point(5,6),new Point(8,9));
        System.out.println("Площадь прямоугольника: "+coordinates.yardageRectangle(new Point(5,6),new Point(8,9)));
        System.out.println("Диагональ прямоугольника: "+coordinates.lengthDiagonals(new Point(5,6),new Point(8,9)));
    }
}
