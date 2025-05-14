public class App {

    public static void main(String[] args) {
        AreaCalculavel area1 = new Quadrado(2);
        AreaCalculavel area2 = new Circulo(3);

        System.out.println(area1.calcularArea());
        System.out.println(area2.calcularArea());

        area1.desenhar();
        area2.desenhar();

    }

}
