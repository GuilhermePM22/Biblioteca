package controller;

import java.util.List;
import model.Emprestimo;
import model.Usuario;
import model.Livro;

public class EmprestimoController {
    private List<Emprestimo> emprestimos;
    private List<Usuario> usuarios;
    private List<Livro> livros;

    public EmprestimoController(List<Emprestimo> emprestimos, List<Usuario> usuarios, List<Livro> livros) {
        this.emprestimos = emprestimos;
        this.usuarios = usuarios;
        this.livros = livros;
    }

    public void realizarEmprestimo() {
        if (usuarios.isEmpty() || livros.isEmpty()) {
            System.out.println("Necessário ter usuários e livros cadastrados.");
            return;
        }

        Usuario usuario = usuarios.get(0);
        Livro livro = livros.get(0);

        if (livro.emprestar(usuario)) {
            emprestimos.add(new Emprestimo(emprestimos.size() + 1, usuario, livro));
            System.out.println("Empréstimo realizado com sucesso.");
        }
    }

    public void Devolver() {
        System.out.println("Empréstimo devolvido.");
    }
}
