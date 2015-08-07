package penselink.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.UsuarioEao;
import penselink.model.entidades.Usuario;
import penselink.service.UsuarioService;

@Component
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioEao usuarioEao;
	
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		
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
		return usuarioEao.validarUsuario(usuario);
	}

	public boolean existeUsuario(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
