package de.telran.javastart.lesson6;

public class Lesson6_Homework {
    public static void main(String[] args) {

        /* Домашнее задание:
Посмотреть книжку Schildt - Java a beginners guide главы с 1 по 3 в свободном режиме. */

        System.out.println("Задание №1:");
        printAllNumbersFromAtoB(105, 120, 5);
        System.out.println("----------");

        System.out.println("Задание №2:");
        System.out.println("Сумма чисел от A до B: " + sumFromAtoB(1, 3, 1));
        System.out.println("Сумма чисел от A до B: " + sumFromAtoB(5, 6, 5));
        System.out.println("Сумма чисел от A до B: " + sumFromAtoB(10, 12, 2));
        System.out.println("----------");

        System.out.println("Задание №3:");
        printAllNumberFrom1toA(26);
        System.out.println("----------");

        System.out.println("Задание №4:");
        System.out.println("Маша, Петя и Вася выдадут 1430 кредитов за " + monthsQuantity1430Credits(50) + " мес.");
        System.out.println("----------");

        System.out.println("Задание №5:");
        fibonacciNumbers(100);
        System.out.println("----------");

        System.out.println("Задание №6:");
        multiplicationTable(1, 9);
    }

    // 1. написать функцию которая принимает на вход три целых числа A, B, C и распечатывает все числа от A до B с шагом С (A < B и C > 0)
    public static void printAllNumbersFromAtoB (int a, int b, int c)
    {
        int numberId = 1;
        while (a <= b)
        {
            System.out.println("Число " + numberId + ": " + a);
            a += c;
            numberId = numberId + 1;
        }
    }

    // 2. написать функцию которая принимает на вход три целых числа A, B, C и возвращает сумму чисел от A до B с шагом C (A < B и C > 0)
    public static int sumFromAtoB (int a, int b, int c)
    {
        int resultSUm = 0;
        // TODO посчитать сумму
        while (a <= b)
        {
            resultSUm += a;
            a += c;
        }
        return resultSUm;
    }

    // 3. написать функцию которая принимает на вход целое число A и перебирает все числа от 1 до A и печатает только те из них, которые делятся или на 5, или на 7 или на 13 без остатка
    public static void printAllNumberFrom1toA (int a)
    {
        int i = 1;
        int numberId = 1;
        while (i <= a)
        {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0)
            {
                System.out.println("Число " + numberId + ": " + i);
                numberId = numberId + 1;
            }
            i++;
        }
    }

    // 4. * Маша выдает в месяц 50 кредитов. Петя выдает в месяц 0.8 от Маши и Вася выдает в месяц 0.9 от Пети. За сколько месяцев они вместе выдадут 1430 кредитов? Используйте while.
    public static int monthsQuantity1430Credits (int mashaCredits)
    {
        double petiaCredits = mashaCredits * 0.8;
        double vasiaCredits = petiaCredits * 0.9;
        double monthlyCredits = mashaCredits + petiaCredits + vasiaCredits;
        double sumOfCredits = 0;
        int monthQuantity = 0;
        while (sumOfCredits <= 1430)
        {
            monthQuantity++;
            sumOfCredits += monthlyCredits;
        }
        return monthQuantity;
    }

    // 5. * Распечатайте все числа Фибоначчи от 1 до 100
    public static void fibonacciNumbers (int limitNum)
    {
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci number 1: " + a);
        System.out.println("Fibonacci number 2: " + b);
        int c = a + b;
        a = b;
        b = c;
        int counterNum = 3;
        while (c <= limitNum)
        {
            System.out.println("Fibonacci number " + counterNum + ": "  + c);
            counterNum = counterNum + 1;
            c = a + b;
            a = b;
            b = c;
        }
    }

    // 6. ** Вывести на экран таблицу умножения. 1*1=1        1*2=2 ...    9*9=81 . Используйте while внутри while.
    public static void multiplicationTable (int start, int end)
    {
        while (start <= end)
        {
            int i = 1;
            while (i <= 9)
            {
                System.out.println(start + " * " + i + " = " + start * i);
                i = i + 1;
            }
            start = start + 1;
            System.out.println("----------");
        }
    }
}
