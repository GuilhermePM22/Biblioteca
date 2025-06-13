package model;

import java.time.LocalDate;

public class Emprestimo {
    int id;
    Usuario usuario;
    Livro livro;
    LocalDate dataEmprestimo;

    public Emprestimo(int id, Usuario usuario, Livro livro) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public void registrarDevolucao() {
        livro.devolver();
        System.out.println("Empréstimo devolvido.");
    }
}
