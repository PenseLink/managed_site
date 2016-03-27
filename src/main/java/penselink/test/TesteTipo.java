package penselink.test;

import penselink.dao.TipoDAO;
import penselink.daoIMPL.TipoDAOIMPL;
import penselink.model.entidades.Tipo;

public class TesteTipo {
	
	public static void main(String[] args) {
		Tipo tipo = new Tipo();
		tipo.setDescricao("Informática");
		tipo.setNomeExibicao("Informática");
		
		
		TipoDAO dao = new TipoDAOIMPL();
		
		dao.salvar(tipo);
		
	}
}
