package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexao {

    private static Connection conexao;
    public static String base = "fazenda";
    
    String usuario = "igor";
    String pass = "igor";

    public conexao() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;database=" + base + ";" + "user=" + usuario + ";password=" + pass;
            conexao = DriverManager.getConnection(url);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !" + "\n" + erro.getMessage(), "Conexão", 3);
            erro.printStackTrace();
        }
    }

    // Metodos pblicos:
    public Connection getConexao() {
        return conexao;
    }

}
