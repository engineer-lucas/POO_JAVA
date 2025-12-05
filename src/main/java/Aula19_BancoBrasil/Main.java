package Aula19_BancoBrasil;

public class Main {
    public static void main(String[] args){

        // Criação de objetos com o construtor padrão
        ContaBancaria p1 = new ContaBancaria(); // Nome da classe atualizado
        ContaBancaria p2 = new ContaBancaria(); // Nome da classe atualizado

        // Abertura da Conta 1 (CC - Conta Corrente)
        p1.abrirConta(1001, "CC", "Jubileu");
        p1.depositar(300);
        p1.sacar(50);
        p1.pagarAnuidade();
        p1.estadoAtual();

        // Abertura da Conta 2 (CP - Conta Poupança)
        p2.abrirConta(1002, "CP", "Creuza");
        p2.depositar(500);
        p2.sacar(100);
        p2.pagarAnuidade();
        p2.estadoAtual();

        // Saque e fechamento
        p1.sacar(300 + 50 - 50 - 12);
        p1.fecharConta();
        p1.estadoAtual();
    }
}