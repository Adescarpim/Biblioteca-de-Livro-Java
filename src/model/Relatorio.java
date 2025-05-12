package model;

import java.util.List;

public class Relatorio {

    public void listarLivrosEmprestados(List<Emprestimo> emprestimos) {
        System.out.println("Livros atualmente emprestados:");
        for (Emprestimo e : emprestimos) {
            if (e.getDataDevolucao() == null) {
                System.out.println(e);
            }
        }
    }

    public void listarUsuariosComAtraso(List<Emprestimo> emprestimos) {
        System.out.println("Usuários com devoluções em atraso:");
        for (Emprestimo e : emprestimos) {
            if (e.estaEmAtraso()) {
                System.out.println(e);
            }
        }
    }
}
