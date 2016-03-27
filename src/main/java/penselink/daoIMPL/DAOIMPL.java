package penselink.daoIMPL;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import penselink.dao.DAO;


public abstract class DAOIMPL<T> implements DAO<T>{

	/**
	 * Número que identifica a classe
	 */
	private static final long serialVersionUID = -6903216350356715551L;
	
	private final Class<T> classeEntidade; 
	private final String nomeEntidade;

	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	protected DAOIMPL(){
		Type type = this.getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType){
			this.classeEntidade = (Class<T>) ((ParameterizedType)type).getActualTypeArguments()[0];
			this.nomeEntidade = this.classeEntidade.getSimpleName();
		}else{
			this.classeEntidade = null;
			this.nomeEntidade = null;
		}
	}
	
	public Session getSession (){
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	@Transactional
	@Override
	public void salvar(T entidade) {
		try {
			Session session = getSession();
			session.saveOrUpdate(entidade);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Transactional
	@Override
	public void salvar(Collection<T> entidades) {
		for(T entidade : entidades){
			try {
				Session session = getSession();
				session.saveOrUpdate(entidade);
				session.flush();
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public Collection<T> listarTodos() {
		Criteria criteria = getSession().createCriteria(classeEntidade);
		return criteria.list();
	}

	@Override
	public Collection<T> listarPaginacao(Integer inicio, Integer fim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remocaoFisica(T entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remocaoLogica(T entidade) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void atualizar(T entidade) {
		try {
			Session session = getSession();
			session.saveOrUpdate(entidade);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public String getNomeEntidade() {
		return nomeEntidade;
	}

	public Class<T> getClasseEntidade() {
		return classeEntidade;
	}

}
