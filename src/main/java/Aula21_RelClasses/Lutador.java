package Aula21_RelClasses;

public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //MÉTODOS
    //CONSTRUTOR
    public Lutador(String no, String nac, int id, double alt, double pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }
    //ESPECIAIS
    //GETTER E SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if ( this.peso < 52.2) {
            this.categoria = "Inválida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválida";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    //PERSONALIZADOS
    public void apresentar(){
        System.out.println("=============================================================");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Diretamente de(a) " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos de idade e altura " + this.getAltura() + "m");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias!");
        System.out.println(this.getDerrotas() + " derrotas!");
        System.out.println(this.getEmpates() + " empates!");
    }
    public void status(){
        System.out.println("=============================================================");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
        System.out.println("Empatou " + this.getEmpates() + " vezes.");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
