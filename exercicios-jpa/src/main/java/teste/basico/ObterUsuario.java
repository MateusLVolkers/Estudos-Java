package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager entityManager = emf.createEntityManager();
		
		Usuario usuario = entityManager.find(Usuario.class, 2L);
		System.out.println("O usuário de ID 2 é " + usuario.getNome());
		
		
		emf.close();
		entityManager.close();
	}

}
