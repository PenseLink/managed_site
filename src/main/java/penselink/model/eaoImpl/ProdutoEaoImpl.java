package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import penselink.model.eao.ProdutoEao;
import penselink.model.entidades.Produto;
import penselink.util.dbSingleton;

@Component
public class ProdutoEaoImpl implements ProdutoEao{

	private EntityManager entityManager;
	
	public void cadastrar(Produto produto) {
		entityManager = dbSingleton.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(produto);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

	public Produto getById(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		return (Produto)entityManager.find(Produto.class, id);
	}

	public List<Produto> listar() {
		entityManager = dbSingleton.getEntityManager();
		Query query = entityManager.createNamedQuery("Produto.recuperarTodos");
		return (List<Produto>) query.getResultList();
	}

	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}
}
