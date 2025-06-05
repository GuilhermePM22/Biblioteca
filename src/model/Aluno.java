package model;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(int id, String nome, String email, String matricula){
      super (id, nome, email);
      this.matricula = matricula;
    }
        @Override
    public void solicitarEmprestimo(Livro livro) {
        System.out.println(nome + " solicitou o livro: " + livro.getTitulo());
    }
}
