package model;
<<<<<<< HEAD
// a class livro e subclass da MaterialBiblioteca que implemente Emprestavel.
=======

>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb
public class Livro extends MaterialBiblioteca implements Emprestavel {
    private String autor;
    private boolean disponivel = true;

    public Livro(int id, String titulo, String autor) {
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

    @Override
    public boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido.");
            return true;
        }
        return false;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Livro: " + getTitulo() + ", Autor: " + autor);
    }

<<<<<<< HEAD
=======
    public String getTitulo() { return titulo; }
>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb
}
