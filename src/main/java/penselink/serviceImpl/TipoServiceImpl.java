package penselink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.dao.TipoDAO;
import penselink.model.entidades.Tipo;
import penselink.service.TipoService;

@Component
public class TipoServiceImpl implements TipoService{

	@Autowired
	private TipoDAO tipoDAO;
	
	public void cadastrar(Tipo tipo) {
		tipoDAO.salvar(tipo);
	}

	public Tipo getById(Integer id) {
		return new Tipo();
	}

}
