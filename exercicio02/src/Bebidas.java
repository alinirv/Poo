public class Bebidas extends Produtos{
    private int qtdEstoque;

    @Override
    public void mostrarDados() {
    }

    public Bebidas() {
    }
    public Bebidas(String descricao, int qntEstoque, double preco) {
        super(descricao, preco);
        this.qtdEstoque = qntEstoque;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
