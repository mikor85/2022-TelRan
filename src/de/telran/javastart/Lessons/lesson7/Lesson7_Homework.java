package de.telran.javastart.Lessons.lesson7;

import java.math.BigDecimal;

public class Lesson7_Homework {
    public static void main(String[] args) {

        // Задание №1.1
        System.out.println("Задание №1.1:");
        printNumbersBetweenAB(5, 10, 2);
        System.out.println("----------");

        // Задание №1.2
        System.out.println("Задание №1.2:");
        System.out.println(sumBetweenAB(2, 4, 2));
        System.out.println("----------");

        // Задание №1.3
        System.out.println("Задание №1.3:");
        allNumDividedBy5or7or13(13);
        System.out.println("----------");

        // Задание №2
        System.out.println("Задание №2:");
        System.out.println(finalCredit(BigDecimal.valueOf(1000), 1, 10));
        System.out.println("----------");

        // Задание №3
        System.out.println("Задание №3:");
        System.out.println(factorial(14));
        System.out.println("----------");

        // Задание №4
        System.out.println("Задание №4:");
        System.out.println(telButtonNumber('m'));
        System.out.println("----------");

        // Задание №5
        System.out.println("Задание №5:");
        System.out.println(calculator(2, 3, '/'));
        System.out.println("----------");

        // Задание №6
        System.out.println("Задание №6:");
        System.out.println(inverseName("Петя"));
        System.out.println("----------");

        // Задание №7
        System.out.println("Задание №7:");
        printPyramid(3);
    }

    // 1. Проделать 1 2 3 пункты предыдущего ДЗ с помощью for

    // 1.1. написать функцию которая принимает на вход три целых числа A, B, C и распечатывает все числа от A до B с шагом С (A < B и C > 0)

    public static void printNumbersBetweenAB(int a, int b, int c) {
        for (int i = a; i <= b; i += c) {
            System.out.println(i);
        }
    }

    // 1.2. написать функцию которая принимает на вход три целых числа A, B, C и возвращает сумму чисел от A до B с шагом C (A < B и C > 0)

    public static int sumBetweenAB(int a, int b, int c) {
        int sum = 0;
        for (; a <= b; sum += a, a += c)
            ;
        return sum;
    }

    // 1.3. написать функцию которая принимает на вход целое число A и перебирает все числа от 1 до A и печатает только те из них, которые делятся или на 5, или на 7 или на 13 без остатка

    public static void allNumDividedBy5or7or13(int a) {
        if (a > 4) {
            for (int i = 1; i <= a; i++) {
                if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0)
                    System.out.println(i);
            }
        } else System.out.println("Нет таких чисел в заданном диапазоне");
    }

    // 2. Напишите функцию для расчета "сложных" процентов - должна принимать на вход сумму, процент и количество лет. Должна возвращать сумму по окончании вклада.

    public static BigDecimal finalCredit(BigDecimal startCredit, double percent, int years) {
        BigDecimal pYears = BigDecimal.valueOf(percent / 100 + 1);
        return startCredit.multiply(pYears.pow(years));
    }

    // 3. Напишите функцию возвращающую факториал переданного в нее целого числа. Пример: 4! = 1*2*3*4 = 24

    public static long factorial(int number) {
        long factorialValue = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                factorialValue *= i;
            }
        }
        return factorialValue;
    }

    // 4. Напишите функцию, дешифрующую ввод с телефона - принимает на вход char, возвращает целое. Пример: A,B,C - > 2; J,K,L -> 5

    public static int telButtonNumber(char buttonLetters) {
        String buttonLettersConvert = String.valueOf(buttonLetters);
        String buttonLetterSmall = buttonLettersConvert.toLowerCase();
        return switch (buttonLetterSmall) {
            case "a", "b", "c" -> 2;
            case "d", "e", "f" -> 3;
            case "g", "h", "i" -> 4;
            case "j", "k", "l" -> 5;
            case "m", "n", "o" -> 6;
            case "p", "q", "r", "s" -> 7;
            case "t", "u", "v" -> 8;
            case "w", "x", "y", "z" -> 9;
            case "+" -> 0;
            default -> 1;
        };
    }

    // 5. Напишите функцию калькулятор - принимает на вход два double и char c операцией - * / + - Возвращает результат операции.

    public static double calculator(double a, double b, char action) {
        double result = 1;
        switch (action) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }

    // 6. * Напишите функцию, переворачивающую строку - пример: Петя -> ятеП

    public static String inverseName(String rightName) {
        int symbolCounter = rightName.length();
        String result = "";
        while (symbolCounter > 0) {
            result += rightName.substring(symbolCounter - 1, symbolCounter);
            symbolCounter--;
        }
        return result;
    }

    // 7. * Напишите функцию которая рисует пирамидку заданной высоты - пример для числа 4

    public static void printPyramid(int rowNumber) {
        // final variables
        final char space = ' ';
        final char quotes = '\u0022';
        final char newLine = '\n';
        final char star = '*';

        int spaceCounter = rowNumber - 1;               // 1
        int starCounter = 1;                            // 3

        for (int i = 1; i <= rowNumber; i++) {

            // TODO циклы для вывода кол-ва пробелов и звездочек
            for (int j = 1; j <= spaceCounter; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= starCounter; k++) {
                System.out.print(star);
            }
            spaceCounter--;
            starCounter += 2;
            System.out.println(newLine);
        }
    }
}
