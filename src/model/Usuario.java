package model;

// A class usuario é a super class da Aluno e Professor.
public abstract class Usuario {
    public int id;
    private String nome;
    private String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Criação do get para ser acessado de outras class.
    public abstract void solicitarEmprestimo(Livro livro);

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
}

