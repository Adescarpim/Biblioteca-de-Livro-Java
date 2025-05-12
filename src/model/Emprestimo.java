package model;

import java.time.LocalDate;

import interfaces.EmprestimoInterface;

public class Emprestimo implements EmprestimoInterface {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.dataDevolucao = null;
    }

    public void registrarDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean estaEmAtraso() {
        return dataDevolucao != null && dataDevolucao.isAfter(dataPrevistaDevolucao);
    }

    public long diasDeAtraso() {
        if (estaEmAtraso()) {
            return java.time.temporal.ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataDevolucao);
        }
        return 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario.getNome() + ", Livro: " + livro.getTitulo() +
               ", Data Empréstimo: " + dataEmprestimo +
               ", Devolução Prevista: " + dataPrevistaDevolucao +
               ", Devolução Efetiva: " + (dataDevolucao != null ? dataDevolucao : "Ainda não devolvido");
    }
}