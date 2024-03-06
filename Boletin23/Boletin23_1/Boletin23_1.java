
package boletin23_1;

public class Boletin23_1 {

    public static void main(String[] args) {
        
        //Exercicio 1
        String texto = "Esto é Java!";
        int longitud = texto.length();
        System.out.println("La longitud del texto es: " + longitud);
        
        //Exercicio 2
        String texto2 = "Java";
        for (int i = 0; i < texto2.length(); i++) {
            char caracter = texto2.charAt(i);
            System.out.println(caracter); 
        }
        
        //Exercicio 3
        String texto3 = "Java desde 0";
        String textoInvertido = "";
        for (int i = texto3.length() - 1; i >= 0; i--) {
            textoInvertido += texto3.charAt(i);
        }
        System.out.println("Texto invertido: " + textoInvertido);
        
        //Exercicio 4
        String texto4 = "James Gosling Created Java";
        String textoSinEspacios = texto4.replaceAll("\\s", "");
        System.out.println("Texto sin espacios: " + textoSinEspacios);
        
        //Exercicio 5
        String texto5 = "java java java";
        texto5 = texto5.replaceAll("\\s", "");
        int vocales = 0;
        int consonantes = 0;
        for (int i = 0; i < texto5.length(); i++) {
            char caracter = texto5.charAt(i);
            if (esVocal(caracter)) {
                vocales++;
            } else {
                consonantes++;
            }
        }
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
        
        //Exercicio 6
        String texto6 = "www.javadesde0.com";
                String parte1 = texto6.substring(0, 9);
        String parte2 = texto6.substring(9);
        String resultado = parte1 + parte2;
        System.out.println("Resultado: " + resultado);
        
        //Exercicio 7
        String texto7 = "javeros";
        String enMayusculas = texto7.toUpperCase();
        System.out.println("Texto en mayúsculas: " + enMayusculas);
        String enMinusculas = enMayusculas.toLowerCase();
        System.out.println("Texto en minúsculas: " + enMinusculas);
        
        //Exercicio 8
        String cadena1 = "Java";
        String cadena2 = "JavaScript";
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        
        //Exercicio 9
        String texto9 = "Jeve jeve jeve";
        String resultado9 = texto9.replace('e', 'a');
        System.out.println("Resultado: " + resultado9);
        
        //Exercicio 10
        String texto10 = "ABCD";
                for (int i = 0; i < texto10.length(); i++) {
            char caracter = texto10.charAt(i);
            int valorAscii = (int) caracter;
            System.out.println("El valor ASCII de '" + caracter + "' es: " + valorAscii);
    }
        //Exercicio 11
        String texto11 = "Ola, son alumno de DAM1, e son programador desde o 2021";
        Exercicio11 ex11 =new Exercicio11();
        ex11.contarCaracteres(texto11);
    }
    
    // Método para verificar si un carácter es una vocal
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
