package View;

import java.uti.Scanner;
import model.Usuario;
import model.Livro;

public class MenuView {
    private Scanner scanner = Scanner(System.in);

    public int exibirMenuPrincipal() {
        System.out.println("\n1. Cadastrar Usuário: ");
        System.out.println("2. Cadastrar livro: ");
        System.out.println("3. Realizar Empréstimo: ");
        System.out.println("4. Listar Usuários: ");
        System.out.println("5. Listar Livros: ");
        System.out.println("6. Sair: ");
        System.out.println("Escolha uma opção: ");
        return scanner.nextInt;
    }
}

