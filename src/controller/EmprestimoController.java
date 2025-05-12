package controller;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

import java.time.LocalDate;
import java.util.List;

public class EmprestimoController {

    private List<Emprestimo> emprestimos;

    public EmprestimoController(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.getExemplaresDisponiveis() > 0 && !usuario.isTemEmprestimo()) {
            livro.setTotalExemplares(livro.getExemplaresDisponiveis() - 1);
            usuario.setTemEmprestimo(true);
            Emprestimo e = new Emprestimo(usuario, livro, LocalDate.now(), LocalDate.now().plusDays(7));
            emprestimos.add(e);
        }
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}