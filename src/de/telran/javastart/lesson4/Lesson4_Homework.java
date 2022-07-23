package de.telran.javastart.lesson4;

import java.util.Scanner;

public class Lesson4_Homework {
    public static void main(String[] args) {

        // required variables

        final char space = ' ';
        final char quotes = '\u0022';
        final char newLine = '\n';


        // 1. Найдите и выведите на экран символы рубля и какой-нибудь из знаков зодиака на выбор (UTF-16).

        System.out.println("Задание №1:");

        char rubleSign1 = '\u20bd';
        System.out.println("Символ рубля 1:" + space + rubleSign1);
        char rubleSign2 = 0x20BD;
        System.out.println("Символ рубля 2:" + space + rubleSign2);
        char zodiacSign = '\u264f';
        System.out.println("Символ знака зодиака:" + space + zodiacSign);
        System.out.println();


        // 2. Напишите функцию которая принимает на вход три параметра - имя, фамилию и возраст и выводит их на экран в отдельной строке.

        printUserData("Dmitrij", "Mitrofanov", 36);

        Scanner in = new Scanner(System.in);

        System.out.println("Задание №2:");

        System.out.println("Введите имя, а затем нажмите ENTER: ");
        String firstName = in.nextLine();
        System.out.println("Введите фамилию, а затем нажмите ENTER: ");
        String secondName = in.nextLine();
        System.out.println("Введите возраст, а затем нажмите ENTER: ");
        int age = in.nextInt();

        System.out.println(firstName + space + secondName + space + age);


        // 3. Вырезать из строки "Вход запрещен" второе слово и заменить его на "разрешен".

        System.out.println("Задание №3:");

        String phraseEntryDenied = "Вход запрещён";
        String phraseEntryAllowed = "Вход разрешён";

        System.out.println("Введена строка:" + space + quotes + phraseEntryDenied + quotes + ".");
        /*String phraseEntryDenied = in.nextLine();*/

        System.out.println(phraseEntryDenied.substring(0, 4) + space + phraseEntryAllowed.substring(5));


        // 4. Напишите функцию которая принимает на вход строку и возвращает ее (return) в верхнем регистре.

        System.out.println("Задание №4:");

        System.out.println("Введите любую строку, а затем нажмите ENTER:");
        String anyString = in.nextLine();
        System.out.println(anyString.toUpperCase());


        // 5. Напишите функцию которая принимает на вход строку и символ и возвращает (return) строку, состоящую из: символ+строка+символ.

        System.out.println("Введите любую строку, а затем нажмите ENTER:");
        String anyStringVar2 = in.nextLine();
        System.out.println("Введите любую символ, а затем нажмите ENTER:");
        String anySymbolVar2 = in.nextLine();
        char anySymbol = quotes;

        System.out.println(anySymbolVar2 + anyStringVar2 + anySymbolVar2);

        in.close();
    }

    public static void printUserData (String firstName, String secondName, int age)
    {
        final char newLine = '\n';
        System.out.println(firstName + newLine + secondName + newLine + age);
    }

}
