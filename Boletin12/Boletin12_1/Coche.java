/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_1;


public class Coche {
    
    private String matricula;
    private String marca;
    private int horas;

    /*public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }*/

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula(){
        return matricula;
    }
    
    public int setHorasAparcado(){
        
        horas = (int) (Math.random()*24);
        return horas;
    }

    public int getHoras() {
        return horas;
    }
}