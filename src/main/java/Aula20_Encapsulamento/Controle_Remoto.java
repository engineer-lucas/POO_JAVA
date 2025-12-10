package Aula20_Encapsulamento;

public class Controle_Remoto implements Controlador {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //MÉTODO CONSTRUTOR
    public Controle_Remoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //MÉTODOS ESPECIAIS
    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    //MÉTODOS PERSONALIZADOS
    @Override
    public void Ligar() {
        this.setLigado(true);
        System.out.println("DISPOSITIVO LIGADO COM SUCESSO!!!");
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
        System.out.println("DISPOSITIVO DESLIGADO COM SUCESSO!!!");
    }

    @Override
    public void AbrirMenu() {
        if (this.isLigado()) {
            System.out.println("--- MENU ---");
            System.out.println("Esta ligado ? " + this.isLigado());
            System.out.println("Volume atual : " + this.getVolume());
            System.out.println("Reproduzindo algo ? " + this.isTocando());
        } else {
            System.out.println("DISPOSITIVO DESLIGADO, PORTANTO NÃO É POSSÍVEL ABRIR MENU!!!");
        }
    }

    @Override
    public void FecharMenu() {
        if (this.isLigado()) {
            System.out.println("FECHANDO MENU!!!");
        } else {
            System.out.println("DISPOSITIVO DESLIGADO, PORTANTO NÃO É POSSÍVEL FECHAR MENU!!!");
        }
    }

    @Override
    public void MaisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
            System.out.println("VOLUME ATUAL : " + this.getVolume());
        } else {
            System.out.println("NÃO É POSSÍVEL ALTERAR VOLUME!");
            System.out.println("DISPOSITIVO DESLIGADO!!!");
        }
    }

    @Override
    public void MenosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
            System.out.println("VOLUME ATUAL : " + this.getVolume());
        } else {
            System.out.println("NÃO É POSSÍVEL ALTERAR VOLUME!");
            System.out.println("DISPOSITIVO DESLIGADO!!!");
        }
    }

    @Override
    public void LigarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("VOLUME ATUAL : " + this.getVolume());
        }
    }

    @Override
    public void DesligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("VOLUME ATUAL : " + this.getVolume());
        }
    }
    @Override
    public void Play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
            System.out.println("REPRODUZINDO!!!");
        }
    }
    @Override
    public void Pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("PAUSADO!!!");
        }
    }
}
