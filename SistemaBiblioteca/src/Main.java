public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Cadastro dos itens
        Livro livro1 = new Livro("L001", "Dom Casmurro");
        Livro livro2 = new Livro("L002", "O Pequeno Príncipe");

        Revista revista1 = new Revista("R001", "Revista Ciência");
        Revista revista2 = new Revista("R002", "Revista Tecnologia");
        Revista revista3 = new Revista("R003", "Revista Educação");

        biblioteca.cadastrarItem(livro1);
        biblioteca.cadastrarItem(livro2);
        biblioteca.cadastrarItem(revista1);
        biblioteca.cadastrarItem(revista2);
        biblioteca.cadastrarItem(revista3);

        // Cadastro dos usuários
        Aluno aluno = new Aluno("Maria");
        Professor professor = new Professor("João");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        // Três empréstimos bem-sucedidos
        System.out.println("--- EMPRÉSTIMOS ---");

        biblioteca.emprestar(livro1, aluno);
        biblioteca.emprestar(revista1, aluno);
        biblioteca.emprestar(livro2, aluno);

        // Empréstimo recusado por limite atingido
        biblioteca.emprestar(revista2, aluno);

        // Empréstimo do professor
        biblioteca.emprestar(revista3, professor);

        // Listagem do acervo
        biblioteca.listarAcervo();
    }
}