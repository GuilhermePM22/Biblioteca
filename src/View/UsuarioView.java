package view;

import model.Usuario;

public class UsuarioView {
    public void mostrarUsuario(Usuario usuario) {
        System.out.println("Usuário: " + usuario.getNome() + ", Email: " + usuario.getEmail());
    }
}
