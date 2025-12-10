package Aula20_Encapsulamento;

import java.sql.SQLOutput;

public class Aplicacao {
    public static void main(String[] args) {
        Controle_Remoto controle = new Controle_Remoto();

        //1. testar o estado atual(desligado)
        System.out.println("1. ESTADO INICIAL");
        controle.AbrirMenu();
        //2. ligar o dispositivo
        System.out.println("2. LIGANDO ... ");
        controle.Ligar();
        //teste de volume
        System.out.println("3. VOLUME ... ");
        controle.MaisVolume();
        controle.MaisVolume();
        controle.MenosVolume();
        controle.LigarMudo();
        controle.DesligarMudo();
        //reprodução de mídia
        System.out.println("4. MÍDIA ... ");
        controle.Play();
        controle.Pause();
        //desligando
        System.out.println("5. DESLIGANDO ... ");
        controle.Desligar();
    }
}
