package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;

import penselink.model.eao.TipoEao;
import penselink.model.entidades.Tipo;
import penselink.util.dbSingleton;

@Component
public class TipoEaoImpl implements TipoEao{

	private EntityManager entityManager;
	
	public void cadastrar(Tipo tipo) {
		entityManager = dbSingleton.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(tipo);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

	public Tipo getById(Integer id) {
		entityManager = dbSingleton.getEntityManager();
		return (Tipo)entityManager.find(Tipo.class, id);
	}

	public List<Tipo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deletar() {
		// TODO Auto-generated method stub
		return false;
	}

}
