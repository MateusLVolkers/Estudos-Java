package utilizandoBancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String stringDeConexao = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "Mlv-17091991";
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		System.out.println("Conexão efetuada com sucesso");
		
		
		
		conexao.close();
	}

}
