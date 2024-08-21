package utilizandoBancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException{		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Digite o novo nome: ");
		String novoNome = entrada.nextLine();
		
		System.out.println("Digite o ID: ");
		int ID = Integer.parseInt(entrada.nextLine());
		
		String queryAtualizar = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(queryAtualizar);
		
		stmt.setString(1, novoNome);
		stmt.setInt(2, ID);
		
		stmt.execute();
		
		
		System.out.println("Atualizado com sucesso");
		entrada.close();
		conexao.close();
		stmt.close();
	}

}
