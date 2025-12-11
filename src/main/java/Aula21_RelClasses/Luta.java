package Aula21_RelClasses;

import java.util.Random;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {

    }

    //MÉTODOS
    //PERSONALIZADOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println(" === DESAFIADO === \n");
            this.getDesafiado().apresentar();
            System.out.println(" === DESAFIANTE === \n");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencendor = aleatorio.nextInt(3);
            switch (vencendor){
                case 0: //empate
                    System.out.println("EMPATOU!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado ganhou
                    System.out.println("VITÓRIA : " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante ganhou
                    System.out.println("VITÓRIA : " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A LUTA NÃO PODE ACONTECER!!!");
        }

    }
/*    //CONSTRUTOR
    public Luta(Lutador desafiado, Lutador desafiante,
                int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

 */
    //ESPECIAIS
    //GETTER E SETTER
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
