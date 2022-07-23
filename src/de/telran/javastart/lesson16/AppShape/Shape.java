package de.telran.javastart.lesson16.AppShape;

//     Абстрактный класс Shape - обладает полем char symbol и абстрактным методом void draw().
//     Символ это то, что нужно печатать на экране, а метод draw() это то, что должно это рисовать.

abstract public class Shape {

    // Поля
    private char symbol;

    // Конструктор
    public Shape(char symbol) {
        this.symbol = symbol;
    }

    // Геттеры и сеттеры
    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // Методы
    abstract public void draw();

}
