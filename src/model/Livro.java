package model;

public class Livro {
    private static int contador = 1;
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String categoria;
    private int quantidadeTotal;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String categoria, int quantidadeTotal,
            int quantidadeDisponivel) {
        this.codigo = contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.quantidadeTotal = quantidadeTotal;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Livro.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String toString() {
        return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao="
                + anoPublicacao + ", categoria=" + categoria + ", quantidadeTotal=" + quantidadeTotal
                + ", quantidadeDisponivel=" + quantidadeDisponivel + "]";
    }

    
}
