package View;

import Model.Usuario;

public class UsuarioView {
    public void mostrarUsuario(Usuario usuario) {
        System.out.println("Usuário: " + usuario.nome + " Email: " + usuario.getEmail());
    }
}