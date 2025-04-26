package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {

    private static final String URL = "jdbc:mysql://localhost:3306/auto_luxurrie";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    // Método para abrir conexão
    public static Connection openConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Problemas ao se conectar com banco de dados! " + e.getMessage());
        }
        return connection;
    }

    // Método para fechar conexão
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Problemas ao fechar conexão: " + e.getMessage());
        }
    }
}
