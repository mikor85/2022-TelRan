package de.telran.javastart.lesson18.MyTime;

public class AppMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(2, 50, 40);
        System.out.println(time1);

        MyTime time2 = new MyTime(1, 45, 30);
        System.out.println(time2);

        MyTime time3 = new MyTime(1, 55, 45);
        System.out.println(time3);

        System.out.println(time3.equals(time2));

        System.out.println(time1.addition(time2));

        System.out.println(time1.subtraction(time3));
    }
}
