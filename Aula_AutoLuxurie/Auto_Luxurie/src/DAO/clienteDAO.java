package DAO;

import entidade.Cliente;
import util.ConnectionMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clienteDAO {

    public Cliente createCliente(Cliente cliente) {
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionMysql.openConnection();

            String sql = "INSERT INTO cliente(id_pessoa) VALUES (?)";

            statement = conn.prepareStatement(sql);

            // Como o id_pessoa já foi gerado na tabela pessoa, usamos ele aqui
            statement.setInt(1, cliente.getId_pessoa());

            //Executa a query
            statement.executeUpdate();

            System.out.println("Cliente(s) inserido(s) com sucesso!");

            return cliente;
        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR CLIENTE: " + e.getMessage());
            return null;
        } finally {
            // FECHAR PreparedStatement E CONEXAO
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }
    }
}
