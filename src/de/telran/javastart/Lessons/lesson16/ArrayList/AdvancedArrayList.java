package de.telran.javastart.Lessons.lesson16.ArrayList;

// Интерфейс - это набор методов, которые должны реализовать наследники этого интерфеса.
// Иными словами - это контракт, которому должны следовать все его дочение классы.


//  ДЗ:
//  1. Переписать проект с работниками и сделать Employee абстрактным.
//  2. Описать структуру классов:
//     a. Абстрактный класс Shape - обладает полем char symbol и абстрактным методом void draw(). Символ это то, что нужно печатать на экране, а метод draw() это то, что должно это рисовать.
//     b. Класс Line  - наследует Shape, имеет дополнительный параметр int length - длина линии. Метод draw в классе Line должен рисовать length символов.
//     c. Класс Rectangle - наследует Shape и имеет два дополнительных параметра - width и height - метод draw толжен нарисовать прямоугольник из символов.
//     d. Класс Picture который наследует Shape и дополнительным полем которого является массив фигур Shape [] array - метод draw должен рисовать все эти фигуры из массива по порядку.
//  3. Реализовать интерфейс AdvancedArrayList  - дописать класс MyArrayList.
//     a. * Добавить в интерфейс метод void append(int [] a) и дописать MyArrayList.


public interface AdvancedArrayList {
    void set(int index, int value);

    int get(int index);

    int size();

    void append(int value);

    void append(int[] a);

    void insert(int index, int value);
    //void insert(int index, int [] a);

    void delete(int index);
    //void delete(int index, int howMany);

    boolean contains(int value);

}
