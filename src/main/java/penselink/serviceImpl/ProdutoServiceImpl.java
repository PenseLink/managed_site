package penselink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.ProdutoEao;
import penselink.model.entidades.Produto;
import penselink.service.ProdutoService;

@Component
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoEao produtoEao;
	
	public void cadastrar(Produto produto) {
		produtoEao.cadastrar(produto);
	}

	public Produto getById(Integer id) {
		return produtoEao.getById(id);
	}
}
