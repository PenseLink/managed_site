package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import penselink.model.eao.SubtipoEao;
import penselink.model.entidades.Subtipo;
import penselink.util.dbSingleton;

@Component
public class SubtipoEaoImpl implements SubtipoEao{

	private EntityManager entityManager;
	
	public void cadastrar(Subtipo subtipo) {
		entityManager = dbSingleton.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(subtipo);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

	public Subtipo getById(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		return (Subtipo)entityManager.find(Subtipo.class, id);
	}

	public List<Subtipo> listar() {
		entityManager = dbSingleton.getEntityManager();
		Query query = entityManager.createNamedQuery("Subtipo.recuperarTodos");
		return (List<Subtipo>) query.getResultList();
	}

	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}

}
