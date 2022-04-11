public class Vinho extends Bebidas{
    private String uva;
    private String paisOrigen;

    public Vinho() {
    }

    public Vinho(String descricao, int qntEstoque, double preco, String uva, String paisOrigen) {
        super(descricao,qntEstoque, preco);
        this.uva = uva;
        this.paisOrigen = paisOrigen;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("\n Vinho: " + getDescricao()+
                "\n Uva: " + uva+
                "\n Pais: " + paisOrigen+
                "\n Preco: " + getPreco()+
                "\n Quantidade: "+ getQtdEstoque() );

    }
}
