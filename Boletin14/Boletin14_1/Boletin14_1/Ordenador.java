package boletin14_01;

import partes.*;

public class Ordenador {
    
    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    private float precio;

    public Ordenador() {
    }
    
    public Ordenador(Monitor mo, Teclado te, Procesador pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador: " + mo  + te + pro +"\n"+ "Precio= "+precio ;
    }
}
