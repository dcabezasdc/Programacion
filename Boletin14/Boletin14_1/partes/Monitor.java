package partes;

public class Monitor {
    
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "\nPulgadas do monitor= "  + pulgadas;
    }
}
