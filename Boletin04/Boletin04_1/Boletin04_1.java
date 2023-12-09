package boletin04_1;
//1- Crea unha clase chamada Libro que conteña os seguintes atributos:
// a. String titulo;
// b. String autor;
// c. int ano;
// d. short numPaginas;
// e. float valoracion;

//2- A clase debe de ter os seguintes construtores:
//    ● Construtor por defecto. 
//    ● Construtor que permita inicializar o título , autor , ano e número de páxinas.

//3- Establecer os métodos de acceso para todos os atributos. 

//4-Metodo amosar que non devolve nada e visualiza todas as característica dun libro .

//5- Crear unha clase Principal co método main.
//Crear un libro con cada construtor e mostrar por consola a súa información. Modificar os datos do libro 
//creado co construtor por defecto

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
