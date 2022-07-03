package de.telran.javastart.Lessons.lesson16MyArrayList;

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


    static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList(5);
        myArrayList1.set(1, 1);
        myArrayList1.set(2, 2);
        myArrayList1.set(3, 3);
        myArrayList1.set(4, 4);
        myArrayList1.printArray();
        System.out.println("Array size: " + myArrayList1.size());
        System.out.println(myArrayList1.get(1));
        myArrayList1.append(33);
        myArrayList1.printArray();
        System.out.println(myArrayList1.contains(33));
        System.out.println("--------------------");

        int[] array2 = new int[]{1, 2, 3};
        MyArrayList myArrayList2 = new MyArrayList(array2);
        myArrayList2.set(2, 55);
        myArrayList2.printArray();
        System.out.println("Array size: " + myArrayList2.size());
        System.out.println(myArrayList2.get(2));
        myArrayList2.append(44);
        myArrayList2.printArray();
        System.out.println(myArrayList2.contains(33));
        System.out.println("--------------------");

        myArrayList1.append(array2);
        myArrayList1.printArray();


    }
}
