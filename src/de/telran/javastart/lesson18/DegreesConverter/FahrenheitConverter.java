package de.telran.javastart.lesson18.DegreesConverter;

// (0 °C × 9/5) + 32 = 32 °F
public class FahrenheitConverter implements DegreesConverter {
    private double temp = 0;

    // Constructors
    public FahrenheitConverter(double temp) {
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
        return (temp * 9 / 5) + 32;
    }

}
