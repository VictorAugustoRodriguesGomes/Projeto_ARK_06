package ark06;

import java.util.ArrayList;

public class PlayersMetodos {

    ArrayList<Players> players = new ArrayList<>();

    public ArrayList<Players> AdicionarPlayers(String idPlayers, String nomePlayers) {
        Players p = new Players(idPlayers, nomePlayers, "Bronze");
        players.add(p);
        System.out.println("Player cadastrado com sucesso!");
        return null;
    }

    public ArrayList<Players> AdicionarPlayers(String idPlayers, String nomePlayers, String rankPlayers) {
        Players p = new Players(idPlayers, nomePlayers, rankPlayers);
        players.add(p);
        System.out.println("");
        System.out.println("Player cadastrado com sucesso!");
        return null;
    }

    public ArrayList<Players> ListaPlayers() {
        int lista = players.size();
        for (int i = 0; i < lista; i++) {
            System.out.println("");
            System.out.println(" ID: " + players.get(i).getIdPlayers());
            System.out.println(" Nome: " + players.get(i).getNomePlayers());
            System.out.println(" Rank: " + players.get(i).getRankPlayers());
        }
        
        if (lista == 0) {
            System.out.println("");
            System.out.println("Lista de players vazia!");
        }
        return null;
    }

    public ArrayList<Players> Apagar() {
        players.clear();
        System.out.println("");
        System.out.println("Lista de players vazia!");
        return null;
    }
}
