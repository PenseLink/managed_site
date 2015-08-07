package penselink.service;

import java.util.List;

import penselink.model.entidades.Usuario;

public interface UsuarioService {
	
public void cadastrar(Usuario usuario);
	
	public List<Usuario> listar ();
	
	public Usuario getById (Integer id);
	
	public boolean deletar (Integer id);
	
	public Usuario validarUsuario (Usuario usuario);
	
	public boolean existeUsuario (String username);

}
