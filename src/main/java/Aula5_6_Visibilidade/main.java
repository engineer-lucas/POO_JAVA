package Aula5_6_Visibilidade;

public class main {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("OBJETO 1");
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Preto";
        c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        System.out.println("------------------");
        System.out.println("OBJETO 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor07";
        c2.cor = "vermelho";
        c2.tampada = true;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
