package penselink.model.eaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import penselink.model.eao.UsuarioEao;
import penselink.model.entidades.Usuario;
import penselink.util.dbSingleton;

@Component
public class UsuarioEaoImpl implements UsuarioEao{

	private EntityManager entityManager;
	
	public void cadastrar(Usuario usuario) {
		entityManager = dbSingleton.getEntityManager();
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(usuario);
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entityManager.close();
		}
	}

	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
