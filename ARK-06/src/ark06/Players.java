package ark06;

import javax.print.DocFlavor;

public class Players {

    private String idPlayers;
    private String nomePlayers;
    private String rankPlayers;

    public Players(String idPlayers, String nomePlayers, String rankPlayers) {
        this.idPlayers = idPlayers;
        this.nomePlayers = nomePlayers;
        this.rankPlayers = rankPlayers;
    }

    public String getIdPlayers() {
        return idPlayers;
    }

    public void setIdPlayers(String idPlayers) {
        this.idPlayers = idPlayers;
    }

    public String getNomePlayers() {
        return nomePlayers;
    }

    public void setNomePlayers(String nomePlayers) {
        this.nomePlayers = nomePlayers;
    }

    public String getRankPlayers() {
        return rankPlayers;
    }

    public void setRankPlayers(String rankPlayers) {
        this.rankPlayers = rankPlayers;
    }
}
