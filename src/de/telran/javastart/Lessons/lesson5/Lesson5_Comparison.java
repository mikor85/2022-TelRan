package de.telran.javastart.Lessons.lesson5;

public class Lesson5_Comparison {
    public static void main(String[] args) {

        // операторы сравнения comparison operators
        // <  <=    >  >=    !=     ==

        int i = 2;

        System.out.println("i == 2 - это " + (i==2));
        System.out.println("i=2 - это " + (i=2));
        System.out.println("Не путать эти операторы!!!");

        System.out.println("----------");

        System.out.println(isDividedBy7(49));
        System.out.println(isDividedBy7(51));


        // условный оператор if   else if   else

        System.out.println("----------");

        int balance = 0;

        if (balance > 0)
        {
            System.out.println("Balance " + balance + " is positive");
        } else if (balance == 0) {
            System.out.println("Balance " + balance + " is zero");
        } else {
            System.out.println("Balance " + balance + " is not positive");
        }

        System.out.println("----------");
        System.out.println(analyzeSaunaTemperature(35));

        System.out.println("----------");
        System.out.println("Compare 3 and 15: " + maxFromTwoNumbers(3, 15));
        System.out.println("Compare 5 and 5: " + maxFromTwoNumbers(5, 5));

        System.out.println("----------");
        System.out.println("Is 49 divided by 5 and 7: " + isDividedBy5AndBy7(49));
        System.out.println("Is 140 divided by 5 and 7: " + isDividedBy5AndBy7(140));

        int age = 33;
        int income = 30_000;

        if (age > 30 && income > 25_000)
        {
            System.out.println("----------");
            System.out.println("Даём кредит!");
        }

    }

    // проверка делимости числа на 7
    public static boolean isDividedBy7 (int number)
    {
        int reminder = number % 7;
        return reminder == 0;
    }

    // анализ температур в сауне
    public static String analyzeSaunaTemperature (int t)
    {
        if (t > 80)
        {
            return "Супер горячо!";
        } else if (t > 60)
        {
            return "Замечательно";
        } else if (t > 40)
        {
            return "Терпимо";
        } else {
            return "Не сауна :(";
        }
    }

    // сравнение двух числел и вывод большего из них
    public static int maxFromTwoNumbers (int a, int b)
    {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // функция возвращается число если оно делится без остатка на 5 и на 7
    public static boolean isDividedBy5AndBy7 (int number)
    {
        return ((number % 5) == 0) & ((number % 7) == 0);
    }
}