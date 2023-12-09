package boletin04_1;
//Crea unha clase chamada Libro que conteña os seguintes atributos:
// a. String titulo;
// b. String autor;
// c. int ano;
// d. short numPaginas;
// e. float valoracion;

public class Boletin04_1 {

    public static void main(String[] args) {
        //constructor parametrizado
        Libro obxL= new Libro("Los Juegos del hambre","Suzanne Collins",2008,(short)400);
        obxL.mostrar();
        //constructor por defecto
        Libro obxLib= new Libro();
        obxLib.setTitulo("Harry Potter");
        obxLib.setAutor("JK Rowling");
        obxLib.setAno(1997);
        obxLib.setNumPaginas((short)256);
        obxLib.mostrar();
    }
    
}
