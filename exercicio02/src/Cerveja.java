public class Cerveja extends Bebidas{
    private double teorAlcoolico;

    public Cerveja() {
    }

    public Cerveja(String descricao, int qntEstoque, double preco, double teorAlcoolico) {
        super(descricao,qntEstoque, preco);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("\n Cerveja: " + getDescricao()+
                "\n Teor alcoolico: " + teorAlcoolico+
                "\n Preco: " + getPreco()+
                "\n Quantidade: "+ getQtdEstoque() );

    }
}
