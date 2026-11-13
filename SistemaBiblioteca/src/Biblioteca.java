public class Biblioteca {

    private ItemBiblioteca[] acervo;
    private Usuario[] usuarios;

    private ItemBiblioteca[] itensEmprestados;
    private Usuario[] responsaveis;

    private int totalItens;
    private int totalUsuarios;

    public Biblioteca() {
        acervo = new ItemBiblioteca[100];
        usuarios = new Usuario[50];

        itensEmprestados = new ItemBiblioteca[100];
        responsaveis = new Usuario[100];

        totalItens = 0;
        totalUsuarios = 0;
    }

    public void cadastrarItem(ItemBiblioteca item) {
        if (item == null || totalItens >= acervo.length) {
            System.out.println("Não foi possível cadastrar o item.");
            return;
        }

        acervo[totalItens++] = item;
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario == null || totalUsuarios >= usuarios.length) {
            System.out.println("Não foi possível cadastrar o usuário.");
            return;
        }

        usuarios[totalUsuarios++] = usuario;
    }

    private boolean itemCadastrado(ItemBiblioteca item) {
        for (int i = 0; i < totalItens; i++) {
            if (acervo[i] == item) {
                return true;
            }
        }
        return false;
    }

    private boolean usuarioCadastrado(Usuario usuario) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i] == usuario) {
                return true;
            }
        }
        return false;
    }

    public void emprestar(ItemBiblioteca item, Usuario usuario) {

        if (item == null || usuario == null ||
            !itemCadastrado(item) || !usuarioCadastrado(usuario)) {
            System.out.println("Item ou usuário não cadastrado.");
            return;
        }

        if (!item.isDisponivel()) {
            System.out.println("Item indisponível.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Empréstimo recusado: limite atingido!");
            return;
        }

        int posicao = -1;

        for (int i = 0; i < itensEmprestados.length; i++) {
            if (itensEmprestados[i] == null) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("Limite de empréstimos da biblioteca atingido.");
            return;
        }

        itensEmprestados[posicao] = item;
        responsaveis[posicao] = usuario;

        item.emprestar();
        usuario.adicionarEmprestimo();

        System.out.println("Empréstimo realizado com sucesso!");
    }

    public void devolver(ItemBiblioteca item, Usuario usuario) {

        if (item == null || usuario == null) {
            System.out.println("Item ou usuário inválido.");
            return;
        }

        for (int i = 0; i < itensEmprestados.length; i++) {

            if (itensEmprestados[i] == item &&
                responsaveis[i] == usuario) {

                item.devolver();
                usuario.removerEmprestimo();

                itensEmprestados[i] = null;
                responsaveis[i] = null;

                System.out.println("Devolução realizada com sucesso!");
                return;
            }
        }

        System.out.println("Empréstimo não encontrado para este usuário.");
    }

    public void listarAcervo() {

        System.out.println("\n===== ACERVO DA BIBLIOTECA =====");

        for (int i = 0; i < totalItens; i++) {

            ItemBiblioteca item = acervo[i];

            System.out.println(
                "Código: " + item.getCodigo() +
                " | Título: " + item.getTitulo() +
                " | Disponível: " + item.isDisponivel() +
                " | Prazo: " + item.prazoDevolucao() + " dias"
            );
        }
    }
}