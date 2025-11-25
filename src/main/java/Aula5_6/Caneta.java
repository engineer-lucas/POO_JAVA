package Aula5_6;

public class Caneta {
   protected String modelo;
    protected String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    protected void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERROR!, Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
