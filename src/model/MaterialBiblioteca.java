package model;

public abstract class MaterialBiblioteca {
    private int id;
    private String Livro;

    public MaterialBiblioteca(int id, String Livro){
        this.id = id;
        this.Livro = Livro;
    }

    public abstract void exibirInformacoes();
}
