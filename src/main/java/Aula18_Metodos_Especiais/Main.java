package Aula18_Metodos_Especiais;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("OBJETO 1");
        Caneta c1 = new Caneta("Azul", true);
        c1.status();
        System.out.println("------------------");
        System.out.println("OBJETO 2");
        Caneta c2 = new Caneta("Vermeho", false);
        c2.status();
/*
        c1.setModelo("Bic cristal");
        c1.setCor("Preto");
        c1.setTampada(false);
        c1.tampar();
        c1.rabiscar();
        c1.status();
*/
    }
}
