Projeto: Sistema de Biblioteca

Esse é um projeto simples desenvolvido em java para um sistema de biblioteca que 
usa apenas três tabelas para gerenciar seus dados. Projeto criado para a disciplina 
de Programação Orientada a Objetos (POO) no Instituto Federal da Bahia (IFBA) campus Camaçari.

Tecnologia e ferramentas

Linguagem: 
JAVA JDK 20

Interface gráfica: Java swing 

Banco de Dados: MySQL

Padrão de projetos:
DAO (data access objects)

IDE recomendada: Netbeans

Estrutura do projeto:

src/

 ├── db/

 │    └── Conexao.java
 
 ├── model/
 
 │    ├── Usuario.java
 
 │    ├── Livro.java
 
 │    └── Emprestimo.java
 
 ├── dao/
 
 │    ├── UsuarioDAO.java
 
 │    ├── LivroDAO.java
 
 │    └── EmprestimoDAO.java
 
 └── app/
 
      └── Main.java

Um sistema que gerencia:

Usuários (quem vai pegar os livros)


Livros (informações sobre título, autor, etc.)


Empréstimos (controle de quem pegou, quando devolve, se está atrasado).


 Objetivo do Projeto

O Sistema de Biblioteca é um software que permite:
Cadastrar usuários (quem vai pegar os livros)


Cadastrar livros


Controlar empréstimos e devoluções


Gerar informações sobre livros disponíveis, emprestados e atrasados


Esse tipo de projeto é ótimo porque:
Treina CRUD (Create, Read, Update, Delete) em mais de uma tabela


Trabalha com relacionamentos no MySQL


Ensina lógica de programação para regras do sistema


Pode evoluir para interface gráfica (JavaFX ou Swing)

1. Funcionalidades
Cadastrar livros


Cadastrar usuários


Registrar empréstimos


Registrar devoluções


Listar livros disponíveis e emprestados


Ver histórico de empréstimos de um usuário


Marcar livros atrasados automaticamente (com base na data)
2. Estrutura do Banco MySQL















3. O diferencial desse projeto
Trabalha com várias tabelas e relacionamentos (chaves estrangeiras)


Usa datas para calcular atraso


Permite entender joins no SQL


Pode crescer com interface gráfica (JavaFX ou Swing) depois
3. Estrutura do Código Java
O projeto no Java será dividido em modelos, DAOs e execução.

a) Classe de Conexão
📄 Conexao.java
Responsável por abrir a conexão com o MySQL


Centraliza dados como URL, usuário e senha do banco



b) Classes Modelo
São as representações dos objetos no Java.
📄 Usuario.java → representa um usuário com id, nome, email
 📄 Livro.java → representa um livro com id, titulo, autor, disponivel
 📄 Emprestimo.java → representa um empréstimo com id, idUsuario, idLivro, dataEmprestimo, dataDevolucao, status
Essas classes não acessam o banco diretamente — elas só armazenam dados.

c) Classes DAO (Data Access Object)
São as classes que falam com o banco MySQL usando JDBC.
📄 UsuarioDAO.java
cadastrarUsuario()


listarUsuarios()


buscarUsuarioPorId()


excluirUsuario()


📄 LivroDAO.java
cadastrarLivro()


listarLivros()


atualizarDisponibilidade()


📄 EmprestimoDAO.java
registrarEmprestimo() (atualiza disponibilidade do livro)


registrarDevolucao() (muda status para "DEVOLVIDO")


listarEmprestimos() (com join para mostrar nome do usuário e título do livro)


verificarAtrasos() (atualiza status para "ATRASADO" se passou da data)



d) Programa Principal
📄 Main.java
Mostra um menu para o usuário no terminal


Exemplo de opções:
