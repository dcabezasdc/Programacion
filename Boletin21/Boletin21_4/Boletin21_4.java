
package boletin21_4;

import javax.swing.JOptionPane;


public class Boletin21_4 {

    
  public static void main(String[] args) {

        // Solicitar el número del DNI
        
        int numeroDNI =Integer.parseInt(JOptionPane.showInputDialog("Introduzca el DNI"));

        // Calcular el resto de la división por 23
        int resto = numeroDNI % 23;

        // Obtener la letra asociada al resto
        char letraNIF = obtenerLetraNIF(resto);

        // Mostrar el NIF completo
        JOptionPane.showMessageDialog(null,"El NIF completo es: " + numeroDNI + letraNIF);
    }

    // Método para obtener la letra asociada al resto en la tabla
    private static char obtenerLetraNIF(int resto) {
        char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return tablaLetras[resto];
    }
}
