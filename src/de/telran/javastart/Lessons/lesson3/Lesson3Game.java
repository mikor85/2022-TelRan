package de.telran.javastart.Lessons.lesson3;

public class Lesson3Game {
    public static void main(String[] args) {
        int i5 = 5;
        int i2 = 2;
        int var3 = i5 / i2;
        System.out.println("var3: " +  var3);

        double d5 = 5;
        double d2 = 2;
        double var6 = d5 / d2;
        System.out.println("var6: " + var6);

        double var7 = i5 / i2; // тип значения обусловлен типом переменных водящих в операцию
        System.out.println("var7: " + var7);

        double var8 = ((double) i5 / i2);
        System.out.println("var8: " + var8);

        double var9 = i5 / d2;
        System.out.println("var9: " + var9);

        int var10 = (int) d5 / i2;
        System.out.println("var10: " + var10);

        double var11 = ((int) d5) / i2;
        System.out.println("var11: " + var11);

        System.out.println("" + 5.0 / i2);

        // объявление констант
        final double pi = 3.14;

        /* char a = 'A';
        char b = 'b';
        String name = "Dina" */
    }

    // Д-З:
    // 1. написать функцию для вычисления площади элипса
    // 2. написать функцию для вычисления длины окружности
    // 3. по сложным процентам
}
