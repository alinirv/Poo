import java.util.List;

public class Time {
    private String pais;
    private int quantidadedeTitulos;
    private List<Jogador> jogadores;


    public Time() {
    }

    public Time(String pais, int quantidadedeTitulos, List<Jogador> jogador) {
        this.pais = pais;
        this.quantidadedeTitulos = quantidadedeTitulos;
        this.jogadores = jogador;
    }

    public void adicionaJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadedeTitulos() {
        return quantidadedeTitulos;
    }

    public void setQuantidadedeTitulos(int quantidadedeTitulos) {
        this.quantidadedeTitulos = quantidadedeTitulos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
