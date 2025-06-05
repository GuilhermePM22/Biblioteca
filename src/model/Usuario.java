package model;

public class Usuario {
    protected int id;
    protected String nome;
    protected String email;

    public Usuario(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
        public abstract void solicitarEmprestimo(Livro livro);

    // Getters e Setters
    public String getNome() { return nome; }
    public String getEmail() { return email; }


    
}
