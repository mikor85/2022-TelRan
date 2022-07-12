package de.telran.javastart.Lessons.lesson19;

import de.telran.javastart.Lessons.lesson18.Auto.Auto;

import java.util.Arrays;

public class Lesson19 {
    public static void main(String[] args) {
        Auto mazda = new Auto("Mazda", 2016, "Silver");
        swapAuto(mazda);
        System.out.println(mazda);

        // String
        // фактически он представляет собой массив символов, как бы массив char
        // final - от него нельзя пронаследоваться
        // immutable - нет возможности поменять его состоятние

        String s1 = "Hello world";
        String s2 = "Hello world";
        // кэш строк, в котором хранятся все экземпляры,
        // Ява вначале сравнивает создаваему строку с уже существующими в кэше
        System.out.println(s1 == s2);

        // строку можно создавать разными способами
        String s3 = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});
        String s4 = new String("Hello world");  // создается новый экземпляр

        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        char a = 'a';
        System.out.println(a); // a
        System.out.println(a + 0); // распечатается индекс символа

        // chatAt -> char
        System.out.println(s4.charAt(0)); // H

        // concat -> String - складывает две строки
        System.out.println(s4.concat(s3).concat(s2).concat(s1));
        System.out.println(s4 + s3);

        // contains -> boolean
        System.out.println(s1.contains("ell")); // true

        // startsWith, endsWith -> boolean
        System.out.println(s1.startsWith("Hell"));  // true

        // equalsIgnoreCase -> boolean - сравнение строк
        System.out.println("hello".equalsIgnoreCase("Hello"));  // true

        //                012356
        // indexOf -> int Hello world
        System.out.println(s1.indexOf("wo"));  // 6 - возвращает позицию, с которой начинается часть строки
        System.out.println(s1.indexOf("l", 9));  // fromIndex - указываем, начиная с какой позиции искать

        //                   01234567890
        //lastIndexOf -> int Hello world
        System.out.println(s1.lastIndexOf("l", 6));

        // length -> int - длина строки
        System.out.println(s1.length());  // 11

        // split -> String [] - разбивает строку по шаблону
        System.out.println(
                Arrays.toString(s1.split(" "))  // "Hello", "world"
        );

        System.out.println(
                Arrays.toString(s1.split("l"))  // "He", " ", "o" "wor", "d"
        );

        System.out.println(
                Arrays.toString(s1.split("[er]"))  // [H, llo wo, ld]
        );

        // toCharArray -> char[] - разбивает на массив символов
        System.out.println(
                Arrays.toString(s1.toCharArray())  // [H, e, l, l, o,  , w, o, r, l, d]
        );

        // toUpperCase, toLowerCase -> String - меняет регистр
        System.out.println(s1.toUpperCase());  // HELLO WORLD

        // subString -> String
        // 01234567890
        // Hello world
        System.out.println(s1.substring(3, 7));  // lo w

        // replace -> String - замена части символов в строке
        System.out.println(s1.replace("world", "WORLD"));  // Hello WORLD
        // replaceALl -> String - меняет всю встроку
        System.out.println(s1.replaceAll("l", "L"));  // HeLLo worLd

        // (2^32 -1)/2 ~ 2^32 - максимальная длина строки

        System.out.println(reverseStringVer1(s1));
        System.out.println(reverseStringVer2(s1));

    }  // конец main

    // напишите функцию, которая принимает на вход строку и возвращает перевернутую
    public static String reverseStringVer1(String s) {
        String sSource = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sSource += s.charAt(i);
        }
        return sSource;
    }

    public static String reverseStringVer2(String s) {
        char [] r = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            r[s.length() - i - 1] += s.charAt(i);
        }
        return new String(r);
    }


    public static void swapAuto(Auto a) {
//        Auto fiat = new Auto("Fiat", 2021, "white");
//        a = fiat;
        a.setMaker("Rolls-Royce");
    }
}
