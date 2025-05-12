package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Emprestimo;

public class RelatorioController {
    private List<Emprestimo> emprestimos;

    public RelatorioController() {
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo e) {
        if (e != null) {
            emprestimos.add(e);
        }
    }

    public List<Emprestimo> listarAtrasos() {
        List<Emprestimo> atrasos = new ArrayList<>();

        for (Emprestimo e : emprestimos) {
            LocalDate prevista = e.getDataPrevistaDevolucao();
            LocalDate efetiva = e.getDataDevolucao();

            if (efetiva != null && efetiva.isAfter(prevista)) {
                atrasos.add(e);
            }
        }

        atrasos.sort(new Comparator<Emprestimo>() {
            public int compare(Emprestimo e1, Emprestimo e2) {
                int dias1 = e1.getDataDevolucao().until(e1.getDataPrevistaDevolucao()).getDays();
                int dias2 = e2.getDataDevolucao().until(e2.getDataPrevistaDevolucao()).getDays();
                return Integer.compare(dias2, dias1); 
            }
        });

        return atrasos;
    }

    public List<Emprestimo> listarTodos() {
        return emprestimos;
    }
}