package partes;

public class Teclado {
    
    private String marca;

    public Teclado() {
    }

    public Teclado(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nMarca do teclado= " + marca;
    }
}
