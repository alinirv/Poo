import java.util.List;

public class Pizza extends Produtos{
    private boolean bordaRecheada;
    private List<Ingredientes> ingredientes;

    public Pizza() {
    }

    public Pizza(String descricao, double preco, boolean bordaRecheada, List<Ingredientes> ingredientes) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
        this.ingredientes = ingredientes;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n Pizza: " + getDescricao()+
                "\n Borda recheada: " + bordaRecheada+
                "\n Preco: " + getPreco());
        System.out.println("Ingredientes: ");
        for(Ingredientes i: ingredientes){
            System.out.println(i.getNome());
        }
    }
}
