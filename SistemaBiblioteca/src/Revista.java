public class Revista extends ItemBiblioteca {

    public Revista(String codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public int prazoDevolucao() {
        return 7;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.00 : 0;
    }
}