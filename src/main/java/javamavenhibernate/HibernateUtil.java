package javamavenhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Estaciando a conexão com o banco
public class HibernateUtil {
	
	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	
	private static void init() {
		
		try {
			//Go to [ persistence.xml ]
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("java-maven-hibernate");
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); /*Responsavel por prover a parte de persistencia de dados  */
	}
	
	public static Object getPimaryKey(Object entity) {// Retorna a primary key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
	}
	

}
