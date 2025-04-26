package entidade;

import java.math.BigDecimal;

public class Funcionario {
    //id_funcionario, id_pessoa, cargo, salario, setor, status
    private int id_funcionario;
    private int id_pessoa;
    private String cargo;
    private BigDecimal salario;
    private String setor;
    private int status;

    public Funcionario(int id_funcionario, int id_pessoa, String cargo, BigDecimal salario, String setor, int status) {
        this.id_funcionario = id_funcionario;
        this.id_pessoa = id_pessoa;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
        this.status = status;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    




}
