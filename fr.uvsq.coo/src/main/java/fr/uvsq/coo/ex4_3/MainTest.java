package fr.uvsq.coo.ex4_3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {
	
	private static final String PERSISTENCE_UNIT_NAME="Personnel";
	private static EntityManagerFactory factory;
	
	public static void  main(String []args){
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Personnel personnel = new Personnel();
				
		personnel.setId(2);
		personnel.setNom("nom1");
		personnel.setPrenom("prenom1");
		
		em.persist(personnel);
		em.getTransaction().commit();
		em.close();
	}

}
