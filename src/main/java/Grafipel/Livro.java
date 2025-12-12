package Grafipel;

public class Livro implements Publicacao {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //MÉTODO PERSONALIZADOS
    public String detalhes() {
        return "Livro{" + "titulo='" + titulo + '\'' + "\n, autor='"
                + autor + '\'' + "\n, totPag=" + totPag +
                "\n, pagAtual=" + pagAtual + "\n, aberto=" + aberto +
                "\n, leitor='" + leitor.getNome() + '\'' + ",idade = " + leitor.getIdade() +
                ", sexo= " + leitor.getSexo() +
                '}';
    }

    //MÉTODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPag,
                 Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //MÉTODOS ESPECIAIS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
            if (p <= this.getTotPag() && getAberto()) {
                this.setPagAtual(p);
            } else if (!getAberto()) {
                System.out.println("Livro está fechado! Primeiro abrá-o");
            } else {
                System.out.println("Número de Páginas Incorretas!");
            }
    }
    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
