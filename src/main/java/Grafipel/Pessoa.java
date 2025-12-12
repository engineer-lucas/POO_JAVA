package Grafipel;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;

    //MÉTODO PERSONALIZADO
    public void fazerNiver(){
        this.idade++;
    }

    //MÉTODO CONSTRUTOR
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    //MÉTODOS ESPECIAIS: GETTER E SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
