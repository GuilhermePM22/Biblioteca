package Model;

public class Professor extends Usuario {
    private String departamento;

    public Professor(int id, String nome, String email, String departamento) {
        super(id, nome, email);
        this.departamento = departamento;
    }

    @Override
    public void solicitarEmprestimo(Livro livro) {
        System.out.println(nome + " solicitou o livro: " + livro.getTitulo());
    }
}
