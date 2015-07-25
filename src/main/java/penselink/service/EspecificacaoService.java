package penselink.service;

import penselink.model.entidades.Especificacao;

public interface EspecificacaoService {
	
	public void cadastrar(Especificacao especificacao);
	
	public Especificacao getById(Integer id);

}
