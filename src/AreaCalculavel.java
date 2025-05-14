import java.io.Serializable;

public interface AreaCalculavel {

    double calcularArea();
    default void desenhar(){
        System.out.println("Desenhou o area calculada");
    }

}