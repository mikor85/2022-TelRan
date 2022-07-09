package de.telran.javastart.Lessons.lesson17Fraction;

// Дописать класс Fraction - добавить операции вычитания и деления дробей,
// а также функцию сокращения числителя и знаменателя на все их общие делители. Пример 48/96 -> 1/2.

public class Fraction {
    private int num;  // числитель
    private int den;  // знаменатель

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);

        f1.addition(f2).print();
        f1.subtraction(f2).print();
        f1.multiply(f2).print();
        f1.division(f2).print();
    }

    // Конструктор
    public Fraction(int num, int den) {
        int n = gcd(num, den);
        if(n != 1)
        {
            num /= n;
            den /= n;
        }
        this.num = num;
        this.den = den;
    }

    // Геттеры и сеттеры
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    // Методы

    // Сложение двух дробей
    public Fraction addition(Fraction f) {
        int n = getNum() * f.getDen() + getDen() * f.getNum();
        int d = getDen() * f.getDen();
        return new Fraction(n, d);
    }

    // Вычитание двух дробей
    public Fraction subtraction(Fraction f) {
        int n = getNum() * f.getDen() - getDen() * f.getNum();
        int d = getDen() * f.getDen();
        return new Fraction(n, d);
    }

    // Перемножение двух дробей
    public Fraction multiply(Fraction f) {
        int n = getNum() * f.getNum();
        int d = getDen() * f.getDen();
        return new Fraction(n, d);
    }

    // Деление двух дробей
    public Fraction division(Fraction f) {
        int n = getNum() * f.getDen();
        int d = getDen() * f.getNum();
        return new Fraction(n, d);
    }

    // Сокращение дробей
    public Fraction reduction() {
        int n = getNum();
        int d = getDen();
        int commonFactor = getCommonFactor(n, d);
        if (commonFactor != 0) {
            n = n / commonFactor;
            d = d / commonFactor;
        }
        return new Fraction(n, d);
    }

    // Поиск НОД
    public static int getCommonFactor(int a, int b) {
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }

    public static int gcd(int f, int s)
    {
        // f          s     r
        // 1071 = 2 × 462 + 147.
        // f          s
        // 462 = 3 × 147 + 21.
        int r = f % s;
        while (r != 0)
        {
            f = s;
            s = r;
            r = f % s;
        }
        return s;
    }


    // Распечатать дробь
    public void print() {
        if (num != den) {
            System.out.println(num + "/" + den);
        } else {
            System.out.println(num);
        }
    }
}

