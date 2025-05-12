package controller;

import interfaces.LivroInterface;
import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroController implements LivroInterface {

    private List<Livro> livros;

    public LivroController() {
        livros = new ArrayList<>();
    }

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void removerLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null) {
            livros.remove(livro);
        }
    }

    @Override
    public List<Livro> listarLivros() {
        return livros;
    }
}
