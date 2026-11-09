# Sistema de Biblioteca

Projeto desenvolvido em Java e PostgreSQL para gerenciamento
de livros, revistas, usuários e empréstimos.

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- PostgreSQL
- SQL

## Funcionalidades

- Cadastro de livros e revistas.
- Cadastro de alunos e professores.
- Controle de disponibilidade dos itens.
- Empréstimos e devoluções.
- Limite de empréstimos por usuário.
- Cálculo de multas por atraso.
- Listagem do acervo.
- Consultas SQL para controle dos empréstimos e multas.

## Regras de negócio

| Item | Prazo | Multa diária |
|---|---:|---:|
| Livro | 14 dias | R$ 0,50 |
| Revista | 7 dias | R$ 1,00 |

| Usuário | Limite |
|---|---:|
| Aluno | 3 itens |
| Professor | 5 itens |

## Estrutura

```text
SistemaBiblioteca/
├── src/
│   ├── ItemBiblioteca.java
│   ├── Livro.java
│   ├── Revista.java
│   ├── Usuario.java
│   ├── Aluno.java
│   ├── Professor.java
│   ├── Biblioteca.java
│   └── Main.java
├── database/
│   ├── biblioteca.sql
│   ├── dados_teste.sql
│   └── consultas.sql
├── README.md
└── .gitignore
