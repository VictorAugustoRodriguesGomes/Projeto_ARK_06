package ark06;

import java.util.Scanner;

public class ARK06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PlayersMetodos playersMetodos = new PlayersMetodos();

        String idPlayers;
        String nomePlayers;
        String rankPlayers;
        boolean valor = true;
        int opcao;

        do {
            System.out.println("");
            System.out.println("------MENU------");
            System.out.println("1- Adicionar um novo player de rank bronze");
            System.out.println("2- Adicionar um novo player");
            System.out.println("3- Lista de todos os players");
            System.out.println("4- Apagar todos os players");
            System.out.println("5- Finalizar o sistema");

            try {
                opcao = input.nextInt();
            } catch (Exception e) {
                System.out.println("Opção invalida");
                System.out.println("");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("");
                    System.out.println("Digite o id do player");
                    idPlayers = input.next();
                    System.out.println("");
                    System.out.println("Digite o nome do player");
                    nomePlayers = input.next();
                    System.out.println("");
                    playersMetodos.AdicionarPlayers(idPlayers, nomePlayers);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Digite o id do player");
                    idPlayers = input.next();
                    System.out.println("");
                    System.out.println("Digite o nome do player");
                    nomePlayers = input.next();
                    System.out.println("");
                    System.out.println("Digite o rank do player");
                    rankPlayers = input.next();
                    playersMetodos.AdicionarPlayers(idPlayers, nomePlayers, rankPlayers);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    playersMetodos.ListaPlayers();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    playersMetodos.Apagar();
                    System.out.println("");
                    break;
                case 5:
                    valor = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println("");
                    break;
            }
        } while (valor != false);
    }
}
