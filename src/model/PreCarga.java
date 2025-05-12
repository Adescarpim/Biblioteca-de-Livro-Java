package model;

import java.util.ArrayList;
import java.util.List;

public class Precarga {

    public static List<Livro> carregarLivros() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(0, null, null, 0, null, 0));
        livros.add(new Livro(0, null, null, 0, null, 0));
        return livros;
    }

    public static List<Usuario> carregarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(null, null, null, null, 0, false));
        usuarios.add(new Usuario(null, null, null, null, 0, false));
        return usuarios;
    }

    public static List<Emprestimo> carregarEmprestimos(List<Livro> livros, List<Usuario> usuarios) {
        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(new Emprestimo(null, null, null, null));
        return emprestimos;
    }
}

