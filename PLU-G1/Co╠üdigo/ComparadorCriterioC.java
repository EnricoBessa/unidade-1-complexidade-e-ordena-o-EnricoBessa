import java.util.Comparator;

/**
 * Critério C - Ticket Médio por Variedade de Produtos (crescente).
 * Desempate: Valor Final, then Código Identificador.
 */
public class ComparadorCriterioC implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        double ticket1 = o1.getQuantosProdutos() > 0 ? o1.valorFinal() / o1.getQuantosProdutos() : 0;
        double ticket2 = o2.getQuantosProdutos() > 0 ? o2.valorFinal() / o2.getQuantosProdutos() : 0;
        if (ticket1 != ticket2) {
            return Double.compare(ticket1, ticket2);
        }
        double v1 = o1.valorFinal();
        double v2 = o2.valorFinal();
        if (v1 != v2) {
            return Double.compare(v1, v2);
        }
        return Integer.compare(o1.getIdPedido(), o2.getIdPedido());
    }
}
