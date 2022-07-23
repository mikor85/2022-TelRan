package de.telran.javastart.lesson3;

public class Lesson3 {
    public static void main (String[] args) {
        int a = 6;
        int b = 5;
        /*
            * /   + - %
         */
        System.out.println("a: " + a); // 6
        a = a / 3;
        System.out.println("a: " + a); // 2
        --a;
        System.out.println("a: " + a); // 1
        // a = a + 15;
        a += 15;
        System.out.println("a: " + a); // 16

        int recArea = rectangleArea(10, 15);
        System.out.println("Rectangle area is: " + recArea);

        float angle = 45.6333F;
        double height = 54.666;
        double foundationArea = 44.55;
        double volume = height * foundationArea;

        System.out.println("Volume is: " + volume);

        int intVolume = (int) volume; // оператор приведения
        System.out.println("intVolume: " + intVolume);


    }
    // функция расчета площади прямоугольника
    public static int rectangleArea (int a, int b)
    {
        return a * b;
    }


}
