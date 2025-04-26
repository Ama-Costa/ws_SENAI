package entidade;

public class Cliente {
    //id_cliente, id_pessoa
    private int id_cliente;
    private int id_pessoa;

    public Cliente(int id_cliente, int id_pessoa) {
        this.id_cliente = id_cliente;
        this.id_pessoa = id_pessoa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
}
