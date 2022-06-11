package de.telran.javastart.Homeworks;

import java.util.Arrays;
import java.util.Stack;

public class Lesson12_Homework {
    public static void main(String[] args) {

        // Task Nr.1
        System.out.println("Task Nr.1:");
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        int indexTask1 = 4;
        System.out.println("Present array is: " + Arrays.toString(arr1));
        System.out.println("New array without " + indexTask1 + " element is: " + Arrays.toString(delete(arr1, indexTask1)));
        System.out.println("----------");

        // Task Nr.2
        System.out.println("Task Nr.2:");
        String text1 = "(asd(Asdsd)))+((77+321)654)";
        String text2 = "(вы(уу)нн(ыы))555()";
        System.out.println(text1);
        System.out.println("Brackets are balanced: " + checkBrackets(text2));
        System.out.println("----------");
        System.out.println("Brackets are balanced: " + isBracketsBalancedUsingStack(bracketString(text2)));
        System.out.println("----------");
        System.out.println("Brackets are balanced: " + isBracketsBalancedWithoutStack(bracketString(text2)));
        System.out.println("----------");

        // Task Nr.3
        System.out.println("Task Nr.3:");
        int[] arr31 = new int[]{1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 10};
        int[] arr32 = new int[]{1, 5, 7, 12, 15};
        int number = 0;
        System.out.println("Present array is: " + Arrays.toString(arr32));
        System.out.println("Number " + number + " has Index Pos " + findPlaceOfNumber(arr32, number));
        System.out.println("----------");

        // Task Nr.4
        System.out.println("Task Nr.4:");
        printJava();
        System.out.println("----------");

    }

    // 1. Написать операцию public static int [] delete(int index).
    // Пример: начальный массив [10,20,30,40] удаляем элемент с индексом 2, получаем массив [10, 20, 40]

    public static int[] delete(int[] a, int index) {
        int[] returnArr = new int[a.length - 1];
        for (int i = 0; i < index; i++) {
            returnArr[i] = a[i];
        }
        for (int i = index + 1; i < a.length; i++) {
            returnArr[i - 1] = a[i];
        }
        return returnArr;
    }

    // 2. Напишите функцию проверяющую правильность расстановки скобок с строке, должна возвращать boolean.
    // Примеры: "(())" -> true, "(1+(2-3))" -> true, "((x)" -> false, ")(" -> false

    public static boolean checkBrackets(String text) {
        int level = 0;  // кол-во незакрытых открывающих скобок
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    level++; // встретили открывающую скобку
                    break;
                case ')':
                    if (level == 0) {  // если не найдено незакрытых открывающих скобок
                        return false;
                    } else {
                        level--;  // уже имеются незакрытые открывающие скобки, поэтому уменьшаем их кол-во
                    }
                    break;

            }
        }
        return level == 0;

    }

    public static boolean isBracketsBalancedUsingStack(String text) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stack.push(text.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char pop_value = stack.pop();
                if (text.charAt(i) == ')' && pop_value != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isBracketsBalancedWithoutStack(String text) {
        String stackString = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stackString += text.charAt(i);
            } else if (stackString.equals("")) {
                return false;
            } else {
                char popValue = stackString.charAt(stackString.length() - 1);
                String stringTemp = "";
                for (int j = 0; j < stackString.length() - 1; j++) {
                    stringTemp += stackString.charAt(j);
                }
                stackString = stringTemp;
                if (text.charAt(i) == ')' && popValue != '(')
                    return false;
            }
        }
        return stackString.equals("");
    }

    // убираем лишние символы, оставляем в строке только скобки
    public static String bracketString(String text) {
        int countOpenBrackets = 0;
        int countCloseBrackets = 0;
        char openPar = '(';
        char closePar = ')';
        String stringPar = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == openPar || text.charAt(i) == closePar) {
                stringPar += text.charAt(i);
            }
            if (text.charAt(i) == openPar) {
                countOpenBrackets++;
            } else if (text.charAt(i) == closePar) {
                countCloseBrackets++;
            }
        }
        return stringPar;
    }

    // 3. Написать функцию которая принимает отсортированный массив и число.
    // Возвращает позицию числа в массиве, если число там уже есть.
    // Либо индекс, куда это число можно вставить не нарушив порядок сортировки массива
    // findPlace({1,5,7,12,15}, 7) ->2   findPlace({1,5,7,12,15}, 4) -> 1

    public static int findPlaceOfNumber(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (number <= a[i]) {
                return i;
            }
        }
        return a.length;
    }

    // 4. Напишите функцию, которая напечатает на экране
    //      J     a   v           v    a
    //      J    a a   v       v    a  a
    //J    J  aaaaa   V V    aaaaa
    //JJJ  a         a   V     a         a

    public static void printJava() {
        String javaText1 = "      J     a   v           v    a";
        String javaText2 = "      J    a a   v       v    a  a";
        String javaText3 = "J    J  aaaaa   V V    aaaaa";
        String javaText4 = "JJJ  a         a   V     a         a";
        System.out.println(javaText1);
        System.out.println(javaText2);
        System.out.println(javaText3);
        System.out.println(javaText4);
    }

}
