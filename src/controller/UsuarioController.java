package controller;

import java.util.List;
import java.util.Scanner;
import java.util.Iterator; // Import necessário para remover de forma segura
import model.Usuario;
import model.Aluno;
import model.Professor;
import model.Livro; // Não necessário aqui, mas mantendo para contexto
import model.Emprestimo; // Não necessário aqui, mas mantendo para contexto

public class UsuarioController {
    private List<Usuario> usuarios;
    private Scanner scanner = new Scanner(System.in);

    public UsuarioController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // ... (Seu método adicionarUsuario() existente) ...
    public void adicionarUsuario() {
        System.out.println("Tipo de usuário (1 - Aluno, 2 - Professor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        // Verificar se já existe um usuário com o mesmo ID
        boolean idJaExiste = false;
        for (Usuario u : usuarios) {
            if (u.id == id) { // Acessando diretamente o id protegido para esta verificação
                idJaExiste = true;
                break;
            }
        }

        if (idJaExiste) {
            System.out.println("Erro: Já existe um usuário com o ID " + id + ". Cadastro não realizado.");
            return;
        }


        if (tipo == 1) {
            System.out.println("Matrícula: ");
            String matricula = scanner.nextLine();
            usuarios.add(new Aluno(id, nome, email, matricula));
            System.out.println("Aluno cadastrado com sucesso!");
        } else if (tipo == 2) {
            System.out.println("Departamento: ");
            String departamento = scanner.nextLine();
            usuarios.add(new Professor(id, nome, email, departamento));
            System.out.println("Professor cadastrado com sucesso!");
        } else {
            System.out.println("Tipo inválido. Usuário não cadastrado.");
        }
    }


    public void removerUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados para remover.");
            return;
        }

        System.out.println("Digite o ID do usuário que deseja remover: ");
        int idParaRemover = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Usar um Iterator para remover elementos de uma lista enquanto itera
        Iterator<Usuario> iterator = usuarios.iterator();
        boolean removido = false;
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.id == idParaRemover) { // Acessando o id diretamente para comparação
                iterator.remove();
                System.out.println("Usuário com ID " + idParaRemover + " removido com sucesso!");
                removido = true;
                break; // Sai do loop após encontrar e remover
            }
        }

        if (!removido) {
            System.out.println("Usuário com ID " + idParaRemover + " não encontrado.");
        }
    }
}
