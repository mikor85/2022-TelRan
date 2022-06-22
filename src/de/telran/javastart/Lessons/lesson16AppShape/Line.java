package de.telran.javastart.Lessons.lesson16AppShape;

//     Класс Line  - наследует Shape, имеет дополнительный параметр int length - длина линии.
//     Метод draw в классе Line должен рисовать length символов.

public class Line extends Shape {
    // Поля
    int length;

    // Конструктор
    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    // Геттеры и Сеттеры
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Методы
    @Override
    public void draw() {
        System.out.println("Line consists from " + length + " symbols " + symbol + ":");
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
