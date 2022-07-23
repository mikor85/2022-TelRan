package de.telran.javastart.lesson19;

//  ДЗ Basic Java:

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Lesson19_Homework {
    public static void main(String[] args) {

        System.out.println("Task No. 1:");
        String str1 = "AlLa";
        System.out.println(isPalindrome(str1));
        String str2 = "Satas";
        System.out.println(isPalindrome(str2));
        System.out.println("----------");

        System.out.println("Task No. 2:");
        System.out.println(stringContainsSubstring("Hello HelloloHeHe", "lo"));
        System.out.println("----------");

        System.out.println("Task No. 3:");
        System.out.println(numberOfWordsInString("Hello world"));
        System.out.println("----------");

        System.out.println("Task No. 4:");
        System.out.println(getStringUpToN("Hello world ", 10));
        System.out.println("----------");

        System.out.println("Task No. 5:");
        System.out.println(getPenultimateWordInString("Олени идут на север"));
        System.out.println("----------");

    }
    //   1. Написать метод, который принимает на вход строку и возвращает true
    //   если эта строка является полиндромом (игнорируя регистр). Пример: "Алла" -> true.

    // satas    alla
    // 01234    0123
    public static boolean isPalindrome(String s) {
//        String newS = "";
//        for (int i = 0; i < s.length(); i++) {
//            newS += s.charAt(s.length() - 1 - i);
//        }
//        return s.equalsIgnoreCase(newS);

        String newS = s.toLowerCase();
        int minIndex = 0;
        int maxIndex = s.length() - 1;
        while (minIndex < maxIndex) {
            if (newS.charAt(minIndex) == newS.charAt(maxIndex)) {
                minIndex++;
                maxIndex--;
            } else return false;
        }
        return true;
    }

    //   2. Напишите метод, принимающий на вход строку и подстроку и
    //   возвращающий количество вхождений подстроки в строку. Пример: "Hello world", "l" -> 3.

    public static int stringContainsSubstring(String s, String subS) {
        int count = 0;
        for (int i = 0; i <= s.length() - subS.length(); i++) {
            int tempCount = 0;
            for (int j = 0; j < subS.length(); j++) {
                if (s.charAt(i + j) == subS.charAt(j)) {
                    tempCount++;
                } else break;
            }
            if (tempCount == subS.length()) {
                count++;
            }
        }
        return count;
    }

    //   3. * Напишите метод, который вернет количество слов в переданной в него строке.
    //   Считаем, что слова отделяются пробелами. Пример: "Hello world" -> 2.
    public static int numberOfWordsInString(String s) {
        int result = 0;
        char space = ' ';
        if (s.length() > 0) {
            result++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == space) {
                    result++;
                }
            }
        }
        return result;
    }

    //   4. ** Напишите метод, в который передается строка и число N.
    //   Метод возвращает строку, состоящую из начала исходной строки и полных слов,
    //   не превышающих по длине N символов. "Hello world guys", 11 -> "Hello world" . "Hello world guys", 6 -> "Hello".

    // 1234567890123456
    // Hello wo rld guys
    // 0123456789012345
    public static String getStringUpToN(String s, int N) {
        char space = ' ';
        String resString = "";
        if (s.charAt(N) == space) {
            for (int i = 0; i < N; i++) {
                resString += s.charAt(i);
            }
        } else {
            int count = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (s.charAt(i) == space) {
                    count = i;
                    break;
                }
            }
            if (count > 0) {
                for (int i = 0; i < count; i++) {
                    resString += s.charAt(i);
                }
            }
        }
        return resString;
    }

    //   5. * Напишите функцию, которая возвращает предпоследнее слово переданной в нее строки.
    //   Пример: "Олени идут на север" -> "на"
    public static String getPenultimateWordInString(String s) {
        String penWord = "";
        char space = ' ';
        int spaceCounter = 0;
        int indexCounter = 0;
        for (int i = s.length() - 1; spaceCounter < 2 && i >= 0; i--) {
            if (s.charAt(i) == space) {
                spaceCounter++;
                indexCounter = i;
            }
        }
        penWord = getWordFromIndex(s, indexCounter + 1);
        return penWord;
    }

    // метод возвращает слово, которое начинает с указанного индекса до пробела
    public static String getWordFromIndex(String s, int index){
        char space = ' ';
        String word = "";
        for (int i = index; s.charAt(i) != space; i++) {
            word += s.charAt(i);
        }
        return word;
    }
}