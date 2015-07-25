package penselink.model.eao;

import java.util.List;

import penselink.model.entidades.Especificacao;

public interface EspecificacaoEao {
	
	public void cadastrar(Especificacao especificacao);
	
	public Especificacao getById(Integer id);
	
	public List<Especificacao> listar();
	
	public boolean deletar (Integer id);
}
