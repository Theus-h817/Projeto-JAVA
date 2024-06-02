package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    // Método de Conexão
    public static String status = "Conexão não estabelecida!";

    public static Connection getConexao() {
        Connection conn = null; // Atributo do tipo Connection

        try {
            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);

            // Configurando os parâmetros da conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/sigecom"; // Nome do banco de dados alterado para sigecom
            String username = "root"; // Nome de usuário padrão do MySQL
            String password = ""; // Senha padrão vazia
            conn = DriverManager.getConnection(url, username, password);

            // Testa a conexão
            if (conn != null) {
                status = ("Conectado com sucesso!");
            } else {
                status = ("Não foi possível realizar conexão");
            }
            return conn;

        } catch (ClassNotFoundException e) {
            // Se o driver não for encontrado 
            JOptionPane.showMessageDialog(null, "O driver de conexão não foi encontrado.");
            return null;

        } catch (SQLException e) {
            // Se não for possível se conectar ao banco 
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao Banco de Dados.");
            return null;
        }
    }

    // Método que retorna o status da conexão
    public static String statusConexao() {
        return status;
    }

    // Método que fecha a conexão
    public static boolean fecharConexao() {
        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static Connection reiniciarConexao() {
        fecharConexao();
        return Conexao.getConexao();
    }

}
