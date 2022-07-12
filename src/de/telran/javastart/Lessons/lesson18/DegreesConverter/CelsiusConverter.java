package de.telran.javastart.Lessons.lesson18.DegreesConverter;

public class CelsiusConverter implements DegreesConverter{
    private double temp;

    // Constructors
    public CelsiusConverter(double temp) {
        this.temp = temp;
    }

    // Getters and Setters
    @Override
    public double getTemp() {
        return temp;
    }

    // Methods
    @Override
    public double convert() {
        return temp;
    }
}
