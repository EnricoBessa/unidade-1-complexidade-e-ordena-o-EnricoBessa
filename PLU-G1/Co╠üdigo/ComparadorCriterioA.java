import java.util.Comparator;

/**
 * Critério A - Valor Final do Pedido (crescente).
 * Desempate 1: Volume Total de Itens (quantProdutos).
 * Desempate 2: Código Identificador do primeiro item do pedido.
 */
public class ComparadorCriterioA implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        double v1 = o1.valorFinal();
        double v2 = o2.valorFinal();
        if (v1 != v2) {
            return Double.compare(v1, v2);
        }
        int total1 = o1.getTotalItens();
        int total2 = o2.getTotalItens();
        if (total1 != total2) {
            return Integer.compare(total1, total2);
        }
        return Integer.compare(o1.getIdPrimeiroProduto(), o2.getIdPrimeiroProduto());
    }
}
