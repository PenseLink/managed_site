package penselink.service;

import penselink.model.entidades.Produto;


public interface ProdutoService {
	
	public void cadastrar(Produto produto);
	
	public Produto getById(Integer id);
}
