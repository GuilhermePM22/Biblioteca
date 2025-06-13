import model.Biblioteca;
import controller.*;
import view.LivroView;
import view.MenuView;
import view.UsuarioView;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        MenuView menu = new MenuView();
        UsuarioView usuarioView = new UsuarioView();
        LivroView livroView = new LivroView();

        UsuarioController usuarioController = new UsuarioController(biblioteca.usuarios);
        LivroController livroController = new LivroController(biblioteca.livros);
        EmprestimoController emprestimoController = new EmprestimoController(biblioteca.emprestimos, biblioteca.usuarios, biblioteca.livros);


        boolean executando = true;

        while (executando) {
            int opcao = menu.exibirMenuPrincipal();
            switch (opcao) {
                case 1:
                    usuarioController.adicionarUsuario();
                    break;
                case 2:
                    livroController.adicionarLivro();
                    break;
                case 3:
                    emprestimoController.realizarEmprestimo();
                    break;
                case 4:
                    emprestimoController.Devolver();
                    break;
                case 5:
                    biblioteca.usuarios.forEach(usuarioView::mostrarUsuario);
                    break;
                case 6:
                    biblioteca.livros.forEach(livroView::mostrarLivro);
                    break;
                case 7:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Tente novamente, por favor!");
            }
        }
    }
}
