package de.telran.javastart.Lessons.lesson18.DegreesConverter;

public class AppConverter {
    public static void main(String[] args) {
        FahrenheitConverter temp1 = new FahrenheitConverter(0);
        System.out.println(temp1.getTemp() + " " + "degrees Celsius equals " +
                temp1.convert() + " degrees Fahrenheit");

        FahrenheitConverter temp2 = new FahrenheitConverter(20);
        System.out.println(temp2.getTemp() + " " + "degrees Celsius equals " +
                temp2.convert() + " degrees Fahrenheit");

        KelvinConverter temp3 = new KelvinConverter(0);
        System.out.println(temp3.getTemp() + " " + "degrees Celsius equals " +
                temp3.convert() + " degrees Kelvin");

        KelvinConverter temp4 = new KelvinConverter(20);
        System.out.println(temp4.getTemp() + " " + "degrees Celsius equals " +
                temp4.convert() + " degrees Kelvin");

    }
}
