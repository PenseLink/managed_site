package penselink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.TipoEao;
import penselink.model.entidades.Tipo;
import penselink.service.TipoService;

@Component
public class TipoServiceImpl implements TipoService{

	@Autowired
	private TipoEao tipoEao;
	
	public void cadastrar(Tipo tipo) {
		tipoEao.cadastrar(tipo);
	}

	public Tipo getById(Integer id) {
		return tipoEao.getById(id);
	}

}
