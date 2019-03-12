package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import javamavenhibernate.HibernateUtil;

public class DaoGeneric<E> {
	
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
		
	}
	
	public E updateMerge(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		E entidadeSalva = entityManager.merge(entidade);
		transaction.commit();
		
		return entidadeSalva;
	
	}
	
	
	public E pesquisar(Long id, Class<E> entidade) {
//		Object id = HibernateUtil.getPimaryKey(entidade);
		E e = (E) entityManager.find(entidade, id);
		
		return e;		
	}

}
