package model;

// A class usuario é a super class da Aluno e Professor.
public abstract class Usuario {
    private int id;
    private String nome;
    private String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
<<<<<<< HEAD
    // Criação do get para ser acessado de outras class.
=======

    public abstract void solicitarEmprestimo(Livro livro);

    // Getters e Setters
>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
<<<<<<< HEAD
    // Solicitação de Livros.
    public abstract void solicitarEmprestimo(Livro livro);
=======
>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb
}

