// Classe abstrata MaterialBiblioteca
package model;

public abstract class MaterialBiblioteca {
    private int id;
    private String titulo;

    public MaterialBiblioteca(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void exibirInformacoes();

}