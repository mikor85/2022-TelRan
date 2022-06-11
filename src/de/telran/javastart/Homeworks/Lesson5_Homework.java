package de.telran.javastart.Homeworks;

public class Lesson5_Homework {
    public static void main(String[] args) {

        System.out.println("Задание №1:");
        System.out.println("Число положительное и делится на 3 без остатка: " + positiveAndDividedBy3Number(6));
        System.out.println("Число положительное и делится на 3 без остатка: " + positiveAndDividedBy3Number(10));
        System.out.println("Число положительное и делится на 3 без остатка: " + positiveAndDividedBy3Number(-5));
        System.out.println("----------");

        System.out.println("Задание №2:");
        System.out.println("Число находится в диапазоне от 150 до 180 и при этом четное: " + between150And180AndIsEvenNumber(175));
        System.out.println("Число находится в диапазоне от 150 до 180 и при этом четное: " + between150And180AndIsEvenNumber(150));
        System.out.println("----------");

        System.out.println("Задание №3:");
        System.out.println("День недели: " + nameOfDayOfWeek(1));
        System.out.println("День недели: " + nameOfDayOfWeek(23));
        System.out.println("----------");

        System.out.println("Задание №4:");
        System.out.println("Является ли год високосным?: " + isYearLeap(1900));
        System.out.println("Является ли год високосным?: " + isYearLeap(2004));
        System.out.println("Является ли год високосным?: " + isYearLeap(2020));
        System.out.println("----------");

        System.out.println("Задание №5:");
        System.out.println("Конвертированная сумма: " + currencyCalculator(10, 'M'));
        System.out.println("Конвертированная сумма: " + currencyCalculator(10, 'H'));
        System.out.println("Конвертированная сумма: " + currencyCalculator(10, 'D'));
        System.out.println("Конвертированная сумма: " + currencyCalculator(10, 'R'));
    }

    // 1. Написать функцию которая возвращает true если число положительное и делится на 3 без остатка
    public static boolean positiveAndDividedBy3Number (int number)
    {
        return number > 0 & number % 3 == 0;
    }

    // 2. Напишите функцию которая возвращает true если число находится в диапазоне от 150 до 180 и при этом четное
    public static boolean between150And180AndIsEvenNumber (int number)
    {
        if ((number >= 150) & (number <= 180) & (number % 2 == 0))  // можно сделать без if
        {
            return true;
        }
        return false;
    }

    // 3. Напишите функцию которая принимает на вход номер дня недели (1-7) и возвращает строку с названием дня недели (пример: 7 -> "Воскресенье")
    public static String nameOfDayOfWeek (int dayNumber)
    {
        String result = "==> Задан неверный номер. Введите номер в интервале от 1 до 7 <==";
        switch (dayNumber){
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            }
        return result;
    }

    // 4.* Напишите функцию которая принимает на вход год и возвращает true если год високосный (пример: 2020 -> true)
    public static boolean isYearLeap (int year)
    {
        if (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0))
        {
            return true;
        }
        return false;
    }

    // 5.** Напишите функцию-калькулятор валюты которая принимает на вход сумму в евро и символ в какую валюту конвертировать (F - венгерские форинты, R - рубли, D - доллары США, для всех остальных конвертировать в монгольские тугрики). Возвращает сумму в другой валюте.
    public static double currencyCalculator (double currencyEuro, char currencyIdSym)
    {
        double hufEurRate = 378.35;  // F = HUF
        double rubEuroRate = 75.23;  // R = RUB
        double usdEurRate = 1.05;  // D = USD
        double mntEurRate = 3274.22;  // MNT

        switch (currencyIdSym){
            case 'F':
                return currencyEuro * hufEurRate;
            case 'R':
                return currencyEuro * rubEuroRate;
            case 'D':
                return currencyEuro * usdEurRate;
        }
        return currencyEuro * mntEurRate;
    }
}
