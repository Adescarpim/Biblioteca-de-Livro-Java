package view;

import controller.RelatorioController;
import model.Livro;
import model.Usuario;

import java.util.List;
import java.util.Scanner;

public class RelatorioView {

    private RelatorioController controller;
    private Scanner scanner;

    public RelatorioView() {
        controller = new RelatorioController();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\n--- MENU DE RELATÓRIOS ---");
            System.out.println("1. Livros emprestados");
            System.out.println("2. Usuários com atraso");
            System.out.println("3. Livros mais populares");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> mostrarLivrosEmprestados();
                case 2 -> mostrarUsuariosComAtraso();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void mostrarLivrosEmprestados() {
        List<Livro> livros = controller.livrosEmprestados();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro está emprestado no momento.");
        } else {
            System.out.println("Livros atualmente emprestados:");
            for (Livro l : livros) {
                System.out.println(l);
            }
        }
    }

    private void mostrarUsuariosComAtraso() {
        List<Usuario> usuarios = controller.usuariosComAtraso();
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário com devolução em atraso.");
        } else {
            System.out.println("Usuários com atraso:");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        }
    }
}
