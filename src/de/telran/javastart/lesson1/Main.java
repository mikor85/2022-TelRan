package de.telran.javastart.lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.print("Hello world\n"); // однострочный комментарий
        System.out.println(" Hello world");

        sayHello();
        calculateArea(10, 20);

    }

    /* public static int getCellValue(String cell)
    {
        return 74;
    } */

    public static void sayHello()
    {
        System.out.println("My town is Berlin");
    }

    public static void calculateArea(int a, int b)
    {
        System.out.println("area: " + a*b);
    }
}
