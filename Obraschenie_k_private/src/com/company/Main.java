package com.company;

class TwoShare {
   private double width;
   private double height;
   double getWidth () {return width;}
   double getHeight() {return height;}
   void setWidth (double w) {width=w;}
   void  setHeight (double h) {height=h;}
    void showDim() {
        System.out.println("Ширина и высота - "+ width+" и "+ height);
    }
}