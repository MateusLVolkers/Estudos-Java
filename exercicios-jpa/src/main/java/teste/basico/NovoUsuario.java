package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager entityManager = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("erro", "erro1234@gmail.com");

		entityManager.getTransaction().begin();
		entityManager.persist(novoUsuario);
		entityManager.getTransaction().commit();
		
		emf.close();
		entityManager.close();
	}
}
