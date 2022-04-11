import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Ingredientes item1 = new Ingredientes("Mussarela");
        Ingredientes item2 = new Ingredientes("Molho");
        Ingredientes item4 = new Ingredientes("Provolone");
        Ingredientes item5 = new Ingredientes("Catupiry");
        Ingredientes item6 = new Ingredientes("Frango");

        List<Ingredientes> receita01 = new ArrayList<>();
        receita01.add(item1);
        receita01.add(item2);
        receita01.add(item5);
        receita01.add(item6);

        Pizza pizza01 = new Pizza("Frango c/ catupiry", 29, true, receita01);

        List<Ingredientes> receita02 = new ArrayList<>();
        receita02.add(item1);
        receita02.add(item2);
        receita02.add(item4);

        Pizza pizza02 = new Pizza("Dois queijos ", 29, false, receita02);

        Cerveja cerveja01 = new Cerveja("IPA", 5,9.8,5.6);
        Cerveja cerveja02 = new Cerveja("Pilsen", 10,6.8,4.5);

        Vinho vinho01 = new Vinho("Tinto", 10, 32.90, "Carbenet", "Portugal" );
        Vinho vinho02 = new Vinho("Corte", 8, 52.90, "Tannat", "Uruguai" );

        List<Produtos> listaProd = new ArrayList<>();
        listaProd.add(cerveja01);
        listaProd.add(cerveja02);
        listaProd.add(vinho01);
        listaProd.add(vinho02);
        listaProd.add(pizza01);
        listaProd.add(pizza02);

        for (Produtos p : listaProd )
            p.mostrarDados();




    }


}
