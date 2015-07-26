package penselink.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import penselink.model.entidades.Marca;
import penselink.model.entidades.Produto;
import penselink.model.entidades.Tipo;
import penselink.service.MarcaService;
import penselink.service.ProdutoService;
import penselink.service.SubtipoService;
import penselink.service.TipoService;

@Controller
public class TestaController {
	
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping("/marca/testeInsere")
	public String testaInsereMarca(){
		Marca marca = new Marca();
		marca.setNome("Brastemp");
		marcaService.cadastrar(marca);
		return "testa";
	}
	
	@Autowired
	private TipoService tipoService;
	
	@RequestMapping("/tipo/testeInsere")
	public String testaInsereTipo(){
		Tipo tipo = new Tipo();
		tipo.setDescricao("Informática");
		tipoService.cadastrar(tipo);
		return "testa";
	}
	
	@Autowired
	private SubtipoService subtipoService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produto/testeInsere")
	public String testaInsereProduto(){
		Produto produto = new Produto();
		produto.setDescricao("Notebook HMOSKHE3000");
		produto.setMarca(marcaService.getById(1));
		produto.setPreco(2500.00);
		produto.setSubtipo(subtipoService.getById(1));
		produtoService.cadastrar(produto);
		return "testa";
	}
	
	@RequestMapping("/")
	public String testaIndex(){
		return "index";
	}
	
	@RequestMapping("/testa")
	public String testa(){
		return "testa";
	}
	
}
