import produtos.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {



        return String.format("Tipo: " + this.getProduto().tipo() + " Titulo: " + this.getProduto().getTitulo() +
                " Preco: %.2f " +
                " Quant: " + this.getQuantidade() +
                " Total: %.2f ",
                this.getProduto().obterPrecoLiquido(), this.getProduto().obterPrecoLiquido() * this.getQuantidade());
    }
}
