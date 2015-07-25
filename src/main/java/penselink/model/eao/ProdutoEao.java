package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Produto;



public interface ProdutoEao {
	
	public void cadastrar(Produto produto);
	
	public Produto getById(Integer id);
	
	public List<Produto> listar();
	
	public boolean deletar ();

}
