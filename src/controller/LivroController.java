

package controller;

import java.util.List;
import java.util.Scanner;
import model.Livro;

public class LivroController {
    private List<Livro> livros;
    private Scanner scanner;

    public LivroController(List<Livro> livros, Scanner scanner) {
        this.livros = livros;
        this.scanner = scanner;
    }

    public void adicionarLivro() {
        System.out.println("\n--- Cadastro de Livro ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        livros.add(new Livro(id, titulo, autor));
        System.out.println("Livro cadastrado com sucesso!");
    }
}