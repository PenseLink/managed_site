package penselink.service;

import java.util.List;

import penselink.model.entidades.Marca;

public interface MarcaService {
	public void cadastrar(Marca marca);
	
	public Marca getById(Integer id);
	
	public List<Marca> listar ();
	
	public boolean remover(Integer id);
}
