package penselink.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import penselink.model.eao.MarcaEao;
import penselink.model.entidades.Marca;
import penselink.service.MarcaService;

@Component
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaEao marcaEao;
	
	public void cadastrar(Marca marca) {
		marcaEao.cadastrar(marca);	
	}

	public Marca getById(Integer id) {
		return marcaEao.getById(id);
	}
	
	public List<Marca> listar(){
		return marcaEao.listar();
	}

	public boolean remover(Integer id) {
		return marcaEao.deletar(id);
	}
	
}
