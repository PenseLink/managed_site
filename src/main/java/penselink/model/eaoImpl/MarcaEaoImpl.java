package penselink.model.eaoImpl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import penselink.model.eao.MarcaEao;
import penselink.model.entidades.Marca;

@Repository
public class MarcaEaoImpl implements MarcaEao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED ,readOnly=false)
	public void cadastrar(Marca marca) {
		entityManager.persist(marca);		
	}

	public Marca getById(Integer id) {
		return (Marca)entityManager.find(Marca.class, id);
	}

	public List<Marca> listar() {
		Query query = entityManager.createNamedQuery("Marca.recuperarTodosOrdenadoPorDataCadastro");
		return (List<Marca>)query.getResultList();
	}
	
	public List<Marca> listarComPaginacao(int firstResult, int maxResults){
		Query query = entityManager.createNamedQuery("");
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		return (List<Marca>)query.getResultList();
	}
	
	@Transactional(propagation=Propagation.REQUIRED ,readOnly=false)
	public boolean deletar(Integer id) {
		try{	
			Marca marca = getById(id);
			entityManager.remove(marca);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED ,readOnly=false)
	public void editar(Marca marca) {
		entityManager.merge(marca);
	}

}
