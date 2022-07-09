package de.telran.javastart.Lessons.lesson18.Figures;

public class Cylinder extends Circle {
    private double height = 1;

    // Конструкторы
    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Геттеры и сеттеры
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    // Методы
    @Override
    public String toString(){
        return "Circle with height " + height +
                ", with radius " + getRadius() +
                ", with cylinderVolume " + getVolume();
    }
}
