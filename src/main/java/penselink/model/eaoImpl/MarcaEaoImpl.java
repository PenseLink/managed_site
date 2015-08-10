package penselink.model.eaoImpl;

import java.util.Calendar;
import java.util.Date;
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
			Date data = new Date();
			marca.setDataCadastro(data);
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
		Query query = entityManager.createNamedQuery("Marca.recuperarTodosOrdenadoPorDataCadastro");
		return (List<Marca>)query.getResultList();
	}
	
	public List<Marca> listarComPaginacao(int firstResult, int maxResults){
		entityManager = dbSingleton.getEntityManager();
		Query query = entityManager.createNamedQuery("");
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		return (List<Marca>)query.getResultList();
	}
	
	public boolean deletar(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		try{
			entityManager.getTransaction().begin();
			Marca marca = getById(id);
			entityManager.remove(marca);
			entityManager.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			entityManager.close();
		}
	}

	public void editar(Marca marca) {
		entityManager = dbSingleton.getEntityManager();
		try{
			entityManager.getTransaction().begin();
			entityManager.merge(marca);
			entityManager.getTransaction().commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

}
