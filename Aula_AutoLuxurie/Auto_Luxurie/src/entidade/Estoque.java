package entidade;


import java.sql.Date;

public class Estoque {
    private int id;
    private String marca;
    private String modelo;
    private Date ano;
    private String cor;

    public Estoque(Date ano, String cor, int id, String marca, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Estoque() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
