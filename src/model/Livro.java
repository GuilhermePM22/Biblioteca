package model;

public class Livro extends MaterialBiblioteca implements Emprestavel {
    private String autor;
    private boolean disponivel = true;

    public Livro(int id, String titulo, String autor){
        super(id, titulo);
        this.autor = autor;
    }

    @Override
    public boolean emprestar(Usuario usuario) {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado para: " + usuario.getNome());
            return true;
        }
        return false;
    }
    
}
