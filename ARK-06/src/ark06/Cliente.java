package ark06;

import javax.print.DocFlavor;

public class Cliente {

    private String idCliente;
    private String nomeCliente;
    private String tipoCliente;

    public Cliente(String idCliente, String nomeCliente, String tipoCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.tipoCliente = tipoCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
