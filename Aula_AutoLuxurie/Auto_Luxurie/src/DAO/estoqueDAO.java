package DAO;

import entidade.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.ConnectionMysql;

public class estoqueDAO {
    public Estoque createEstoque(Estoque estoque) {
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            // Abrindo conexão com o Banco de dados.
            conn = ConnectionMysql.openConnection();

            // Query a ser executada
            String sql = "INSERT INTO estoque(marca, modelo, cor, data_fabricacao) VALUES (?, ?, ?, ?)";

            // Statement responsável por executar a query
            statement = conn.prepareStatement(sql);
            statement.setString(1, estoque.getMarca());
            statement.setString(2, estoque.getModelo());
            
            statement.setString(3, estoque.getCor());
            statement.setDate(4, (new java.sql.Date(estoque.getAno().getTime()))); // Usa o setDate para um objeto java.sql.Date

            // Executa a query
            statement.executeUpdate();

            System.out.println("Estoque inserido com sucesso!");

            return estoque; // Retorna o objeto inserido
        } catch (SQLException e) {
            System.out.println("Erro ao inserir estoque: " + e.getMessage());
            return null; // Retorna null em caso de erro
        } finally {
            // Fecha o PreparedStatement e a conexão
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}