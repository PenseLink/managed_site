package penselink.service;

import penselink.model.entidades.Tipo;

public interface TipoService {
	public void cadastrar(Tipo tipo);
	
	public Tipo getById(Integer id);
}
