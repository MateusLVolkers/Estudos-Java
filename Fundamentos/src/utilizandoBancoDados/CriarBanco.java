package utilizandoBancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
//		final String stringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
//		final String usuario = "root";
//		final String senha = "Mlv-17091991";
//		Connection conexao =  DriverManager.getConnection(stringDeConexao, usuario, senha);
		
		Connection conexao = FabricaConexao.getConexao();
		System.out.println("Conexão efetuada com sucesso");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		System.out.println("Banco criado com sucesso");
		
		conexao.close();
	}

}
