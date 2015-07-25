package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Tipo;

public interface TipoEao {
	public void cadastrar(Tipo tipo);
	
	public Tipo getById(Integer id);
	
	public List<Tipo> listar();
	
	public boolean deletar ();
}
