package de.telran.javastart.Lessons.lesson16AppShape;

//     Класс Picture который наследует Shape и дополнительным полем которого является массив фигур Shape [] array.
//     Метод draw должен рисовать все эти фигуры из массива по порядку.

public class Picture extends Shape{
    // Поля
    Shape[] array;

    // Конструктор
    public Picture(char symbol, Shape[] array) {
        super(symbol);
        this.array = array;
    }

    // Геттеры и Сеттеры
    public Shape[] getArray() {
        return array;
    }

    public void setArray(Shape[] array) {
        this.array = array;
    }

    //Методы
    @Override
    public void draw() {
        for (Shape shape : array) {
            shape.draw();
        }
    }
}
