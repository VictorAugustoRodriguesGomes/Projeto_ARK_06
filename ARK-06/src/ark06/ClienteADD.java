package ark06;

import java.util.ArrayList;

public class ClienteADD {

    ArrayList<Cliente> clientelista = new ArrayList<>();

    public ArrayList<Cliente> AdicionarCliente(String idCliente, String NomeCliente) {
        Cliente c = new Cliente(idCliente, NomeCliente, "Padrão");
        clientelista.add(c);
        System.out.println("Cliente Cadastrado");
        return null;

    }

    public ArrayList<Cliente> AdicionarCliente(String idCliente, String NomeCliente, String tipoCliente) {
        Cliente c = new Cliente(idCliente, NomeCliente, tipoCliente);
        clientelista.add(c);
        System.out.println("");
        System.out.println("Cliente Vip Cadastrado");
        return null;

    }

    public ArrayList<Cliente> ListaCliente() {
        int lista = clientelista.size();
        for (int i = 0; i < lista; i++) {
            System.out.println("");
            System.out.println(" ID: " + clientelista.get(i).getIdCliente());
            System.out.println(" Nome: " + clientelista.get(i).getNomeCliente());
            System.out.println(" Tipo: " + clientelista.get(i).getTipoCliente());
            
        }
        if (lista == 0) {
            System.out.println("");
            System.out.println("Lista vazia");
        }
        return null;
    }

    public ArrayList<Cliente> Apagar() {
        clientelista.clear();
        System.out.println("");
        System.out.println("Lista vazia");
        return null;
    }

}
