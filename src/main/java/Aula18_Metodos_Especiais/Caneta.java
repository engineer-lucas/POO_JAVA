package Aula18_Metodos_Especiais;
//ATRIBUTOS
public class Caneta {
    protected String modelo;
    private String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

//MÉTODOS CONSTRUTOR


    public Caneta(String cor, boolean tampada) {
        this.cor = cor;
        this.tampada = tampada;
    }

    //MÉTODOS ESPECIAIS - GETTER E SETTER
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int ca) {
        this.carga = ca;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

//MÉTODOS PERSONALIZADOS
    void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.isTampada());
    }
    protected void rabiscar(){
        if (this.isTampada() == true){
            System.out.println("ERROR!, Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    protected void tampar(){
        this.setTampada(true);
    }
    protected void destampar(){
        this.setTampada(false);
    }
}
