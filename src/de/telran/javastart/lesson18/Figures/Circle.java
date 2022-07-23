package de.telran.javastart.lesson18.Figures;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    // Конструкторы
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Методы
    @Override
    public String toString() {
        return "Circle with radius " + radius +
                ", with color " + color +
                ", with circleArea " + getArea();
    }
}
