package interfaces;

import model.Livro;
import java.util.List;

public interface LivroInterface {
    void adicionarLivro(Livro livro);
    Livro buscarLivroPorTitulo(String titulo);
    void removerLivro(String titulo);
    List<Livro> listarLivros();
}
