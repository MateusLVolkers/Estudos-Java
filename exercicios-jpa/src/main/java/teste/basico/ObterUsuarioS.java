package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarioS {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager entityManager = emf.createEntityManager();
		
		
		// Na prox linha, Usuario é o nome da classe no projeto e não a tabela no banco de dados.
		String jpql = "SELECT u FROM Usuario u";
		
		//Parâmetros: consulta e a classe que quer no retorno, no caso, classe usuário.
		TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);
		query.setMaxResults(3);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println();
		}
		
		
		emf.close();
		entityManager.close();
	}

}
