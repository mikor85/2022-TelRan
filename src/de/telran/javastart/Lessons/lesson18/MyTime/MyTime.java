package de.telran.javastart.Lessons.lesson18.MyTime;

// 2. Напишите класс MyTime, в котором будут часы, минуты и секунды.
// Напишите конструктор и геттеры. Напишите операцию сравнения, toString, и добавления и вычитания для MyTime.
// Пример: MyTime(2, 3, 1) - MyTime(1, 1, 1) -> MyTime(1, 2, 0).

import de.telran.javastart.Lessons.lesson17Fraction.Fraction;

public class MyTime {
    private int h = 0;
    private int m = 0;
    private int s = 0;


    // Constructors
    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    // Getters and Setters
    public int getH() {
        return h;
    }

    public int getMin() {
        return m;
    }

    public int getS() {
        return s;
    }

    // Methods
    @Override
    public boolean equals(Object t) {
        if (!(t instanceof MyTime)) {
            return false;
        }
        return getH() == ((MyTime) t).getH() &&
                getMin() == ((MyTime) t).getMin() &&
                getS() == ((MyTime) t).getS();
    }

    @Override
    public String toString() {
        return h + " h" + " " +
                m + " min" + " " +
                s + " sec";
    }

    // Time addition
    public MyTime addition(MyTime t) {
        int secs = s + t.s;
        int mins = secs / 60;
        secs = secs % 60;
        mins += m;
        mins += t.m;
        int hours = mins / 60 + h + t.h;
        mins %= 60;
        s = secs;
        m = mins;
        h = hours;
        return new MyTime(h, m, s);
    }

    // Time subtraction
    public MyTime subtraction(MyTime t) {
        int secs = s - t.s; // 40 + 40 = 1m + 20s
        int mins = m - t.m;
        if (secs < 0) {
            secs = 60 + secs;
            mins--;
        }
        int hours = h - t.h;
        if (mins < 0) {
            mins = 60 + mins;
            hours--;
        }
        s = secs;
        m = mins;
        h = hours;
        return new MyTime(h, m, s);
    }
}
