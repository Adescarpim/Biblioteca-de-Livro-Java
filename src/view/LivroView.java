package view;

import controller.LivroController;
import model.Livro;

import java.util.Scanner;
import java.util.List;

public class LivroView {

    private LivroController controller;
    private Scanner scanner;

    public LivroView() {
        controller = new LivroController();
        scanner = new Scanner(System.in);
    }
    
    public void menu() {
        int opcao;
        do {
            System.out.println("\n--- MENU DE LIVROS ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Buscar livro por título");
            System.out.println("3. Remover livro");
            System.out.println("4. Listar todos os livros");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> adicionarLivro();
                case 2 -> buscarLivro();
                case 3 -> removerLivro();
                case 4 -> listarLivros();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void adicionarLivro() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        Livro livro = new Livro(ano, titulo, autor, ano, autor, ano);
        controller.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void buscarLivro() {
        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();
        Livro livro = controller.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            System.out.println("Encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private void removerLivro() {
        System.out.print("Digite o título do livro a remover: ");
        String titulo = scanner.nextLine();
        controller.removerLivro(titulo);
        System.out.println("Livro removido (se existia).");
    }

    private void listarLivros() {
        List<Livro> livros = controller.listarLivros();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            for (Livro l : livros) {
                System.out.println(l);
            }
        }
    }
}
