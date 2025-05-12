package controller;

import model.Emprestimo;
import model.Livro;
import model.PreCarga;
import model.Usuario;

import java.util.List;

public class PreCargaController {

    public List<Livro> carregarLivros() {
        return PreCarga.carregarLivros();
    }

    public List<Usuario> carregarUsuarios() {
        return PreCarga.carregarUsuarios();
    }

    public List<Emprestimo> carregarEmprestimos(List<Livro> livros, List<Usuario> usuarios) {
        return PreCarga.carregarEmprestimos(livros, usuarios);
    }
}