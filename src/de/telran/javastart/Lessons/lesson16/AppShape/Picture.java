package de.telran.javastart.Lessons.lesson16.AppShape;

//     Класс Picture который наследует Shape и дополнительным полем которого является массив фигур Shape [] array.
//     Метод draw должен рисовать все эти фигуры из массива по порядку.

public class Picture extends Shape {
    // Поля
    private Shape[] array;

    // Конструктор
    public Picture(Shape[] array) {
        super('0');
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
        for (Shape s : array) {
            s.draw();
        }
    }
}
