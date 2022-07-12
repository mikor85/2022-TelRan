package de.telran.javastart.Lessons.lesson18.DegreesConverter;

public class AppConverter {
    public static void main(String[] args) {
        DegreesConverter temp1 = new FahrenheitConverter(0);
        System.out.println(temp1.getTemp() + " " + "degrees Celsius equals " +
                temp1.convert() + " degrees Fahrenheit");

        DegreesConverter temp2 = new FahrenheitConverter(20);
        System.out.println(temp2.getTemp() + " " + "degrees Celsius equals " +
                temp2.convert() + " degrees Fahrenheit");

        DegreesConverter temp3 = new KelvinConverter(0);
        System.out.println(temp3.getTemp() + " " + "degrees Celsius equals " +
                temp3.convert() + " degrees Kelvin");

        DegreesConverter temp4 = new KelvinConverter(25);
        System.out.println(temp4.getTemp() + " " + "degrees Celsius equals " +
                temp4.convert() + " degrees Kelvin");

        DegreesConverter temp5 = new CelsiusConverter(0);
        System.out.println(temp5.getTemp() + " " + "degrees Celsius equals " +
                temp5.convert() + " degrees Celsius");

        DegreesConverter temp6 = new CelsiusConverter(20);
        System.out.println(temp6.getTemp() + " " + "degrees Celsius equals " +
                temp6.convert() + " degrees Celsius");

        ConverterFabric fabric = new ConverterFabric();
        DegreesConverter c2f = fabric.getConverter('F', 30);
        System.out.println(c2f.convert());

    }
}
