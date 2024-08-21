package utilizandoBancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Digite o parâmetro de busca: ");
		String param = entrada.next();
		
		String queryFiltro = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(queryFiltro);
		stmt.setString(1, "%" + param + "%");
		
		ResultSet resultado = stmt.executeQuery();

		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " >>> " + p.getNome());
		}
		
		stmt.close();
		entrada.close();
		conexao.close();
	}

}
