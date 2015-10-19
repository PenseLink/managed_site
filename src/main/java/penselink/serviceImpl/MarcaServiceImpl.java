package penselink.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import penselink.model.eao.MarcaEao;
import penselink.model.entidades.Marca;
import penselink.model.entidades.Produto;
import penselink.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaEao marcaEao;
	
	public void cadastrar(Marca marca) {
		marcaEao.cadastrar(marca);	
	}

	public Marca getById(Integer id) {
		Marca marca = marcaEao.getById(id);
		return marca;
	}
	
	@Transactional(readOnly = true)
	public List<Marca> listar(){
		//List<Marca> marcas = marcaEao.listar();
		/*for (Marca m : marcas){
			for(Produto p : m.getListaDeProdutos()){
				
			}
		}
		*/
		return marcaEao.listar();
	}

	public boolean remover(Integer id) {
		return marcaEao.deletar(id);
	}

	public void editar(Marca marca) {
		marcaEao.editar(marca);
	}
	
}
