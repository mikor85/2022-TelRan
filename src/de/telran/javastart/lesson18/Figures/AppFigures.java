package de.telran.javastart.lesson18.Figures;

public class AppFigures {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(2);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
