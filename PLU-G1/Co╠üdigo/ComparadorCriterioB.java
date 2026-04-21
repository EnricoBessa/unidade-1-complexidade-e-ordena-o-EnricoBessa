import java.util.Comparator;

/**
 * Critério B - Forma de Pagamento: à vista first, then parcelado.
 * Desempate: Valor Final, then Código Identificador.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido pedido1, Pedido pedido2) {
        if (pedido1.getFormaDePagamento() != pedido2.getFormaDePagamento()) {
            return Integer.compare(pedido1.getFormaDePagamento(), pedido2.getFormaDePagamento());
        }
        double v1 = pedido1.valorFinal();
        double v2 = pedido2.valorFinal();
        if (v1 != v2) {
            return Double.compare(v1, v2);
        }
        return Integer.compare(pedido1.getIdPedido(), pedido2.getIdPedido());
    }
}
