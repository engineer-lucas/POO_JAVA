package Aula21_RelClasses;

public class Combate {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[7];
        l[0] = new Lutador ("Lucas", "Brasil", 28, 1.70, 68,
                8, 2, 5);
        l[1] = new Lutador ("Jean", "Bolivia", 17, 1.81, 115,
                32, 2, 5);
        l[2] = new Lutador ("Silvano", "Inglaterra", 17, 1.74, 66,
                15, 8, 3);
        l[3] = new Lutador ("Pietro", "Africa do Sul", 17, 1.64, 60,
                24, 1, 1);
        l[4] = new Lutador ("Simão", "Uzbequistão", 17, 1.78, 72,
                18, 2, 0);
        l[5] = new Lutador("André", "Itália", 17, 1.80, 80,
                12, 0, 1);
        l[6] = new Lutador("Ryhan", "Da colina", 19, 1.69, 81,
                30, 5, 5);
/*
        l[3].apresentar();
        l[3].ganharLuta();
        l[3].perderLuta();
        l[3].empatarLuta();
        l[3].status();


        Lutador l1 = new Lutador("Jean", "Bolivia", 17, 1.81, 115,
                32, 2, 5);
        Lutador l2 = new Lutador("Pietro", "Africa do Sul", 17, 1.64, 60,
                24, 1, 1);
*/

        Luta ufc = new Luta();
        ufc.marcarLuta(l[5],l[6]);
        ufc.lutar();
        l[5].status();
        l[6].status();
    }
}
