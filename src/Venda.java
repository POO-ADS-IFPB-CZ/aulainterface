import java.time.LocalDateTime;

public class Venda {

    //TODO: Itens da venda
    private LocalDateTime dataHora;
    private Pagamento pagamento;
    private double valor;

    //TODO: Fazer construtor, getters e setters

    public double getValorTotal(){
        return pagamento.processar(valor);
    }

}
