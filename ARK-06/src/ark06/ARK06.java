package ark06;

import java.util.Scanner;

public class ARK06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClienteADD cliente = new ClienteADD();

        boolean valor;
        valor = true;

        String idCliente;
        String nomeCliente;
        String tipoCliente;
        do {
            System.err.println("");
            System.out.println("------MENU------");
            System.out.println("1- Adicionar Cliente");
            System.out.println("2- Adicionar Cliente VIP");
            System.out.println("3- lista de Cliente");
            System.out.println("4- Apagar Cliente");
            System.out.println("5- Sair");
            int opcao = input.nextInt();
            System.err.println("");
            switch (opcao) {
                case 1:
                    System.out.println("Digite o id do cliente");
                    idCliente = input.next();
                    System.out.println("Digite o nome do cliente");
                    nomeCliente = input.next();
                    cliente.AdicionarCliente(idCliente, nomeCliente);
                    break;
                case 2:
                    System.out.println("Digite o id do cliente");
                    idCliente = input.next();
                    System.out.println("Digite o nome do cliente");
                    nomeCliente = input.next();
                    System.out.println("Digite o tipo de cliente");
                    tipoCliente = input.next();
                    cliente.AdicionarCliente(idCliente, nomeCliente, tipoCliente);
                    break;
                case 3:
                    cliente.ListaCliente();
                    break;
                case 4:
                    cliente.Apagar();
                    break;
                case 5:
                    valor = false;
                    break;
                default:
                    System.out.println("Opoção invalida");
                    break;
            }
        } while (valor != false);
    }
}
