package ru.zzzhvl.faa.sandbox;

public class DooBee {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point(3, 5, 1, 2);
        System.out.println("Расстояние между точками " + p.x1 + ";" + p.y1 + " и " + p.x2 + ";" + p.y2 + " = " + p.distance());
    }
}