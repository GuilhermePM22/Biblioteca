package view;

import java.util.Scanner;
import model.Usuario;
import model.Livro;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenuPrincipal() {
        System.out.println("\n--- Menu Principal da Biblioteca ---"); // Adicionado um título para o menu
        System.out.println("1. Cadastrar Usuário");
        System.out.println("2. Cadastrar Livro");
        System.out.println("3. Realizar Empréstimo");
        System.out.println("4. Listar Usuários");
        System.out.println("5. Listar Livros");
        System.out.println("6. Deletar Usuário"); // Nova opção
        System.out.println("7. Sair"); // Opção de sair movida para baixo
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
