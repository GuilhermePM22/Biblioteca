import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.UsuarioController;
import controller.LivroController;
import controller.EmprestimoController;
import model.Biblioteca;
import view.MenuView;

public class Main {
    public static void main(String[] args) {
        // Inicialização
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        MenuView menuView = new MenuView();
        
        // Controllers
        UsuarioController usuarioController = new UsuarioController(biblioteca.usuarios, scanner);
        LivroController livroController = new LivroController(biblioteca.livros, scanner);
        EmprestimoController emprestimoController = new EmprestimoController(
            biblioteca.emprestimos, biblioteca.usuarios, biblioteca.livros);

        // Menu
        int opcao;
        do {
            opcao = menuView.exibirMenuPrincipal();
            
            switch (opcao) {
                case 1 -> usuarioController.adicionarUsuario();
                case 2 -> livroController.adicionarLivro();
                case 3 -> emprestimoController.realizarEmprestimo();
                case 4 -> usuarioController.listarUsuarios();
                case 5 -> System.out.println("Listar livros..."); // Implemente
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
        
        scanner.close();
    }
}