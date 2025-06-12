package view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenuPrincipal() {
        System.out.println("\n1. Cadastrar Usuário");
        System.out.println("2. Cadastrar Livro");
        System.out.println("3. Realizar Empréstimo");
        System.out.println("4. Devolver Livro");
        System.out.println("5. Listar Usuários");
        System.out.println("6. Listar Livros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}

