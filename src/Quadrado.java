import java.io.Serializable;

public class Quadrado implements AreaCalculavel,
        PerimetroCalculavel, Serializable {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando diferente");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
