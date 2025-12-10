package Aula20_Encapsulamento;

public interface Controlador {
    //MÉTODOS LIGAR E DESLIGAR
    public abstract void Ligar();
    public abstract void Desligar();

    //MÉTODOS PARA O MENU
    public abstract void AbrirMenu();
    public abstract void FecharMenu();

    //MÉTODOS PARA VOLUME
    public abstract void MaisVolume();
    public abstract void MenosVolume();

    //MÉTODOS PARA MUTAR
    public abstract void LigarMudo();
    public abstract void DesligarMudo();

    //MÉTODOS PARA PLAY
    public abstract void Play();
    public abstract void Pause();
}
