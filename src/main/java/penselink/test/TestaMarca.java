package penselink.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import penselink.model.eao.MarcaEao;
import penselink.model.eaoImpl.MarcaEaoImpl;
import penselink.model.entidades.Marca;
import penselink.service.MarcaService;
import penselink.serviceImpl.MarcaServiceImpl;


public class TestaMarca {
	
public static void main (String[] args){
	MarcaServiceImpl marcaservice = new MarcaServiceImpl();
	
	Marca m = marcaservice.getById(1);
	System.out.println(m.getNome());
}
}
