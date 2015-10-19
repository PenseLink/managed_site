package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import penselink.model.eao.UsuarioEao;
import penselink.model.entidades.Usuario;
import penselink.util.dbSingleton;

@Component
public class UsuarioEaoImpl implements UsuarioEao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED ,readOnly=false)
	public void cadastrar(Usuario usuario) {
		entityManager.persist(usuario);			
	}

	public List<Usuario> listar() {
		Query query = entityManager.createNamedQuery("Usuario.recuperarTodos");
		return (List<Usuario>) query.getResultList();
	}

	public Usuario getById(Integer id) {
		return entityManager.find(Usuario.class, id);
	}

	public boolean deletar(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario validarUsuario(Usuario usuario) {
		entityManager = dbSingleton.getEntityManager();
		try{
			Query query = entityManager.createNamedQuery("Usuario.validaUsuario");
			query.setParameter("username", usuario.getUsername());
			query.setParameter("password", usuario.getPassword());
			Usuario usuarioBuscado = (Usuario)query.getSingleResult();
			
			if (usuarioBuscado.getUsername()==usuario.getUsername() &&
					usuarioBuscado.getPassword()==usuario.getPassword()){
				return usuarioBuscado;
			}
			else 
				return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			entityManager.close();
		}
	}

	public boolean existeUsuario(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
