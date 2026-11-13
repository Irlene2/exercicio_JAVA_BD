public abstract class ItemBiblioteca {

    private String codigo;
    private String titulo;
    private boolean disponivel;

    public ItemBiblioteca(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public abstract int prazoDevolucao();

    public abstract double calcularMulta(int diasAtraso);

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}