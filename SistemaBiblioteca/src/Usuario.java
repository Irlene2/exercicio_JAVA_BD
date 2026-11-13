public abstract class Usuario {

    private String nome;
    private int quantidadeEmprestada;

    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public abstract int limiteItens();

    public boolean podeEmprestar() {
        return quantidadeEmprestada < limiteItens();
    }

    public void adicionarEmprestimo() {
        quantidadeEmprestada++;
    }

    public void removerEmprestimo() {
        if (quantidadeEmprestada > 0) {
            quantidadeEmprestada--;
        }
    }
}