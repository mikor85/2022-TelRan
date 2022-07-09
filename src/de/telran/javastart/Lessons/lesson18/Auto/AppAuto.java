package de.telran.javastart.Lessons.lesson18.Auto;

public class AppAuto {
    public static void main(String[] args) {
        // Object toString equals

        // Object - встроенный в java класс, который является суперклассом для всех классов

        // Даже если класс ничего не расширяет, фактически он расширяет Object

        // Полезные функции в объекте:
        // toString - позволяет классу распечатать себя как ему нужно
        // equals - позволяет сравнить экземляры классов по значению

        Auto mazda = new Auto("Mazda", 2016, "Silver");
        System.out.println(mazda);

//        int [] a = new int[] {1,2,3};
//        int [] b = a;
//        System.out.println(a);
//        System.out.println(b);

        String hello = "     ";
        hello += mazda;
        System.out.println(hello);

        Auto[] park = getAutopark();
        System.out.println(contains(park, mazda));

    }

    public static boolean contains(Auto[] park, Auto a) {
        for (int i = 0; i < park.length; i++) {
            if (park[i].equals(a))
                return true;
        }
        return false;
    }

    public static Auto[] getAutopark() {
        Auto mazda = new Auto("Mazda", 2016, "Silver");
        Auto opel = new Auto("Opel", 2019, "White");
        Auto bentley = new Auto("Mazda", 2010, "Red");
        return new Auto[]{mazda, opel, bentley};
    }
}
