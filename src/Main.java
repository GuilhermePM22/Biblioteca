import model.Biblioteca;
import view.*;
import controller.*;

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
                    if (biblioteca.usuarios.isEmpty()) { // Adicionando uma verificação para lista vazia
                        System.out.println("Não há usuários cadastrados.");
                    } else {
                        System.out.println("\n--- Lista de Usuários ---");
                        biblioteca.usuarios.forEach(usuarioView::mostrarUsuario);
                    }
                    break;
                case 5:
                    if (biblioteca.livros.isEmpty()) { // Adicionando uma verificação para lista vazia
                        System.out.println("Não há livros cadastrados.");
                    } else {
                        System.out.println("\n--- Lista de Livros ---");
                        biblioteca.livros.forEach(livroView::mostrarLivro);
                    }
                    break;
                case 6: // Novo case para deletar usuário
                    usuarioController.removerUsuario();
                    break;
                case 7: // Opção de sair ajustada
                    executando = false;
                    System.out.println("Saindo do sistema da biblioteca. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
