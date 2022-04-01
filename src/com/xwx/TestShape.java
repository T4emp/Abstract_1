package com.xwx;

public class TestShape {
    public static void main() {
        Shape s1 = new Rectangle("Красный", 4, 5);
        System.out.println(s1);
        System.out.println("Площадь равна " + s1.getArea());

        Shape s2 = new Triangle("Синий", 4, 5);
        System.out.println(s1);
        System.out.println("Площадь равна " + s2.getArea());
    }
}