package de.telran.javastart.lesson1;

public class Tester {
    public static void main(String[] args) {
  /*      System.out.println("5 + 5" + " hello");
        System.out.println(5 + 5);
        System.out.println("5" + 5);
        System.out.println("5+5=" + (5+5)); */

        int counter;  // объявление переменной
        counter = 101;  // инициализация
        System.out.println("counter:" + counter);

        int area = 125;  // обявление + инициализация
        System.out.println("area is: " + area);

        area = area * 2;
        System.out.println("area is: " + area);

        int hex = 0xabc;  // префикс 0x
        System.out.println("hex: " + hex);

        int binary = 0B101;  // префикс 0B
        System.out.println("binary: " + binary);

        int octal = 0101;  // префикс 0
        System.out.println("octal: " + octal);

        int millis = 50_000_000;
        System.out.println("millis: " + millis);

        // int big = 4556677889910;
        long big = 4556677889910L;  // суффикс либо L либо l
        long anotherLong = 66L;

        System.out.println("long sum: " + (big + anotherLong + 4000));

        int myBigInt = (int) big;  // кастинг - приведение типов

        System.out.println("big: " + big);
        System.out.println("myBigInt: " + myBigInt);

        int height = 44;
        System.out.println("main height: " + height);
        fly();
        run();

    }
    public static void fly()
    {
        int height = 14;
        System.out.println("fly height: " + height);
    }

    public static void run()
    {
        int height = 3;
        System.out.println("run height: " + height);
    }
}
