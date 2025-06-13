package controller;

import java.util.List;
import java.util.Scanner;
import model.Livro;

public class LivroController {
    private List<Livro> livros;
    private Scanner scanner = new Scanner(System.in);

    public LivroController(List<Livro> livros) {

        this.livros = livros;
    }

    public void adicionarLivro() {
        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Título: ");
        String titulo = scanner.nextLine();

        System.out.println("Autor: ");
        String autor = scanner.nextLine();

        livros.add(new Livro(id, titulo, autor));
    }
}

