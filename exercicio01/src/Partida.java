import java.util.List;

public class Partida {
    private String data;
    private String hora;
    private int placarTime1;
    private int placarTime2;
    private Time timeA;
    private Time timeB;
    private Estadio estadio;

    public Partida() {
    }

    public Partida(String data, String hora, int placarTime1, int placarTime2, Time timeA, Time timeB, Estadio estadio) {
        this.data = data;
        this.hora = hora;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
        this.timeA = timeA;
        this.timeB = timeB;
        this.estadio = estadio;
    }

    public   void atualizarResuldado (int  placarTime1, int placarTime2){
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public Time getTimeA() { return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
