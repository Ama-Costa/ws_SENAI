import util.ConnectionMysql;
import java.sql.Date;
import java.time.LocalDate;
import DAO.estoqueDAO;
import entidade.Estoque;

public class Principal2 {
    public static void main(String[] args) {
        System.out.println("Testando cadastro da Ferrari F50...");


            // Abre a conexão com o banco de dados
            ConnectionMysql.openConnection();

            // Criar instância de EstoqueDAO
            estoqueDAO estoqueDAO = new estoqueDAO();

            // Criar e inserir a Ferrari F50
            Estoque estoque = new Estoque();
            estoque.setMarca("Ferrari");
            estoque.setModelo("F50");
            estoque.setAno(Date.valueOf(LocalDate.of(1995, 1, 1))); // Definindo o ano de fabricação
            estoque.setCor("Preta");

            // Inserir o estoque no banco de dados
            estoqueDAO.createEstoque(estoque);

            System.out.println("Ferrari F50 preta cadastrada com sucesso!");


    }
}