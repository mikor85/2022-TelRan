package de.telran.javastart.Lessons;

public class Lesson5 {
    // напишите функцию sum, которая возвращает double и принимает на вход три числа double

    public static void main(String[] args) {

        // required variables

        final char space = ' ';
        final char quotes = '\u0022';
        final char newLine = '\n';


        System.out.println(threeNumbersSum(10, 30, 30));

        System.out.println(Math.pow(12, 2));


        // логический тип данных boolean: true и false
        boolean isSunny = true;  // false

        // логические операции
        // & - и and
        // | - или or
        // ! - не not
        // ^ - логическое xor

        // операция - &:
        System.out.println("&----------");
        System.out.println(true&true);  // true
        System.out.println(true&false);  // false
        System.out.println(false&false);  // false

        // операция - |
        System.out.println("|----------");
        System.out.println(true|true);  // true
        System.out.println(true|false);  // true
        System.out.println(false|false);  // false

        // операция - !
        System.out.println("!----------");
        System.out.println(!true);  // false
        System.out.println(!false);  // true

        // операция - ^
        System.out.println("^----------");
        System.out.println(true^true);  // false
        System.out.println(true^false);  // true
        System.out.println(false^false);  // false

    }

    public static double threeNumbersSum(double a, double b, double c)
    {
        return a + b + c;
    }
}
