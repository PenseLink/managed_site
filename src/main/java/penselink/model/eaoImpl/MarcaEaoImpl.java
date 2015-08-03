package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import penselink.model.eao.MarcaEao;
import penselink.model.entidades.Marca;
import penselink.util.dbSingleton;

@Component
public class MarcaEaoImpl implements MarcaEao{

	private EntityManager entityManager;
	
	public void cadastrar(Marca marca) {
		entityManager = dbSingleton.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(marca);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

	public Marca getById(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		return (Marca)entityManager.find(Marca.class, id);
	}

	public List<Marca> listar() {
		entityManager = dbSingleton.getEntityManager();
		Query query = entityManager.createNamedQuery("Marca.recuperarTodos");
		return (List<Marca>)query.getResultList();
	}

	public boolean deletar(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		try{
			Marca marca = getById(id);
			entityManager.merge(marca);
			entityManager.remove(marca);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			entityManager.close();
		}
	}

}
