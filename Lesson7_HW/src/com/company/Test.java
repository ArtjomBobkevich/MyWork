package com.company;

public class Test  {
    public static void main(String[] args) {
        Point point1=new Point(4,5);
        Point point2=new Point(9,10);
        Point point3=new Point(17,22);
        Point point4=new Point(7,15);
//        Ring radius =new Ring()
        Square squareDiagonals=new Square(point1,point2);
//        Square squareYardage=new Square(point1,point2);
        Rectangle rectangleDiagonals=new Rectangle(point1,point2);
        Rectangle rectangleYardage=new Rectangle(point1,point2);
        Triangle height=new Triangle(point1,point2,point3);
        Triangle yardage=new Triangle(point1,point2,point3);
        Rhomb yardageRhomb=new Rhomb(point1,point2,point3,point4);
        Ring yardageOfTheRing= new Ring(point1,point2);

        point1.print();
        point2.print();
        point3.print();
        point4.print();
        squareDiagonals.print();
        rectangleDiagonals.print();
//        height.print();
//        yardageRhomb.print();
//        yardageOfTheRing.print();

//        System.out.println("Диагональ квадрата равна: "+squareDiagonals.lengthDiagonals(point1,point2));
//        System.out.println("Площадь квадрата равна: "+squareYardage.yardageSquare(point1,point2));
        System.out.println();
        System.out.println("Диагональ прямоугольника равна: "+rectangleDiagonals.lengthDiagonals(point1,point2));
        System.out.println("Площадь прямоугольника равна: "+rectangleYardage.yardageSquare(point1,point2));
        System.out.println();
        System.out.println("Высота треугольника равна: "+height.heightTriangle(height.foundSectionA(point1,point2),
                                                        height.foundSectionB(point2,point3),height.foundSectionC(point1,point3)));
        System.out.println("Площадь треугольника равна: "+yardage.yardageTriangle(yardage.foundSectionA(point1,point2),
                                                         yardage.foundSectionB(point2,point3),yardage.foundSectionC(point1,point3)));
        System.out.println();
        System.out.println("Площадь ромба равна: "+ yardageRhomb.yardageRhomb(yardageRhomb.foundSectionA(point1,point2),yardageRhomb.foundSectionB(point2,point3),
                                                     yardageRhomb.foundSectionC(point3,point4),yardageRhomb.foundSectionD(point4,point1)));
        System.out.println();
        System.out.println("Площадь круга равна: "+yardageOfTheRing.yardageRing(yardageOfTheRing.lengthDiagonals(point1,point2)));
    }
}
