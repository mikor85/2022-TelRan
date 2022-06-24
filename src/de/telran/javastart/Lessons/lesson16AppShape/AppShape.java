package de.telran.javastart.Lessons.lesson16AppShape;

public class AppShape {
    public static void main(String[] args) {

        // Lines
        Line line1 = new Line('#',7);
        //line1.draw();
        System.out.println("--------------------");

        Line line2 = new Line('&',5);
        //line1.draw();
        System.out.println("--------------------");

        // Rectangles
        Rectangle rectangle1 = new Rectangle('$', 10, 5);
        //rectangle1.draw();
        System.out.println("--------------------");

        Rectangle rectangle2 = new Rectangle('*', 15, 3);
        //rectangle2.draw();
        System.out.println("--------------------");

        // Pictures
        Shape[] shapeArray = {line1, rectangle1, line2, rectangle2};
        Picture picture = new Picture('8', shapeArray);
        picture.draw();
    }
}
