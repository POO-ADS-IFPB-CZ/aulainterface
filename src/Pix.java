public class Pix implements Pagamento{

    //Outros atributos e métodos aqui

    @Override
    public double processar(double valor) {
        return valor*0.95;
    }

}
