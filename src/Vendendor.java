public class Vendendor extends Funcionario{

    private double totalVendas;

    public Vendendor(int matricula, String nome, double totalVendas) {
        super(matricula, nome);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
