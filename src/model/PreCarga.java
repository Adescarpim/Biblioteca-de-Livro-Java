package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PreCarga {

    private static List<Livro> livros = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Emprestimo> emprestimos = new ArrayList<>();

    static {
        Livro livro1 = new Livro(1, "1984", "George Orwell", 1949, "Ficção", 3);
        Livro livro2 = new Livro(2, "Dom Casmurro", "Machado de Assis", 1899, "Romance", 2);
        livros.add(livro1);
        livros.add(livro2);

        Usuario usuario1 = new Usuario("João Silva", "joao@email.com", "123456789", "Rua A", 1, false);
        Usuario usuario2 = new Usuario("Maria Souza", "maria@email.com", "987654321", "Rua B", 2, false);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
            
        Emprestimo e1 = new Emprestimo(usuario1, livro1, LocalDate.now().minusDays(5), LocalDate.now().plusDays(5));
        Emprestimo e2 = new Emprestimo(usuario2, livro2, LocalDate.now().minusDays(15), LocalDate.now().minusDays(5));
        e2.setDataDevolucao(LocalDate.now());


        emprestimos.add(e1);
        emprestimos.add(e2);
    }

    public static List<Livro> getLivros() {
        return livros;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
