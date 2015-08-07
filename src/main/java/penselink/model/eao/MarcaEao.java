package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Marca;

public interface MarcaEao {
	
	public void cadastrar(Marca marca);
	
	public void editar(Marca marca);
	
	public Marca getById(Integer id);
	
	public List<Marca> listar();
	
	public boolean deletar (Integer id);

}
