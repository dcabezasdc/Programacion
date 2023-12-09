package boletin05_1;

public class Consumo {
    private float km, litros,vMed,pGas;


    public Consumo(){

    }    

    public Consumo(float km, float litros,float vMed,float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    
    public void getTempo(){
        System.out.println("tempo do viaxe:"+km/vMed);
    }
    
    public void consumoMedio(){
        System.out.println("consumo medio:"+litros/km*100+"litros cada 100 km");
    }
    
    public void consumoPrezo(){
        System.out.println("consumo prezo:"+litros/km*100*pGas+"€ cada 100 km");
    }
    
    public void setKms(float km){
    }
    
    public void setLitros(float li){
    }
    
    public void setvMed(float vMed){
        this.vMed=vMed;
    }
    
    public void setpGas(float pre){
    }
}