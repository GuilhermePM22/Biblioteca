package controller;

import java.util.List;
import java.util.Scanner;
import model.Usuario;
import model.Aluno;
import model.Professor;
import model.Livro;
import model.Emprestimo;

public class UsuarioController {
<<<<<<< HEAD
    List<Usuario> usuarios;
    Scanner scanner = new Scanner(System.in);
=======
    private List<Usuario> usuarios;
    private Scanner scanner = new Scanner(System.in);
>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb

    public UsuarioController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario() {
<<<<<<< HEAD
        System.out.println("Tipo de usuário 1 - Aluno, 2 - Professor: ");
=======
        System.out.println("Tipo de usuário (1 - Aluno, 2 - Professor): ");
>>>>>>> 9dfd0db303f6d0d68f437c56a49b31339fe2fedb
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha restante

        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        if (tipo == 1) {
            System.out.println("Matrícula: ");
            String matricula = scanner.nextLine();
            usuarios.add(new Aluno(id, nome, email, matricula));
        } else if (tipo == 2) {
            System.out.println("Departamento: ");
            String departamento = scanner.nextLine();
            usuarios.add(new Professor(id, nome, email, departamento));
        } else {
            System.out.println("Tipo inválido.");
        }
    }
}

