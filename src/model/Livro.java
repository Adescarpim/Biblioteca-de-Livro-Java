package model;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String categoria;
    private int totalExemplares;
    private int exemplaresDisponiveis;

    public Livro(int codigo, String titulo, String autor, int anoPublicacao, String categoria, int totalExemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.totalExemplares = totalExemplares;
        this.exemplaresDisponiveis = totalExemplares;
    }

    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
        }
    }
    
    public void devolver() {
        if (exemplaresDisponiveis < totalExemplares) {
            exemplaresDisponiveis++;
        }
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

    public int getTotalExemplares() {
        return totalExemplares;
    }

    public void setTotalExemplares(int totalExemplares) {
        this.totalExemplares = totalExemplares;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    @Override
    public String toString() {
        return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao="
                + anoPublicacao + ", categoria=" + categoria + ", totalExemplares=" + totalExemplares
                + ", exemplaresDisponiveis=" + exemplaresDisponiveis + "]";
    }
}