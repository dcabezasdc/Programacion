package boletin18_3;


public class ConversorTemperaturas {
    public static final float TEMPERATURAMINIMA = 80.0f;

    public static float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados > TEMPERATURAMINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser mayor de 80 ºC");

        }

        return 1.8f * centigrados + 32.4f;
    }

    public static float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados > TEMPERATURAMINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser mayor de 80 ºC");

        }

        return 0.8f * centigrados;
    }
}
