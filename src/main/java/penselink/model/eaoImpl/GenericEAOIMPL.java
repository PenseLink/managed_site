package penselink.model.eaoImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import penselink.model.eao.GenericEAO;

public class GenericEAOIMPL <T , PK extends Serializable> implements GenericEAO<T, PK>{

	protected Class<T> entityClass;
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public GenericEAOIMPL() {
		ParameterizedType genericSuperClass = (ParameterizedType)getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperClass.getActualTypeArguments()[0];
	}
	
	@Override
	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	@Override
	public T read(PK id) {
		return this.entityManager.find(entityClass, id);
	}

	@Override
	public T update(T t) {
		return this.entityManager.merge(t);
	}

	@Override
	public void delete(T t) {
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}

	@Override
	public List<T> findAll() {
		return entityManager.createQuery(("FROM "+ getClass().getName())).getResultList();
	}
}
