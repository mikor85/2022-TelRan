package de.telran.javastart.lesson18.DegreesConverter;

public class ConverterFabric {
    public DegreesConverter getConverter(char converter, double temp)
    {
        switch (converter)
        {
            case 'F':
                return new FahrenheitConverter(temp);
            case 'K':
                return new KelvinConverter(temp);
            default:
                return new CelsiusConverter(temp);
        }
    }
}

