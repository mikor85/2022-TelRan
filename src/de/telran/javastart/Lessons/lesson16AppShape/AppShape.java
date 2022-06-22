package de.telran.javastart.Lessons.lesson16AppShape;

//  ДЗ:
//  3. Реализовать интерфейс AdvancedArrayList  - дописать класс MyArrayList.
//     a. * Добавить в интерфейс метод void append(int [] a) и дописать MyArrayList.

public class AppShape {
    public static void main(String[] args) {

        // Lines
        Line line1 = new Line('#',7);
        line1.draw();
        System.out.println("--------------------");

        Line line2 = new Line('&',5);
        line1.draw();
        System.out.println("--------------------");

        // Rectangles
        Rectangle rectangle = new Rectangle('*', 15, 3);
        rectangle.draw();
        System.out.println("--------------------");

        // Pictures
        Shape[] shapeArray = {line1, rectangle, line2};
        Picture picture = new Picture('8', shapeArray);
        picture.draw();
    }
}
