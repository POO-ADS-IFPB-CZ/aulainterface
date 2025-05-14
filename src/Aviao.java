public class Aviao implements Planavel {

    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void voar(){
        System.out.println("Ligar motor");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
