package de.telran.javastart.Lessons.lesson4;

public class Lesson4 {

    // char
    // String

    public static void main(String[] args) {
        char a = 'A';
        char b = 'b';
        char c = 99;  // каждому символу соответствует свой номер

        char euro = '\u20ac';
        char dollar = '\u0024';
        // unicode UTF-16

        String name = "Bob";

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("Euro=" + euro);
        System.out.println("Dollar=" + dollar);

        char space = ' ';
        char tab = '\t';
        char newLine = '\n';

        String space1 = " ";

        String firstName = "Max";
        String lastName = "Macron";
        int age = 38;

        System.out.println(firstName + space +   lastName + space +   age);
        System.out.println(firstName + tab +     lastName + tab +     age);
        System.out.println(firstName + newLine + lastName + newLine + age);
        System.out.println(firstName + space1 +  lastName + space1 +  age);

        String london = "London is a capital of Great Britain";

        System.out.println(london.length());  // длина строки, кол-во символов
        System.out.println(london.isEmpty()); // содержит ли символы строка

        String capital = london.substring(0, 6);  // не включая последний символ
        System.out.println(capital);

        System.out.println(london.substring(10));

        System.out.println(london.toUpperCase());  // верхний регистр символов в строке

        String data = "123456";

        int value = Integer.parseInt(data);
        System.out.println(value + 44);

        // распечатать нужные символы из строки
        System.out.println(
                Integer.parseInt("14 лет".substring(0, 2))
        );

        System.out.println(0 + 'A');

    }
}
