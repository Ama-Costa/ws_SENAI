package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal; // USAR DOUBLE NO SALARIO
import entidade.Funcionario;
import util.ConnectionMysql;

public class funcionarioDAO {

    public Funcionario createFuncionario(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionMysql.openConnection();

            String sql = "INSERT INTO (id_pessoa, cargo, salario, setor, satus) VALUES(?, ?, ?, ?, ?)";

            statement = conn.prepareStatement(sql);

            statement.setInt(1, funcionario.getId_pessoa());
            statement.setString(2, funcionario.getCargo());
            statement.setBigDecimal(3, funcionario.getSalario());
            statement.setString(4, funcionario.getSetor());
            statement.setInt(5, funcionario.getStatus());

            statement.executeUpdate();

            System.out.println("Funcionario(s) inserido com sucesso!");

            return funcionario;
        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR FUNCIONARIO: " + e.getMessage());
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
