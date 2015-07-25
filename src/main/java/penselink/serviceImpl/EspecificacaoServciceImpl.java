package penselink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.EspecificacaoEao;
import penselink.model.entidades.Especificacao;
import penselink.service.EspecificacaoService;

@Component
public class EspecificacaoServciceImpl implements EspecificacaoService{

	@Autowired
	private EspecificacaoEao especificacaoEao;
	
	public void cadastrar(Especificacao especificacao) {
		especificacaoEao.cadastrar(especificacao);
	}

	public Especificacao getById(Integer id) {
		return especificacaoEao.getById(id);
	}

}
