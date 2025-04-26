import util.ConnectionMysql;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Testando App...");

        try {
            // Abre a conexão com o banco de dados
            ConnectionMysql.openConnection();
            // Aqui você pode realizar operações no banco de dados, se necessário.
        } catch (Exception e) {
            System.out.println("Erro ao abrir a conexão: " + e.getMessage());
        } finally {
            // Fecha a conexão com o banco de dados
            ConnectionMysql.closeConnection();
        }

    }

}