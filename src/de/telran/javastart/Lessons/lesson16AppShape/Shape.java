package de.telran.javastart.Lessons.lesson15;

//     Абстрактный класс Shape - обладает полем char symbol и абстрактным методом void draw().
//     Символ это то, что нужно печатать на экране, а метод draw() это то, что должно это рисовать.

abstract public class Shape {

    // Поля
    char symbol;

    // Методы
    abstract public void draw();
}
