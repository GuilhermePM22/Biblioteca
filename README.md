# Biblioteca

### Informações gerais sobre o Projeto

Este projeto é um sistema simples de gerenciamento de biblioteca, desenvolvido em Java, com o objetivo de permitir o cadastro de usuários (alunos e professores), livros e a realização de empréstimos,  o sistema é executado via terminal e utiliza o padrão MVC (Model-View-Controller) para organizar o código.

*Objetivos:*
- Gerenciar usuários (alunos e professores)
- Gerenciar livros disponíveis na biblioteca
- Realizar e registrar empréstimos de livros

*Funcionalidades principais:*

1. Cadastrar Usuário
2. Cadastrar Livro
3. Realizar Empréstimo
4. Listar Usuários
5. Listar Livros
6. Deletar Usuário
7. Sair


---

### Informações sobre as Classes e suas Relações

- *MaterialBiblioteca (abstract)*: Classe base para materiais da biblioteca, como livros.
- *Livro*: Herda de MaterialBiblioteca e implementa a interface Emprestavel, representa um livro que pode ser emprestado.
- *Emprestavel (interface)*: Define métodos para emprestar e devolver materiais.
- *Usuario (abstract)*: Classe base para usuários do sistema.
- *Aluno* e *Professor*: Herdam de Usuario, representando os diferentes tipos de usuários.
- *Emprestimo*: Representa o empréstimo de um livro para um usuário.
- *Biblioteca*: Agrega listas de usuários, livros e empréstimos.
- *Controllers*: Gerenciam as operações de cadastro e empréstimo (UsuarioController, LivroController, EmprestimoController).
- *Views*: Responsáveis pela interação com o usuário via terminal (MenuView, LivroView, UsuarioView).

*Relações:*
- Associação entre Biblioteca e as listas de Usuario, Livro e Emprestimo.
- Composição entre Emprestimo, Usuario e Livro (um empréstimo não existe sem um usuário e um livro).
- Herança entre Usuario/Aluno/Professor e MaterialBiblioteca/Livro.
- Implementação da interface Emprestavel por Livro.

---

### Uso do ChatGpt

1. **Explicação do uso:*
    - Utilizamos a ajuda da IA para organizarmelhor a tarefa de cada um, o que fazer
      e por onde começar, foi utilizada também para nós ajudar a entender melhor a  
      montagem do nosso trabalho, como a estrutura dele, pedimos também para explicar
      algumas coisas que não entendiamos, para não  fazer algo  mal feito e com preguiça,
      foi utilizado aulas no cana YouTube, para melhor entendimento de class e melhor aprendizado,
      assim garantindo uma boa estrutura e trabalho em equipe.

---

### Como Executar o Projeto

1. *Pré-requisitos:*  
   O projeto foi desenvolvido utilizando no intellij.

2. *Uso:*  
   Siga o menu apresentado no terminal para cadastrar usuários, livros, realizar empréstimos e deletar.

---

### Referências e Recursos

- Documentação oficial do Java: https://docs.oracle.com/javase/8/docs/
- Exemplos de projetos em Java com padrão MVC
- Tutoriais de orientação a objetos em Java

