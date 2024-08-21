package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager entityManager = emf.createEntityManager();
		
		
		entityManager.getTransaction().begin();
		
		Usuario usuario = entityManager.find(Usuario.class, 1L);
		usuario.setNome("Pedro");
		usuario.setEmail("pedro@pedro.com");
		
		entityManager.merge(usuario);
		entityManager.getTransaction().commit();
		
		emf.close();
		entityManager.close();
	}

}
