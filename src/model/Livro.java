package Model;

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
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }

    public String getTitulo() { 
        return titulo; 
    }
}
    

