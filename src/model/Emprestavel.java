package model;

public interface Emprestavel  {
    boolean emprestar(Usuario usuario);
    boolean devolver();
}
