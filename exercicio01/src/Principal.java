import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        Jogador j1 = new Jogador("Jordan", "lateral", 8);
        Jogador j2 = new Jogador("Marcos", "gol", 1);
        Jogador j3 = new Jogador("Santos", "meia", 6);
        Jogador j4 = new Jogador("Silva", "meia", 10);
        Jogador j5 = new Jogador("Gui", "gol", 2);
        Jogador j6 = new Jogador("Dani", "lateral", 9);


        List<Jogador> equipeA = new ArrayList<>();
        List<Jogador> equipeB = new ArrayList<>();
        equipeB.add(j4);
        equipeB.add(j5);
        equipeB.add(j6);

        Time time_01 = new Time("Jamaica", 3, equipeA );
        Time time_02 = new Time("Mexico", 2, equipeB );

        time_01.adicionaJogador(j1);
        time_01.adicionaJogador(j2);
        time_01.adicionaJogador(j3);

        Estadio estadio1 = new Estadio("Garrincha", "Santos");

        Partida partida01 = new Partida("17/05/2022", "19:30", 3,2,time_01,time_02, estadio1);

        //Exibe partida

        System.out.println("-------------Jogo 01 ---------------- ");

        System.out.println(partida01.getTimeA().getPais() + "  X  " + partida01.getTimeB().getPais());
        System.out.println( "Local: " + partida01.getEstadio().getNome() +" Cidade: "+ partida01.getEstadio().getCidade());
        System.out.println( "Dia: " + partida01.getData());
        System.out.println( "Horario: " + partida01.getHora());

        System.out.println();

        //Exibe jogadores

        System.out.println("Jogadores: " + partida01.getTimeA().getPais() );
        for (Jogador j: time_01.getJogadores()){
            System.out.println(j.getNome() );
        }

        System.out.println();

        System.out.println("Jogadores: " + partida01.getTimeB().getPais());
        for (Jogador j: time_02.getJogadores()){
            System.out.println(j.getNome() +" Camisa: "+ j.getNumeroCamisa() );
        }

        System.out.println();

        System.out.println("-----------1 tempo---------------- ");
        System.out.println(partida01.getTimeA().getPais() + "  X  " + partida01.getTimeB().getPais());
        System.out.println( "Placar: " + partida01.getPlacarTime1() +"  X  "+ partida01.getPlacarTime2());


        //atualiza partida

        partida01.atualizarResuldado(3,4);

        System.out.println("-----------2 tempo---------------- ");
        System.out.println(partida01.getTimeA().getPais() + "  X  " + partida01.getTimeB().getPais());
        System.out.println( "Placar: " + partida01.getPlacarTime1() +"  X  "+ partida01.getPlacarTime2());



    }
}
