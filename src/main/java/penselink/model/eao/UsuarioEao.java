package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Usuario;

public interface UsuarioEao {
	
	public void cadastrar(Usuario usuario);
	
	public List<Usuario> listar ();
	
	public Usuario getById (Integer id);
	
	public boolean deletar (Integer id);
	
	public Usuario validarUsuario (Usuario usuario);
	
	public boolean existeUsuario (String username);

}
