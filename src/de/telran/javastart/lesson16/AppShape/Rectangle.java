package de.telran.javastart.lesson16.AppShape;

//     Класс Rectangle - наследует Shape и имеет два дополнительных параметра - width и height.
//     Метод draw толжен нарисовать прямоугольник из символов.

public class Rectangle extends Shape {
    // Поля
    private int width;
    private int height;

    // Конструктор
    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    // Геттеры и Сеттеры
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Методы
    // *****
    // *   *
    // *   *
    // *****

    @Override
    public void draw() {
        System.out.println("Rectangle has sides " + width + " and " + height + ". Has been drawn from symbols " + getSymbol() + ":");
        for (int i = 0; i < width; i++) {
            System.out.print(getSymbol());
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            System.out.print(getSymbol());
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(getSymbol());
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            System.out.print(getSymbol());
        }
        System.out.println();
    }
}
