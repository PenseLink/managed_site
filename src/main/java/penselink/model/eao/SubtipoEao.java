package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Subtipo;



public interface SubtipoEao {
	
	public void cadastrar(Subtipo subtipo);
	
	public Subtipo getById(Integer id);
	
	public List<Subtipo> listar();
	
	public boolean deletar ();
}
