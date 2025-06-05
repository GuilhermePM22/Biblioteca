package Model;

public abstract class MaterialBiblioteca {
    protected int id;
    protected String titulo;

    public MaterialBiblioteca(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public abstract void exibirInformacoes();
}
