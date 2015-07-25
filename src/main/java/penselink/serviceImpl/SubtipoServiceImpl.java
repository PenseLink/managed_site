package penselink.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.SubtipoEao;
import penselink.model.entidades.Subtipo;
import penselink.service.SubtipoService;

@Component
public class SubtipoServiceImpl implements SubtipoService{

	@Autowired
	private SubtipoEao subtipoEao;
	
	public void cadastrar(Subtipo subtipo) {
		subtipoEao.cadastrar(subtipo);
	}

	public Subtipo getById(Integer id) {		
		return subtipoEao.getById(id);
	}

}
