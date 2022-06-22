package de.telran.javastart.Lessons.lesson15;

//     Класс Line  - наследует Shape, имеет дополнительный параметр int length - длина линии.
//     Метод draw в классе Line должен рисовать length символов.

public class Line extends Shape {

    // Поля
    int length;

    // Конструктор
    public Line(int length) {
        this.length = length;
    }

    // Методы
    @Override
    public void draw() {

    }
}
