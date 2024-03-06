package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

       public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        boolean temp = false;

        while (!temp) {
            try {
                float temperatura= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la Temperatura"));

                float fahrenheit = ConversorTemperaturas.centigradosAFharenheit(temperatura); // Corregido el nombre del método
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

                float reamur = ConversorTemperaturas.centigradosAReamur(temperatura);
                System.out.println("Temperatura en Reamur: " + reamur);
                temp = true;
            } catch (TemperaturaErradaExcepcion e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());

            }
        }
    }
    
}
