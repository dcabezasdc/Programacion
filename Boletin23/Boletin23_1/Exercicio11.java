
package boletin23_1;

public class Exercicio11 {
        
    public void contarCaracteres(String texto) {
        int letras = 0;
        int digitos = 0;
        int espacios = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                letras++;
            } else if (Character.isDigit(caracter)) {
                digitos++;
            } else if (Character.isWhitespace(caracter)) {
                espacios++;
            }
        }

        // Mostrar el resultado
        System.out.println("Número de letras: " + letras);
        System.out.println("Número de dígitos: " + digitos);
        System.out.println("Número de espacios en blanco: " + espacios);
    
}
}
