package controller;

import java.util.List;
import java.util.Scanner;
import model.Usuario;
import model.Aluno;
import model.Professor;

public class UsuarioController {
    private List<Usuario> usuarios;
    private Scanner scanner;

    public UsuarioController(List<Usuario> usuarios, Scanner scanner) {
        this.usuarios = usuarios;
        this.scanner = scanner;
    }

    public void adicionarUsuario() {
        System.out.println("\n--- Cadastro de Usuário ---");
        System.out.print("Tipo (1-Aluno, 2-Professor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            usuarios.add(new Aluno(id, nome, email, matricula));
        } else if (tipo == 2) {
            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();
            usuarios.add(new Professor(id, nome, email, departamento));
        }
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {
        System.out.println("\n--- Usuários Cadastrados ---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome() + " (" + usuario.getEmail() + ")");
        }
    }
}