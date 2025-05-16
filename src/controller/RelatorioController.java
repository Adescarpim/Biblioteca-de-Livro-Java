package controller;

import model.Emprestimo;
import model.Livro;
import model.Usuario;
import model.PreCarga;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class RelatorioController {

    private List<Emprestimo> getEmprestimos() {
        return PreCarga.getEmprestimos();
    }

    public List<Livro> livrosEmprestados() {
        List<Livro> livros = new ArrayList<>();
        for (Emprestimo e : getEmprestimos()) {
            if (e.getDataDevolucao() == null) {
                livros.add(e.getLivro());
            }
        }
        return livros;
    }

    public List<Usuario> usuariosComAtraso() {
        List<Usuario> usuarios = new ArrayList<>();
        LocalDate hoje = LocalDate.now();

        for (Emprestimo e : getEmprestimos()) {
            if (e.getDataDevolucao() == null && hoje.isAfter(e.getDataPrevistaDevolucao())) {
                Usuario u = e.getUsuario();
                if (!usuarios.contains(u)) {
                    usuarios.add(u);
                }
            }
        }
        return usuarios;
    }

    public List<Emprestimo> listarAtrasos() {
        List<Emprestimo> atrasos = new ArrayList<>();

        for (Emprestimo e : getEmprestimos()) {
            LocalDate prevista = e.getDataPrevistaDevolucao();
            LocalDate efetiva = e.getDataDevolucao();

            if (efetiva != null && efetiva.isAfter(prevista)) {
                atrasos.add(e);
            }
        }

        atrasos.sort((e1, e2) -> {
            long dias1 = ChronoUnit.DAYS.between(e1.getDataPrevistaDevolucao(), e1.getDataDevolucao());
            long dias2 = ChronoUnit.DAYS.between(e2.getDataPrevistaDevolucao(), e2.getDataDevolucao());
            return Long.compare(dias2, dias1);
        });

        return atrasos;
    }
}
