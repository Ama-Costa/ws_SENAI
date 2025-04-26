package DAO;

import entidade.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionMysql;

public class pessoaDAO {

    public Pessoa createPessoa(Pessoa pessoa){
        Connection conn = null;
        PreparedStatement statement = null;

        try{
            //ABRINDO CONEXAO COM O MYSQL/BANCO DE DADOS
            conn = ConnectionMysql.openConnection();

            String sql = "INSERT INTO pessoa(cpf, nome, data_nasc, email, telefone) VALUES (?, ?, ?, ?, ?)";

            statement = conn.prepareStatement(sql);
            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getNome());
            statement.setDate(3, new java.sql.Date(pessoa.getData_nasc().getTime()));
            statement.setString(4, pessoa.getEmail());
            statement.setString(5, pessoa.getTelefone());

            // EXECUTA A QUERY
            statement.executeUpdate();

            System.out.println("Pessoa(s) inserida(s) com sucesso!");

            return pessoa;
        }catch (SQLException e){
            System.out.println("Erro ao inserir pessoa: " + e.getMessage());
            return null;
        }finally{
            //Fecha o preparedStatement e a conexão
            try{
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e){
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }


    }
}
