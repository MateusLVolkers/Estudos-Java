package utilizandoBancoDados;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		String sqlIncluir = "INSERT INTO pessoas (nome) VALUES (?)";
		
		System.out.println(dao.incluir(sqlIncluir, "Mateus"));
		System.out.println(dao.incluir(sqlIncluir, "Zé"));
		System.out.println(dao.incluir(sqlIncluir, "Mesquita"));
		
		dao.close();
	}
}
