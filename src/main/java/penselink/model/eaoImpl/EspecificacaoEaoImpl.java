package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import penselink.model.eao.EspecificacaoEao;
import penselink.model.entidades.Especificacao;
import penselink.util.dbSingleton;

@Component
public class EspecificacaoEaoImpl implements EspecificacaoEao{

	private EntityManager entityManager;
	
	public void cadastrar(Especificacao especificacao){
		
		entityManager = dbSingleton.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(especificacao);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}
	
	public Especificacao getById(Integer id){
		entityManager = dbSingleton.getEntityManager();
		return (Especificacao)entityManager.find(Especificacao.class, id);
	}

	public List<Especificacao> listar() {
		entityManager = dbSingleton.getEntityManager();
		Query query = entityManager.createNamedQuery("Especificacao.recuperarTodos");
		return (List<Especificacao>) query.getResultList();
	}

	public boolean deletar(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		try{
			entityManager.remove(getById(id));
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			entityManager.close();
		}
	}
}
