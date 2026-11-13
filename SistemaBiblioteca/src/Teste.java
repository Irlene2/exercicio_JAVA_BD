public class DVD extends ItemBiblioteca {

    public DVD(String codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public int prazoDevolucao() {
        return 5;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.00 : 0;
    }
}