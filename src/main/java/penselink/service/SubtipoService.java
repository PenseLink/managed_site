package penselink.service;

import penselink.model.entidades.Subtipo;


public interface SubtipoService {
	public void cadastrar(Subtipo subtipo);
	
	public Subtipo getById(Integer id);
}
