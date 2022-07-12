package de.telran.javastart.Lessons.lesson18.DegreesConverter;

// 0 °C + 273,15 = 273,15 K
public class KelvinConverter implements DegreesConverter {
    private double temp = 0;

    // Constructors
    public KelvinConverter(double temp) {
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
        return temp + 273.15;
    }
}
