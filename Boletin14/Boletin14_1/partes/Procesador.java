package partes;

public class Procesador {
    
    private float velocidade;

    public Procesador() {
    }

    public Procesador(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "\nVelocidade do procesador= " + velocidade;
    }
}
