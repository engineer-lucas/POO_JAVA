package Aula19_BancoBrasil2;

public class ContaBancaria { // Nome da classe atualizado

    // ATRIBUTOS (Privados para Encapsulamento)
    private int numConta;       // Equivalente a +numconta
    private String tipo;        // Equivalente a #tipo
    private String proprietario; // Equivalente a -proprietario
    private double saldo;       // Equivalente a -saldo
    private boolean status;     // Equivalente a -status

    // CONSTRUTOR PADRÃO
    public ContaBancaria() {
        this.setSaldo(0);      // Saldo inicial é 0
        this.setStatus(false); // Status inicial é Fechada (false)
    }

    // MÉTODOS ESPECIAIS - GETTERS E SETTERS

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProprietario() {
        return this.proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return this.saldo;
    }
    // Setter privado/protegido, pois o saldo deve ser alterado apenas por transações
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    // MÉTODOS PERSONALIZADOS (Comportamentos)

    public void estadoAtual() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Proprietário: " + this.getProprietario());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada"));
        System.out.println("---------------------------------");
    }

    // 1. abrirConta()
    public void abrirConta(int n, String t, String p) {
        this.setNumConta(n);
        this.setTipo(t);
        this.setProprietario(p);
        this.setStatus(true); // Abre a conta

        // Regra de negócio: Bônus de abertura conforme o tipo de conta
        if (t.equals("CC")) { // Conta Corrente
            this.setSaldo(this.getSaldo() + 50);
            System.out.println("Conta Corrente aberta com sucesso! Bônus de R$50.");
        } else if (t.equals("CP")) { // Conta Poupança
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("Conta Poupança aberta com sucesso! Bônus de R$150.");
        } else {
            System.out.println("Tipo de conta inválido.");
            this.setStatus(false); // Mantém fechada se o tipo for inválido
        }
    }

    // 2. fecharConta()
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("ERRO! Não pode fechar, pois ainda tem saldo (R$" + this.getSaldo() + "). Saque o valor antes.");
        } else if (this.getSaldo() < 0) {
            System.out.println("ERRO! Não pode fechar, pois está em débito (R$" + this.getSaldo() + "). Pague o valor antes.");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getProprietario() + " fechada com sucesso!");
        }
    }

    // 3. depositar()
    public void depositar(double valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado na conta de " + this.getProprietario());
        } else {
            System.out.println("ERRO! Impossível depositar, conta está fechada.");
        }
    }

    // 4. sacar()
    public void sacar(double valor) {
        if (!this.getStatus()) {
            System.out.println("ERRO! Impossível sacar, conta está fechada.");
            return;
        }

        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " autorizado para " + this.getProprietario() + ".");
        } else {
            System.out.println("ERRO! Saldo insuficiente. Saldo atual: R$" + this.getSaldo());
        }
    }

    // 5. pagarAnuidade()
    public void pagarAnuidade() {
        int v = 0; // Valor da anuidade
        if (this.getTipo().equals("CC")) {
            v = 12; // Anuidade CC
        } else if (this.getTipo().equals("CP")) {
            v = 20; // Anuidade CP
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Anuidade de R$" + v + " debitada com sucesso na conta de " + this.getProprietario());
            } else {
                System.out.println("ERRO! Saldo insuficiente para pagar a anuidade.");
            }
        } else {
            System.out.println("ERRO! Impossível pagar anuidade, conta fechada.");
        }
    }
}