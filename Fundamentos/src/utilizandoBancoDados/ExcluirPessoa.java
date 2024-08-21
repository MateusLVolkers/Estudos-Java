package utilizandoBancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o código da pessoa a ser removida: ");
		int codigo = scanner.nextInt();
		
		
		String excluirPessoa = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(excluirPessoa);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa removida com sucesso!");
		} else {
			System.out.println("Não houve alteração na tabela.");
		}
		
		
		conexao.close();
		scanner.close();
		stmt.close();
	}

}
