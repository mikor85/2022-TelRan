package de.telran.javastart.Lessons.lesson18.MyTime;

// 2. Напишите класс MyTime, в котором будут часы, минуты и секунды.
// Напишите конструктор и геттеры. Напишите операцию сравнения, toString, и добавления и вычитания для MyTime.
// Пример: MyTime(2, 3, 1) - MyTime(1, 1, 1) -> MyTime(1, 2, 0).

import de.telran.javastart.Lessons.lesson17Fraction.Fraction;

public class MyTime {
    private int h = 0;
    private int min = 0;
    private int s = 0;


    // Constructors
    public MyTime(int h, int min, int s) {
        this.h = h;
        this.min = min;
        this.s = s;
    }

    // Getters and Setters
    public int getH() {
        return h;
    }

    public int getMin() {
        return min;
    }

    public int getS() {
        return s;
    }

    // Methods
    @Override
    public boolean equals(Object time) {
        if (!(time instanceof MyTime)) {
            return false;
        }
        return getH() == ((MyTime) time).getH() &&
                getMin() == ((MyTime) time).getMin() &&
                getS() == ((MyTime) time).getS();
    }

    @Override
    public String toString() {
        return h + " h" + " " +
                min + " min" + " " +
                s + " sec";
    }

    // Time addition
    public MyTime addition(MyTime time) {
        int h = getH() + time.getH();
        int m = getMin() + time.getMin();
        int s = getS() + time.getS();
        return new MyTime(h, m, s);
    }

    // Time subtraction
    public MyTime subtraction(MyTime time) {
        int h = getH() - time.getH();
        int m = getMin() - time.getMin();
        int s = getS() - time.getS();
        return new MyTime(h, m, s);
    }
}
